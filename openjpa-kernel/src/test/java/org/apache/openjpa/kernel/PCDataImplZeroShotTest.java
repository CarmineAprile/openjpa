package org.apache.openjpa.kernel;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.BitSet;

import org.apache.openjpa.datacache.DataCache;
import org.apache.openjpa.enhance.PersistenceCapable;
import org.apache.openjpa.meta.ClassMetaData;
import org.apache.openjpa.meta.FieldMetaData;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class PCDataImplZeroShotTest {

    @Mock
    private ClassMetaData meta;

    @Mock
    private FieldMetaData fmd1;

    @Mock
    private FieldMetaData fmd2;

    @Mock
    private StateManagerImpl sm; // Uses StateManagerImpl to avoid ClassCastException in load()

    @Mock
    private BrokerImpl broker;

    @Mock
    private FetchConfiguration fetch;

    @Mock
    private PersistenceCapable pc;

    private PCDataImpl pcData;
    private final Object oid = "testOid";

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        // Setup ClassMetaData and Fields
        when(meta.getDescribedType()).thenReturn((Class) String.class);
        when(meta.getFields()).thenReturn(new FieldMetaData[] { fmd1, fmd2 });

        when(fmd1.getIndex()).thenReturn(0);
        when(fmd1.getManagement()).thenReturn(FieldMetaData.MANAGE_PERSISTENT);

        when(fmd2.getIndex()).thenReturn(1);
        when(fmd2.getManagement()).thenReturn(FieldMetaData.MANAGE_PERSISTENT);

        when(meta.getField(0)).thenReturn(fmd1);
        when(meta.getField(1)).thenReturn(fmd2);

        pcData = new PCDataImpl(oid, meta, "testCache");
    }

    @Test
    public void testConstructorsAndBasicGetters() {
        PCDataImpl defaultCacheData = new PCDataImpl(oid, meta);
        assertEquals(DataCache.NAME_DEFAULT, defaultCacheData.getCache());

        assertEquals(oid, pcData.getId());
        assertEquals(String.class, pcData.getType());
        assertEquals("testCache", pcData.getCache());

        BitSet loaded = pcData.getLoaded();
        assertNotNull(loaded);
        assertEquals(0, loaded.cardinality());
    }

    @Test
    public void testDataMethods() {
        assertNull(pcData.getData(0));
        assertFalse(pcData.isLoaded(0));

        Object val = "fieldValue";
        pcData.setData(0, val);

        assertTrue(pcData.isLoaded(0));
        assertEquals(val, pcData.getData(0));

        pcData.clearData(0);
        assertFalse(pcData.isLoaded(0));
        assertNull(pcData.getData(0));
    }

    @Test
    public void testImplDataMethods() {
        assertNull(pcData.getImplData());
        Object val = "implValue";
        pcData.setImplData(val);
        assertEquals(val, pcData.getImplData());
    }

    @Test
    public void testFieldImplDataMethods() {
        assertNull(pcData.getImplData(0));

        Object val = "fieldImplValue";
        pcData.setImplData(0, val);
        assertEquals(val, pcData.getImplData(0));

        pcData.setImplData(0, null);
        assertNull(pcData.getImplData(0));
    }

    @Test
    public void testIntermediateMethods() {
        Object val = "intermediateValue";

        pcData.setIntermediate(0, val);
        assertFalse(pcData.isLoaded(0));
        assertEquals(val, pcData.getIntermediate(0));

        // When loaded is explicitly set to true, getIntermediate should return null
        pcData.setLoaded(0, true);
        assertNull(pcData.getIntermediate(0));
    }

    @Test
    public void testVersionMethods() {
        assertNull(pcData.getVersion());
        Object version = 1L;
        pcData.setVersion(version);
        assertEquals(version, pcData.getVersion());
    }

    @Test
    public void testLoadAllFields() {
        when(sm.getMetaData()).thenReturn(meta);
        when(sm.getLoaded()).thenReturn(new BitSet(2)); // Fields not currently loaded in SM
        when(sm.getContext()).thenReturn(broker);
        when(fetch.requiresFetch(any(FieldMetaData.class))).thenReturn(1); // FETCH_LOAD

        // Setup intermediate data to verify it gets loaded
        pcData.setIntermediate(0, "interData");

        pcData.load(sm, fetch, new Object());

        verify(sm).setLoading(true);
        verify(sm).setIntermediate(0, "interData");
    }

    @Test
    public void testLoadWithBitSet() {
        when(sm.getMetaData()).thenReturn(meta);
        when(sm.getContext()).thenReturn(broker);
        when(sm.getObjectId()).thenReturn(oid);
        when(broker.isLoading(oid)).thenReturn(false);

        BitSet fieldsToLoad = new BitSet(2);
        fieldsToLoad.set(0);

        pcData.setLoaded(0, true); // Mark it as loaded in PCData so it proceeds to fetch from PCData
        pcData.setData(0, "dataValue");

        pcData.load(sm, fieldsToLoad, fetch, new Object());

        // The bit should be cleared after successfully loading
        assertFalse(fieldsToLoad.get(0));
        verify(sm).storeField(eq(0), any());
    }

    @Test
    public void testStoreAllFields() {
        when(sm.getMetaData()).thenReturn(meta);
        BitSet loaded = new BitSet(2);
        loaded.set(0);
        when(sm.getLoaded()).thenReturn(loaded);
        when(sm.getPersistenceCapable()).thenReturn(pc);
        when(pc.pcIsDetached()).thenReturn(false);
        when(sm.getContext()).thenReturn(broker);
        when(sm.fetchField(0, false)).thenReturn("storedValue");

        // Set up version and impl data
        when(sm.getVersion()).thenReturn(2L);
        when(sm.isImplDataCacheable()).thenReturn(true);
        when(sm.getImplData()).thenReturn("implDataCache");

        pcData.store(sm);

        assertTrue(pcData.isLoaded(0));
        assertEquals(2L, pcData.getVersion());
        assertEquals("implDataCache", pcData.getImplData());
    }

    @Test
    public void testStoreWithBitSet() {
        when(sm.getMetaData()).thenReturn(meta);
        when(sm.getPersistenceCapable()).thenReturn(pc);
        when(pc.pcIsDetached()).thenReturn(false);
        when(sm.getContext()).thenReturn(broker);
        when(sm.fetchField(1, false)).thenReturn("storedValue");

        BitSet fieldsToStore = new BitSet(2);
        fieldsToStore.set(1);

        pcData.store(sm, fieldsToStore);

        assertTrue(pcData.isLoaded(1));
        assertFalse(pcData.isLoaded(0));
    }

    @Test
    public void testStoreFieldWithDetachedStateManager() {
        when(sm.getMetaData()).thenReturn(meta);
        BitSet loaded = new BitSet(2);
        loaded.set(0);
        when(sm.getLoaded()).thenReturn(loaded);
        when(sm.getPersistenceCapable()).thenReturn(pc);
        when(pc.pcIsDetached()).thenReturn(true);
        when(sm.getContext()).thenReturn(broker);

        DetachedStateManager dsm = mock(DetachedStateManager.class);
        when(pc.pcGetStateManager()).thenReturn(dsm);

        pcData.store(sm);

        // Verify the DetachedStateManager was temporarily replaced and then restored
        verify(pc).pcReplaceStateManager(sm);
        verify(pc).pcReplaceStateManager(dsm);
    }

    @Test
    public void testStoreIntermediate() {
        when(sm.getMetaData()).thenReturn(meta);
        when(sm.getLoaded()).thenReturn(new BitSet(2)); // Nothing is loaded
        when(sm.getIntermediate(0)).thenReturn("interData");

        pcData.store(sm);

        // It should capture the intermediate data from the state manager
        assertEquals("interData", pcData.getIntermediate(0));
    }

    @Test
    public void testNewEmbeddedPCData() {
        when(sm.getId()).thenReturn("embeddedId");
        when(sm.getMetaData()).thenReturn(meta);

        AbstractPCData embedded = pcData.newEmbeddedPCData(sm);

        assertNotNull(embedded);
        assertTrue(embedded instanceof PCDataImpl);
        assertEquals("embeddedId", embedded.getId());
        assertEquals("testCache", ((PCDataImpl) embedded).getCache());
    }
}
