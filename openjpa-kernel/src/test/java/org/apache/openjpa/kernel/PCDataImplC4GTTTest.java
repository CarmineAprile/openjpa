package org.apache.openjpa.kernel;

import org.apache.openjpa.datacache.DataCache;
import org.apache.openjpa.kernel.AbstractPCData;
import org.apache.openjpa.kernel.FetchConfiguration;
import org.apache.openjpa.kernel.OpenJPAStateManager;
import org.apache.openjpa.kernel.PCDataImpl;
import org.apache.openjpa.meta.ClassMetaData;
import org.apache.openjpa.meta.FieldMetaData;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.BitSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PCDataImplC4GTTTest {

    private PCDataImpl pcData;

    @Mock
    private ClassMetaData mockMetaData;

    @Mock
    private FieldMetaData mockFieldMetaData1;

    @Mock
    private FieldMetaData mockFieldMetaData2;

    @Mock
    private OpenJPAStateManager mockStateManager;

    @Mock
    private FetchConfiguration mockFetchConfig;

    private static final String OID = "test-oid";
    private static final String CUSTOM_CACHE_NAME = "custom-cache";

    @Before
    public void setUp() {
        // Stub ClassMetaData to return a dummy type and an array of 2 fields
        doReturn(String.class).when(mockMetaData).getDescribedType();

        FieldMetaData[] fields = new FieldMetaData[] { mockFieldMetaData1, mockFieldMetaData2 };
        lenient().when(mockMetaData.getFields()).thenReturn(fields);
        lenient().when(mockFieldMetaData1.getIndex()).thenReturn(0);
        lenient().when(mockFieldMetaData2.getIndex()).thenReturn(1);

        // Initialize standard PCDataImpl
        pcData = new PCDataImpl(OID, mockMetaData, CUSTOM_CACHE_NAME);
    }

    // --- Basic Functionality Tests ---

    @Test
    public void testConstructorAndGetters() {
        assertEquals(OID, pcData.getId());
        assertEquals(String.class, pcData.getType());
        assertEquals(CUSTOM_CACHE_NAME, pcData.getCache());
        assertNotNull(pcData.getLoaded());
        assertEquals(0, pcData.getLoaded().cardinality());
    }

    @Test
    public void testDefaultConstructorCacheName() {
        PCDataImpl defaultPcData = new PCDataImpl(OID, mockMetaData);
        assertEquals(DataCache.NAME_DEFAULT, defaultPcData.getCache());
    }

    @Test
    public void testSetAndGetData() {
        assertNull(pcData.getData(0)); // Should be null initially

        pcData.setData(0, "Value0");
        assertTrue(pcData.isLoaded(0));
        assertEquals("Value0", pcData.getData(0));
    }

    @Test
    public void testClearData() {
        pcData.setData(1, "Value1");
        assertTrue(pcData.isLoaded(1));

        pcData.clearData(1);
        assertFalse(pcData.isLoaded(1));
        assertNull(pcData.getData(1)); // Cleared data should return null
    }

    @Test
    public void testVersion() {
        assertNull(pcData.getVersion());
        pcData.setVersion(123L);
        assertEquals(123L, pcData.getVersion());
    }

    @Test
    public void testGlobalImplData() {
        assertNull(pcData.getImplData());
        pcData.setImplData("GlobalImpl");
        assertEquals("GlobalImpl", pcData.getImplData());
    }

    @Test
    public void testIntermediateData() {
        // Set intermediate bypasses loaded check but stores in data array
        pcData.setIntermediate(0, "IntermediateVal");
        assertFalse(pcData.isLoaded(0));
        assertEquals("IntermediateVal", pcData.getIntermediate(0));

        // If loaded is true, getIntermediate should return null
        pcData.setData(0, "ActualVal");
        assertTrue(pcData.isLoaded(0));
        assertNull(pcData.getIntermediate(0));
    }

    @Test
    public void testSetLoaded() {
        pcData.setLoaded(0, true);
        assertTrue(pcData.isLoaded(0));

        pcData.setLoaded(0, false);
        assertFalse(pcData.isLoaded(0));
    }

    @Test
    public void testNewEmbeddedPCData() {
        when(mockStateManager.getId()).thenReturn("embedded-oid");
        when(mockStateManager.getMetaData()).thenReturn(mockMetaData);

        AbstractPCData embedded = pcData.newEmbeddedPCData(mockStateManager);
        assertNotNull(embedded);
        assertEquals("embedded-oid", embedded.getId());
        assertEquals(CUSTOM_CACHE_NAME, ((PCDataImpl)embedded).getCache());
    }

    // --- Edge Cases and Exception Handling Tests ---

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetDataNegativeIndexThrowsException() {
        pcData.setData(-1, "Error");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetDataOutOfBoundsIndexThrowsException() {
        // We mocked 2 fields, so index 2 should throw an exception in the underlying BitSet or Array
        pcData.setData(2, "Error");
    }

    @Test
    public void testSetImplDataLazyInitializationEdgeCases() {
        // Case 1: fieldImpl is null, we request data
        assertNull(pcData.getImplData(0));

        // Case 2: fieldImpl is null, we set val to null. Should NOT initialize array.
        pcData.setImplData(0, null);
        assertNull(pcData.getImplData(0));

        // Case 3: Proper initialization
        pcData.setImplData(0, "FieldImplData");
        assertEquals("FieldImplData", pcData.getImplData(0));

        // Case 4: fieldImpl initialized, set back to null
        pcData.setImplData(0, null);
        assertNull(pcData.getImplData(0));
    }

    @Test
    public void testLoadWithNullFieldsBitSet() {
        // Setup minimal mocks to bypass deep load logic just to test the null safety
        when(mockStateManager.getVersion()).thenReturn(null);

        // Passing null for BitSet fields. The method handles it gracefully without NPE.
        pcData.load(mockStateManager, null, mockFetchConfig, new Object());

        // Verify loadVersion was called implicitly via behavior
        verify(mockStateManager).setVersion(any());
    }

}
