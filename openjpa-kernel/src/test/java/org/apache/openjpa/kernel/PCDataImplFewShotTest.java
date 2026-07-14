package org.apache.openjpa.kernel;

import org.apache.openjpa.datacache.DataCache;
import org.apache.openjpa.enhance.PersistenceCapable;
import org.apache.openjpa.meta.ClassMetaData;
import org.apache.openjpa.meta.FieldMetaData;
import org.junit.Before;
import org.junit.Test;

import java.util.BitSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PCDataImplFewShotTest {

    private PCDataImpl pcData;
    private ClassMetaData metaMock;
    private StateManagerImpl smMock;
    private BrokerImpl brokerMock;
    private BitSet loadedFields;
    private FieldMetaData fmd0;
    private FieldMetaData fmd1;

    @Before
    public void setUp() {
        // Mock ClassMetaData
        metaMock = mock(ClassMetaData.class);
        when(metaMock.getDescribedType()).thenReturn((Class) String.class);

        // Mock FieldMetaData
        fmd0 = mock(FieldMetaData.class);
        when(fmd0.getIndex()).thenReturn(0);
        when(fmd0.getManagement()).thenReturn(FieldMetaData.MANAGE_PERSISTENT);

        fmd1 = mock(FieldMetaData.class);
        when(fmd1.getIndex()).thenReturn(1);
        when(fmd1.getManagement()).thenReturn(FieldMetaData.MANAGE_PERSISTENT);

        FieldMetaData[] fmds = new FieldMetaData[]{fmd0, fmd1};
        when(metaMock.getFields()).thenReturn(fmds);
        when(metaMock.getField(0)).thenReturn(fmd0);
        when(metaMock.getField(1)).thenReturn(fmd1);

        // Initialize PCDataImpl
        pcData = new PCDataImpl("oid-123", metaMock, DataCache.NAME_DEFAULT);

        // Mock StateManagerImpl (needs to be StateManagerImpl due to cast in load() method)
        smMock = mock(StateManagerImpl.class);
        loadedFields = new BitSet(2);
        when(smMock.getLoaded()).thenReturn(loadedFields);
        when(smMock.getMetaData()).thenReturn(metaMock);

        // Mock PersistenceCapable for storeField execution
        PersistenceCapable pcMock = mock(PersistenceCapable.class);
        when(smMock.getPersistenceCapable()).thenReturn(pcMock);
        when(pcMock.pcIsDetached()).thenReturn(false);

        // Mock BrokerImpl (StoreContext)
        brokerMock = mock(BrokerImpl.class);
        when(smMock.getContext()).thenReturn(brokerMock);
    }

    // =========================================================================
    // User Provided Test Cases
    // =========================================================================

    @Test
    public void testCase1_Store() {
        // - A1: sm non nullo
        // - B2: sm vuoto (BitSet vuoto)
        // Oracolo: Il metodo non deve alterare la cache di PCDataImpl -> isLoaded() deve restituire false per tutti gli indici

        // loadedFields è vuoto (comportamento di default definito nel setUp)
        pcData.store(smMock);
        assertFalse("Il campo 0 NON dovrebbe essere caricato", pcData.isLoaded(0));
        assertFalse("Il campo 1 NON dovrebbe essere caricato", pcData.isLoaded(1));
    }

    @Test
    public void testCase2_Store() {
        // - A1: sm non nullo
        // - B1: sm contiene alcuni campi caricati
        // Oracolo: pcDataImpl memorizza solo i fields attivi

        // Primo field attivato
        loadedFields.set(0);

        // Mock version for testing storeVersion logic
        when(smMock.getVersion()).thenReturn("v1");

        pcData.store(smMock);

        assertTrue("Il campo 0 deve essere isLoaded() == true in PCData", pcData.isLoaded(0));
        assertFalse("Il campo 1 deve essere isLoaded() == false in PCData", pcData.isLoaded(1));
        assertEquals("La versione di PCData deve essere aggiornata a quella dello StateManager", "v1", pcData.getVersion());
    }

    // =========================================================================
    // Comprehensive Test Cases for Remaining Methods
    // =========================================================================

    @Test
    public void testConstructorAndBasicGetters() {
        assertEquals("getId should return the OID", "oid-123", pcData.getId());
        assertEquals("getType should return the described type", String.class, pcData.getType());
        assertEquals("getCache should return the provided cache name", DataCache.NAME_DEFAULT, pcData.getCache());
        assertNotNull("getLoaded should not be null", pcData.getLoaded());
        assertEquals("getLoaded should be size of fields", 0, pcData.getLoaded().cardinality()); // empty initially
    }

    @Test
    public void testSetAndGetData() {
        // - A1: Set data on an index
        // Oracolo: The loaded bitset should reflect the index, and data should be retrieved

        pcData.setData(0, "FieldValue1");

        assertTrue("Index 0 should be loaded", pcData.isLoaded(0));
        assertEquals("Data at index 0 should match", "FieldValue1", pcData.getData(0));

        // Data for index 1 should still be null and not loaded
        assertFalse("Index 1 should not be loaded", pcData.isLoaded(1));
        assertNull("Data at index 1 should be null", pcData.getData(1));
    }

    @Test
    public void testClearData() {
        // - A1: Add data, then clear it
        // Oracolo: Data should become null and index should no longer be marked as loaded

        pcData.setData(1, "TempData");
        assertTrue(pcData.isLoaded(1));

        pcData.clearData(1);

        assertFalse("Index 1 should no longer be loaded after clear", pcData.isLoaded(1));
        assertNull("Data at index 1 should be null after clear", pcData.getData(1));
    }

    @Test
    public void testGlobalImplData() {
        // - A1: Set and Get global impl data
        // Oracolo: It should store and retrieve the object exactly as provided

        Object implDataObj = new Object();
        assertNull("ImplData should initially be null", pcData.getImplData());

        pcData.setImplData(implDataObj);
        assertEquals("ImplData should match the set object", implDataObj, pcData.getImplData());
    }

    @Test
    public void testFieldLevelImplData() {
        // - A1: Set field level impl data for specific indices
        // Oracolo: Must dynamically create the array and store correctly

        Object fieldImpl0 = new Object();

        assertNull("Field 0 ImplData should initially be null", pcData.getImplData(0));

        pcData.setImplData(0, fieldImpl0);
        assertEquals("Field 0 ImplData should match the set object", fieldImpl0, pcData.getImplData(0));
        assertNull("Field 1 ImplData should still be null", pcData.getImplData(1));

        // Clear field level impl data
        pcData.setImplData(0, null);
        assertNull("Field 0 ImplData should be null after clearing", pcData.getImplData(0));
    }

    @Test
    public void testIntermediateData() {
        // - A1: Set intermediate data
        // Oracolo: The loaded bit for the index must be cleared, but the data is held internally

        pcData.setData(0, "ActualData"); // sets loaded to true
        pcData.setIntermediate(0, "IntermediateValue");

        assertFalse("Setting intermediate data should clear the loaded bit", pcData.isLoaded(0));
        assertEquals("getIntermediate should return the intermediate value", "IntermediateValue", pcData.getIntermediate(0));
        assertNull("getData should return null since it is intermediate, not loaded", pcData.getData(0));
    }

    @Test
    public void testSetLoaded() {
        // - A1: Explicitly set loaded flags
        // Oracolo: The underlying bitset is properly modified

        pcData.setLoaded(0, true);
        assertTrue(pcData.isLoaded(0));

        pcData.setLoaded(0, false);
        assertFalse(pcData.isLoaded(0));
    }

    @Test
    public void testLoad_AllFields() {
        // - A1: Execute the load method requesting full sync
        // Oracolo: Should interact with state manager to load version, impl data, and fields

        FetchConfiguration fetchMock = mock(FetchConfiguration.class);
        when(fetchMock.requiresFetch(fmd0)).thenReturn(FetchConfiguration.FETCH_LOAD);
        when(fetchMock.requiresFetch(fmd1)).thenReturn(FetchConfiguration.FETCH_LOAD);

        pcData.setVersion("v2");
        pcData.setImplData("globalImpl");
        pcData.setData(0, "val0");

        pcData.load(smMock, fetchMock, null);

        verify(smMock).setVersion("v2");
        verify(smMock).setImplData("globalImpl", true);
        verify(smMock).setLoading(true);
        verify(smMock).storeField(eq(0), any());
    }

    @Test
    public void testLoad_WithBitSet() {
        // - A1: Execute the load method using a specific BitSet
        // Oracolo: Only the fields specified in the BitSet should be attempted to load

        FetchConfiguration fetchMock = mock(FetchConfiguration.class);
        BitSet fieldsToLoad = new BitSet(2);
        fieldsToLoad.set(1); // Only load field 1

        pcData.setData(1, "val1");

        pcData.load(smMock, fieldsToLoad, fetchMock, null);

        verify(smMock).setVersion(any());
        // Since field 0 is not in the bitset, storeField should not be called for 0
        verify(smMock, never()).storeField(eq(0), any());
        // Field 1 was in bitset and is loaded in PCData, so storeField should be called
        verify(smMock).storeField(eq(1), any());

        // The BitSet should be cleared for the loaded indices
        assertFalse("BitSet for index 1 should be cleared after loading", fieldsToLoad.get(1));
    }

    @Test
    public void testStore_WithBitSet() {
        // - A1: Store using a specific BitSet filter
        // Oracolo: Only the fields specified in the BitSet are stored into PCDataImpl

        BitSet fieldsToStore = new BitSet(2);
        fieldsToStore.set(1); // Tell store method to only look at index 1

        // Assume smMock has index 1 loaded
        loadedFields.set(1);

        pcData.store(smMock, fieldsToStore);

        assertFalse("Field 0 was not in BitSet, should not be loaded", pcData.isLoaded(0));
        assertTrue("Field 1 was in BitSet, should be loaded", pcData.isLoaded(1));
    }

    @Test
    public void testNewEmbeddedPCData() {
        // - A1: Request a new embedded PCData instance
        // Oracolo: Returns a new PCDataImpl properly initialized using SM properties

        when(smMock.getId()).thenReturn("embedded-oid");
        when(smMock.getMetaData()).thenReturn(metaMock);

        AbstractPCData embedded = pcData.newEmbeddedPCData(smMock);

        assertNotNull(embedded);
        assertTrue(embedded instanceof PCDataImpl);
        assertEquals("embedded-oid", embedded.getId());
        assertEquals("Should inherit the cache name", DataCache.NAME_DEFAULT, ((PCDataImpl) embedded).getCache());
    }
}
