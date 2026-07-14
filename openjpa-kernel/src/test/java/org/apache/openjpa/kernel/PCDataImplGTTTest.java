package org.apache.openjpa.kernel;

import org.apache.openjpa.datacache.DataCache;
import org.apache.openjpa.meta.ClassMetaData;
import org.apache.openjpa.meta.FieldMetaData;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.BitSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PCDataImplGTTTest {

    private PCDataImpl pcData;

    @Mock
    private ClassMetaData mockMetaData;

    @Mock
    private FieldMetaData mockField1;

    @Mock
    private FieldMetaData mockField2;

    @Mock
    private OpenJPAStateManager mockStateManager;

    private Object oid = 12345L;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        // Setup MetaData mock to return a described type and 2 fields
        doReturn(String.class).when(mockMetaData).getDescribedType();
        FieldMetaData[] fields = new FieldMetaData[]{mockField1, mockField2};
        when(mockMetaData.getFields()).thenReturn(fields);
        when(mockField1.getIndex()).thenReturn(0);
        when(mockField2.getIndex()).thenReturn(1);

        // Initialize standard instance
        pcData = new PCDataImpl(oid, mockMetaData, "TestCache");
    }

    // --- BASIC FUNCTIONALITY TESTS (Bob's cases) ---

    @Test
    public void testConstructorAndBasicGetters() {
        assertEquals(oid, pcData.getId());
        assertEquals(String.class, pcData.getType());
        assertEquals("TestCache", pcData.getCache());

        // Test default constructor behavior for DataCache name
        PCDataImpl defaultPcData = new PCDataImpl(oid, mockMetaData);
        assertEquals(DataCache.NAME_DEFAULT, defaultPcData.getCache());
    }

    @Test
    public void testDataManagement() {
        assertFalse(pcData.isLoaded(0));

        // Set Data
        pcData.setData(0, "FieldValue");
        assertTrue(pcData.isLoaded(0));
        assertEquals("FieldValue", pcData.getData(0));

        // Clear Data
        pcData.clearData(0);
        assertFalse(pcData.isLoaded(0));
        assertNull(pcData.getData(0));
    }

    @Test
    public void testIntermediateData() {
        // Intermediate data is set but loaded flag is cleared
        pcData.setIntermediate(1, "IntermediateValue");
        assertFalse(pcData.isLoaded(1));
        assertEquals("IntermediateValue", pcData.getIntermediate(1));
    }

    @Test
    public void testVersionManagement() {
        assertNull(pcData.getVersion());
        pcData.setVersion(99);
        assertEquals(99, pcData.getVersion());
    }

    @Test
    public void testImplDataManagement() {
        // Class level
        assertNull(pcData.getImplData());
        pcData.setImplData("ClassImpl");
        assertEquals("ClassImpl", pcData.getImplData());

        // Field level
        pcData.setImplData(0, "Field0Impl");
        assertEquals("Field0Impl", pcData.getImplData(0));
    }

    // --- EDGE CASE & EXCEPTION TESTS (Charlie's cases) ---

    @Test
    public void testGetDataOnUnloadedIndexReturnsNull() {
        // Even if data array somehow had data, if _loaded is false, it must return null
        pcData.setIntermediate(0, "HiddenValue"); // Sets data but clears _loaded flag
        assertFalse(pcData.isLoaded(0));
        assertNull("getData should return null if index is not loaded", pcData.getData(0));
    }

    @Test
    public void testFieldImplLazyInitialization_GetBeforeSet() {
        // _fieldImpl is null initially. Getting should not throw NPE.
        assertNull(pcData.getImplData(0));
    }

    @Test
    public void testFieldImplLazyInitialization_SetNullBeforeInit() {
        // Setting null when _fieldImpl is null should just bypass and not throw NPE
        pcData.setImplData(0, null);
        assertNull(pcData.getImplData(0));
    }

    @Test
    public void testFieldImplLazyInitialization_ClearAfterSet() {
        // Set a value to initialize the array
        pcData.setImplData(0, "Value");
        assertEquals("Value", pcData.getImplData(0));

        // Now set back to null to hit the `else if (_fieldImpl != null)` branch
        pcData.setImplData(0, null);
        assertNull(pcData.getImplData(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetDataOutOfBoundsThrowsException() {
        // We only mocked 2 fields, so index 2 should throw an exception
        pcData.setData(2, "OutOfBounds");
    }

    // --- LOAD/STORE BEHAVIOR TESTS ---

    @Test
    public void testStoreVersion() {
        when(mockStateManager.getVersion()).thenReturn(100);
        pcData.storeVersion(mockStateManager);
        assertEquals(100, pcData.getVersion());
    }

    @Test
    public void testNewEmbeddedPCData() {
        when(mockStateManager.getId()).thenReturn(54321L);
        when(mockStateManager.getMetaData()).thenReturn(mockMetaData);

        AbstractPCData embeddedData = pcData.newEmbeddedPCData(mockStateManager);

        assertTrue(embeddedData instanceof PCDataImpl);
        assertEquals(54321L, embeddedData.getId());
        // Verify it inherits the same cache name
        assertEquals("TestCache", ((PCDataImpl)embeddedData).getCache());
    }
}
