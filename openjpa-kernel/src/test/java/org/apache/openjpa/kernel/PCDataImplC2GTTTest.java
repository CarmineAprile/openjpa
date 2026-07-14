package org.apache.openjpa.kernel;

import org.apache.openjpa.datacache.DataCache;
import org.apache.openjpa.kernel.FetchConfiguration;
import org.apache.openjpa.kernel.OpenJPAStateManager;
import org.apache.openjpa.meta.ClassMetaData;
import org.apache.openjpa.meta.FieldMetaData;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

//import javax.persistence.Id;
import java.util.BitSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PCDataImplC2GTTTest {

    private PCDataImpl pcData;

    @Mock
    private ClassMetaData mockMetaData;

    @Mock
    private FieldMetaData mockFieldMetaData;

    @Mock
    private OpenJPAStateManager mockStateManager;

    @Mock
    private FetchConfiguration mockFetchConfig;

    private final String TEST_OID = "test-oid-123";
    private final int FIELD_COUNT = 3;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        // Mocking the MetaData to simulate 3 fields in a persistent class
        FieldMetaData[] fmds = new FieldMetaData[FIELD_COUNT];
        for (int i = 0; i < FIELD_COUNT; i++) {
            fmds[i] = mockFieldMetaData;
        }

        when(mockMetaData.getFields()).thenReturn(fmds);
        doReturn(String.class).when(mockMetaData).getDescribedType();

        pcData = new PCDataImpl(TEST_OID, mockMetaData);
    }

    // --- CONSTRUCTOR & GETTER TESTS ---

    @Test
    public void testConstructorsAndBasicGetters() {
        assertEquals(TEST_OID, pcData.getId());
        assertEquals(String.class, pcData.getType());
        assertEquals(DataCache.NAME_DEFAULT, pcData.getCache());

        // Test explicit cache name constructor
        PCDataImpl customCacheData = new PCDataImpl(TEST_OID, mockMetaData, "CustomCache");
        assertEquals("CustomCache", customCacheData.getCache());
    }

    @Test
    public void testEmptyMetaDataFieldsEdgeCase() {
        when(mockMetaData.getFields()).thenReturn(new FieldMetaData[0]);
        PCDataImpl emptyData = new PCDataImpl(TEST_OID, mockMetaData);

        // BitSet and Object[] should initialize to size 0 without crashing
        assertNotNull(emptyData.getLoaded());
        boolean exceptionThrown = false;
        try {
            emptyData.setData(0, "val");
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptionThrown = true;
        }
        assertTrue("Setting data on 0-length fields should throw OutOfBounds", exceptionThrown);
    }

    // --- DATA ARRAY TESTS ---

    @Test
    public void testDataOperations() {
        assertNull("Data should initially be null", pcData.getData(0));
        assertFalse("BitSet should initially be false", pcData.isLoaded(0));

        pcData.setData(0, "FirstValue");

        assertTrue("BitSet should be set to true", pcData.isLoaded(0));
        assertEquals("FirstValue", pcData.getData(0));

        pcData.clearData(0);
        assertFalse("BitSet should be cleared", pcData.isLoaded(0));
        assertNull("Data should be cleared", pcData.getData(0));
    }

    @Test
    public void testGetDataUnloadedEdgeCase() {
        // Manipulate internal array without setting BitSet (simulate intermediate state)
        pcData.setIntermediate(1, "HiddenValue");

        assertFalse("Should be marked as unloaded", pcData.isLoaded(1));
        assertNull("getData should return null because index is not loaded", pcData.getData(1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSetDataOutOfBoundsException() {
        // We initialized with 3 fields (indexes 0, 1, 2). 3 should throw an exception.
        pcData.setData(FIELD_COUNT, "OutOfBounds");
    }

    // --- IMPLDATA TESTS ---

    @Test
    public void testGlobalImplData() {
        assertNull(pcData.getImplData());
        pcData.setImplData("GlobalImplData");
        assertEquals("GlobalImplData", pcData.getImplData());
    }

    @Test
    public void testIndexedImplDataLazyInitializationAndEdgeCases() {
        // 1. Array is initially null. getImplData(index) safely returns null.
        assertNull(pcData.getImplData(0));

        // 2. Setting null when array is null (Should do nothing, safely handles it)
        pcData.setImplData(0, null);
        assertNull(pcData.getImplData(0));

        // 3. Setting a real value (Lazily instantiates the fieldImpl array)
        pcData.setImplData(0, "ImplValue0");
        assertEquals("ImplValue0", pcData.getImplData(0));

        // 4. Setting null when array IS instantiated
        pcData.setImplData(0, null);
        assertNull("Should be successfully nulled out", pcData.getImplData(0));
    }

    // --- INTERMEDIATE & VERSION TESTS ---

    @Test
    public void testIntermediateData() {
        // Intermediate explicitly clears the loaded flag
        pcData.setIntermediate(2, "InterValue");

        assertFalse("Loaded bit should be cleared by setIntermediate", pcData.isLoaded(2));
        assertEquals("InterValue", pcData.getIntermediate(2));

        // If we force the loaded bit to true, getIntermediate should return null
        pcData.setLoaded(2, true);
        assertNull("getIntermediate returns null if loaded is true", pcData.getIntermediate(2));
    }

    @Test
    public void testVersionOperations() {
        assertNull(pcData.getVersion());
        pcData.setVersion(1L);
        assertEquals(1L, pcData.getVersion());
    }

    // --- LOAD & STORE TESTS (Mocked Interactions) ---

    @Test
    @Ignore
    public void testStoreVersionAndImplData() {
        // Setup StateManager mock
        when(mockStateManager.getVersion()).thenReturn(42L);
        when(mockStateManager.isImplDataCacheable()).thenReturn(true);
        when(mockStateManager.getImplData()).thenReturn("SmImplData");
        when(mockStateManager.getMetaData()).thenReturn(mockMetaData);

        // Call Store
        pcData.store(mockStateManager);

        // Verify state was extracted from StateManager and stored into PCDataImpl
        assertEquals(42L, pcData.getVersion());
        assertEquals("SmImplData", pcData.getImplData());

        // Verify mock interactions
        verify(mockStateManager, atLeastOnce()).getVersion();
        verify(mockStateManager, atLeastOnce()).getImplData();
    }

    @Test
    public void testLoadEmptyFieldsEdgeCase() {
        // Setup StateManager
        when(mockStateManager.getVersion()).thenReturn(null); // Force loading version
        when(mockStateManager.getMetaData()).thenReturn(mockMetaData);

        pcData.setVersion(99L);
        pcData.setImplData("CachedImplData");

        // Execute load with an empty BitSet
        BitSet emptyFields = new BitSet();
        pcData.load(mockStateManager, emptyFields, mockFetchConfig, new Object());

        // Verify version and impl data are pushed TO the StateManager
        verify(mockStateManager).setVersion(99L);
        verify(mockStateManager).setImplData("CachedImplData", true);

        // Verify no fields were fetched since BitSet was empty
        verify(mockStateManager, never()).storeField(anyInt(), any());
    }

    @Test
    public void testNewEmbeddedPCData() {
        when(mockStateManager.getId()).thenReturn("embedded-id");
        when(mockStateManager.getMetaData()).thenReturn(mockMetaData);

        AbstractPCData embeddedData = pcData.newEmbeddedPCData(mockStateManager);

        assertNotNull(embeddedData);
        assertEquals("embedded-id", embeddedData.getId());
        assertEquals(pcData.getCache(), ((PCDataImpl)embeddedData).getCache());
    }
}
