package org.apache.openjpa.kernel;

import org.apache.openjpa.datacache.DataCache;
import org.apache.openjpa.kernel.AbstractPCData;
import org.apache.openjpa.kernel.FetchConfiguration;
import org.apache.openjpa.kernel.OpenJPAStateManager;
import org.apache.openjpa.kernel.PCDataImpl;
import org.apache.openjpa.meta.ClassMetaData;
import org.apache.openjpa.meta.FieldMetaData;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.Serializable;
import java.util.BitSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PCDataImplC1GTTTest {

    private PCDataImpl pcData;

    @Mock
    private ClassMetaData metaMock;
    @Mock
    private OpenJPAStateManager smMock;
    @Mock
    private FetchConfiguration fetchMock;

    private static final String OID = "test-oid-123";
    private static final String CACHE_NAME = "test-cache";
    private static final int FIELD_COUNT = 3;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        // Mock ClassMetaData behavior required by PCDataImpl constructor
        FieldMetaData[] fields = new FieldMetaData[FIELD_COUNT];
        for (int i = 0; i < FIELD_COUNT; i++) {
            fields[i] = mock(FieldMetaData.class);
            when(fields[i].getIndex()).thenReturn(i);
        }

        doReturn(String.class).when(metaMock).getDescribedType();
        when(metaMock.getFields()).thenReturn(fields);

        pcData = new PCDataImpl(OID, metaMock, CACHE_NAME);
    }

    // --- Constructor & Basic Getter Tests ---

    @Test
    public void testConstructorsAndBasicGetters() {
        assertEquals(OID, pcData.getId());
        assertEquals(String.class, pcData.getType());
        assertEquals(CACHE_NAME, pcData.getCache());
        assertNotNull(pcData.getLoaded());
        assertEquals(0, pcData.getLoaded().cardinality());

        // Test default constructor routing
        PCDataImpl defaultPcData = new PCDataImpl(OID, metaMock);
        assertEquals(DataCache.NAME_DEFAULT, defaultPcData.getCache());
    }

    // --- Data Access Tests (Basic & Edge Cases) ---

    @Test
    public void testSetAndGetData() {
        int index = 1;
        String testVal = "fieldValue";

        // Initially not loaded
        assertNull(pcData.getData(index));
        assertFalse(pcData.isLoaded(index));

        // Set data
        pcData.setData(index, testVal);

        // Verify state changes
        assertTrue(pcData.isLoaded(index));
        assertEquals(testVal, pcData.getData(index));
    }

    @Test
    public void testClearData() {
        int index = 0;
        pcData.setData(index, "tempValue");
        assertTrue(pcData.isLoaded(index));

        pcData.clearData(index);
        assertFalse(pcData.isLoaded(index));
        assertNull(pcData.getData(index));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSetDataOutOfBoundsException() {
        // FIELD_COUNT is 3, valid indices are 0, 1, 2. Index 5 should throw.
        pcData.setData(5, "outOfBounds");
    }

    // --- ImplData Tests (Basic & Edge Cases) ---

    @Test
    public void testSetAndGetGlobalImplData() {
        assertNull(pcData.getImplData());
        String implData = "globalImplData";
        pcData.setImplData(implData);
        assertEquals(implData, pcData.getImplData());
    }

    @Test
    public void testIndexedImplDataLazyInitialization() {
        int index = 1;

        // Assert fieldImpl array is null initially and handles safely
        assertNull(pcData.getImplData(index));

        // Setting a null value shouldn't instantiate the array
        pcData.setImplData(index, null);
        assertNull(pcData.getImplData(index));

        // Setting a valid value should instantiate the array
        String val = "indexedImpl";
        pcData.setImplData(index, val);
        assertEquals(val, pcData.getImplData(index));

        // Setting it back to null should clear the specific index
        pcData.setImplData(index, null);
        assertNull(pcData.getImplData(index));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testIndexedImplDataOutOfBoundsException() {
        // Will throw because inner fieldImpl array takes size of data array (3)
        pcData.setImplData(10, "implVal");
    }

    // --- Intermediate Data Tests ---

    @Test
    public void testIntermediateData() {
        int index = 2;
        String val = "interVal";

        pcData.setIntermediate(index, val);

        // Intermediate data shouldn't flag as "loaded"
        assertFalse(pcData.isLoaded(index));
        assertEquals(val, pcData.getIntermediate(index));

        // If we explicitly load it, getIntermediate should return null
        pcData.setLoaded(index, true);
        assertNull(pcData.getIntermediate(index));
    }

    // --- Version Tests ---

    @Test
    public void testVersionManagement() {
        assertNull(pcData.getVersion());
        Long version = 12345L;
        pcData.setVersion(version);
        assertEquals(version, pcData.getVersion());
    }

    // --- Load & Store Synchronization Tests (Mocks) ---

    @Test
    public void testStoreVersionAndImplData() {
        // Setup StateManager mock with data
        Long smVersion = 999L;
        String smImpl = "smImplData";

        when(smMock.getVersion()).thenReturn(smVersion);
        when(smMock.isImplDataCacheable()).thenReturn(true);
        when(smMock.getImplData()).thenReturn(smImpl);

        // Since store() calls storeField which depends on AbstractPCData.toData
        // We will test an empty bitset iteration to avoid AbstractPCData dependencies
        when(smMock.getMetaData()).thenReturn(metaMock);
        when(smMock.getLoaded()).thenReturn(new BitSet(FIELD_COUNT));

        pcData.store(smMock, new BitSet(FIELD_COUNT)); // Using BitSet overload

        // Verify PCDataImpl captured state from the StateManager
        assertEquals(smVersion, pcData.getVersion());
        assertEquals(smImpl, pcData.getImplData());

        // Verify mock interactions
        verify(smMock, times(1)).getVersion();
        verify(smMock, times(1)).getImplData();
    }

    @Test
    public void testNewEmbeddedPCData() {
        when(smMock.getId()).thenReturn("embed-oid");
        when(smMock.getMetaData()).thenReturn(metaMock);

        AbstractPCData embeddedData = pcData.newEmbeddedPCData(smMock);

        assertNotNull(embeddedData);
        assertTrue(embeddedData instanceof PCDataImpl);
        assertEquals("embed-oid", embeddedData.getId());
        assertEquals(CACHE_NAME, ((PCDataImpl) embeddedData).getCache());
    }
}
