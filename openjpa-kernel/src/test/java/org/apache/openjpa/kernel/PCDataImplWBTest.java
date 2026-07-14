package org.apache.openjpa.kernel;

import org.apache.openjpa.enhance.PersistenceCapable;
import org.apache.openjpa.meta.ClassMetaData;
import org.apache.openjpa.meta.FieldMetaData;
import org.junit.Before;
import org.junit.Test;

import java.util.BitSet;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class PCDataImplWBTest {

    private PCDataImpl pcData;
    private ClassMetaData metaMock;
    private StateManagerImpl smImplMock;
    private FetchConfiguration fetchMock;
    private BitSet smLoadedFields;

    @Before
    public void setUp() {
        // Setup dei MetaDati (usiamo un solo campo per semplicità nei test WB)
        metaMock = mock(ClassMetaData.class);
        FieldMetaData fmd0 = mock(FieldMetaData.class);
        when(fmd0.getIndex()).thenReturn(0);
        when(fmd0.getManagement()).thenReturn(FieldMetaData.MANAGE_PERSISTENT);

        FieldMetaData[] fields = new FieldMetaData[] { fmd0 };
        when(metaMock.getFields()).thenReturn(fields);
        when(metaMock.getPrimaryKeyFields()).thenReturn(new FieldMetaData[0]);
        when(metaMock.getField(0)).thenReturn(fmd0);

        // Inizializzazione SUT
        pcData = new PCDataImpl("test_oid", metaMock);

        // Setup dello StateManager
        PersistenceCapable pcMock = mock(PersistenceCapable.class);
        smImplMock = mock(StateManagerImpl.class);
        when(smImplMock.getMetaData()).thenReturn(metaMock);
        when(smImplMock.getPersistenceCapable()).thenReturn(pcMock);
        when(smImplMock.getObjectId()).thenReturn("test_oid");

        smLoadedFields = new BitSet();
        when(smImplMock.getLoaded()).thenReturn(smLoadedFields);

        // Setup Fetch Configuration di default
        fetchMock = mock(FetchConfiguration.class);
        when(fetchMock.requiresFetch(any())).thenReturn(FetchConfiguration.FETCH_LOAD);
    }

    // =========================================================================
    // WB TESTS PER: store(OpenJPAStateManager sm)
    // =========================================================================

    @Test
    public void testStore_WB1() {
        // Obiettivo: Coprire il ramo Falso di "else if (!isLoaded(i))"

        // Setup: Il campo 0 è presente nella cache di PCData
        pcData.setLoaded(0, true);
        smLoadedFields.set(0, false);
        pcData.store(smImplMock);

        assertTrue("Il campo 0 deve rimanere caricato nella cache di PCData", pcData.isLoaded(0));
        verify(smImplMock, never()).fetchObject(anyInt());
        verify(smImplMock, never()).fetchString(anyInt());
    }

    @Test
    public void testStore_WB2() {
        // Obiettivo: Coprire il ramo Falso di "else if (!isLoaded(i))" nella seconda firma
        pcData.setLoaded(0, true);
        smLoadedFields.set(0, false);

        BitSet targetFields = new BitSet();
        targetFields.set(0); // Vogliamo salvare il campo 0
        pcData.store(smImplMock, targetFields);

        assertTrue("Il campo 0 deve rimanere intatto nella cache", pcData.isLoaded(0));
        verify(smImplMock, never()).fetchObject(anyInt());
        verify(smImplMock, never()).fetchString(anyInt());
    }

    // =========================================================================
    // WB TESTS PER: load(OpenJPAStateManager sm, FetchConfiguration fetch, Object context)
    // =========================================================================

    @Test
    public void testLoad_WB1() {
        // Obiettivo: Coprire il ramo in cui la prima condizione (!sm.getLoaded().get(i)) è FALSA.
        pcData.setLoaded(0, true); // È in cache
        // Il campo è GIA' caricato nello StateManager
        smLoadedFields.set(0, true);
        pcData.load(smImplMock, fetchMock, null);
        verify(smImplMock, never()).storeField(anyInt(), any());
    }

    @Test
    public void testLoad_WB2() {
        // Obiettivo: Coprire il ramo in cui la seconda condizione (fetch != FETCH_NONE) è FALSA.
        pcData.setLoaded(0, true); // È in cache
        smLoadedFields.set(0, false); // NON è nello StateManager
        // Forziamo il Fetch Plan a ignorare il campo (FETCH_NONE)
        when(fetchMock.requiresFetch(any())).thenReturn(FetchConfiguration.FETCH_NONE);

        pcData.load(smImplMock, fetchMock, null);
        verify(smImplMock, never()).storeField(anyInt(), any());
    }

    // ===================================================================================================
    // WB TESTS PER: load(OpenJPAStateManager sm, BitSet fields, FetchConfiguration fetch, Object context)
    // ===================================================================================================

    @Test
    public void testLoad_WB3() {
        // Obiettivo: Coprire i rami di transizione di stato del Broker e il controllo "|| loading"
        pcData.setLoaded(0, true); // È in cache
        BitSet targetFields = new BitSet();
        targetFields.set(0); // Vogliamo caricare il campo 0

        BrokerImpl brokerMock = mock(BrokerImpl.class);
        when(smImplMock.getContext()).thenReturn(brokerMock);

        when(brokerMock.isLoading("test_oid")).thenReturn(true);
        pcData.load(smImplMock, targetFields, fetchMock, null);
        verify(smImplMock, never()).storeField(anyInt(), any());
    }
}
