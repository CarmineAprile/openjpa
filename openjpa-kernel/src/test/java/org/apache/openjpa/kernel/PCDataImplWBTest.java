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
        // 1. Setup dei MetaDati (usiamo un solo campo per semplicità nei test WB)
        metaMock = mock(ClassMetaData.class);
        FieldMetaData fmd0 = mock(FieldMetaData.class);
        when(fmd0.getIndex()).thenReturn(0);
        when(fmd0.getManagement()).thenReturn(FieldMetaData.MANAGE_PERSISTENT);

        FieldMetaData[] fields = new FieldMetaData[] { fmd0 };
        when(metaMock.getFields()).thenReturn(fields);
        when(metaMock.getPrimaryKeyFields()).thenReturn(new FieldMetaData[0]);
        when(metaMock.getField(0)).thenReturn(fmd0);

        // 2. Inizializzazione SUT
        pcData = new PCDataImpl("test_oid", metaMock);

        // 3. Setup dello StateManager
        PersistenceCapable pcMock = mock(PersistenceCapable.class);
        smImplMock = mock(StateManagerImpl.class);
        when(smImplMock.getMetaData()).thenReturn(metaMock);
        when(smImplMock.getPersistenceCapable()).thenReturn(pcMock);
        when(smImplMock.getObjectId()).thenReturn("test_oid");

        smLoadedFields = new BitSet();
        when(smImplMock.getLoaded()).thenReturn(smLoadedFields);

        // 4. Setup Fetch Configuration di default (ritorna sempre LOAD, a meno di override)
        fetchMock = mock(FetchConfiguration.class);
        when(fetchMock.requiresFetch(any())).thenReturn(FetchConfiguration.FETCH_LOAD);
    }

    // =========================================================================
    // WB TESTS PER: store(OpenJPAStateManager sm)
    // =========================================================================

    @Test
    public void testStore_WB1() {
        // Obiettivo: Coprire il ramo Falso di "else if (!isLoaded(i))"

        // Setup: Il campo 0 è GIA' presente nella cache di PCData
        pcData.setLoaded(0, true);

        // INNESCO WB: Ma NON è caricato nello StateManager
        smLoadedFields.set(0, false);

        // Act
        pcData.store(smImplMock);

        // ORACOLO CORRETTO:
        // 1. Verifichiamo che il campo rimanga intatto nella cache (nessuna alterazione)
        assertTrue("Il campo 0 deve rimanere caricato nella cache di PCData", pcData.isLoaded(0));

        // 2. Verifichiamo che PCDataImpl non abbia tentato di estrarre il valore
        // dallo StateManager (cosa che invece farebbe invocando storeField o storeIntermediate)
        // Usiamo verify con never() per dimostrare l'assenza di interazioni di estrazione dati
        verify(smImplMock, never()).fetchObject(anyInt());
        verify(smImplMock, never()).fetchString(anyInt());
    }

    @Test
    public void testStore_WB2() {
        // Obiettivo: Coprire il ramo Falso di "else if (!isLoaded(i))" nella seconda firma

        // Setup
        pcData.setLoaded(0, true);
        smLoadedFields.set(0, false);

        BitSet targetFields = new BitSet();
        targetFields.set(0); // Vogliamo salvare il campo 0

        // Act
        pcData.store(smImplMock, targetFields);

        // ORACOLO CORRETTO:
        // 1. La cache non deve essere stata sovrascritta o svuotata
        assertTrue("Il campo 0 deve rimanere intatto nella cache", pcData.isLoaded(0));

        // 2. Nessuna interazione di lettura dallo StateManager per salvare dati
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

        // INNESCO WB: Il campo è GIA' caricato nello StateManager.
        smLoadedFields.set(0, true);

        pcData.load(smImplMock, fetchMock, null);

        // Oracolo WB: Il loadField non deve MAI essere chiamato per ottimizzazione
        verify(smImplMock, never()).storeField(anyInt(), any());
    }

    @Test
    public void testLoad_WB2() {
        // Obiettivo: Coprire il ramo in cui la seconda condizione (fetch != FETCH_NONE) è FALSA.

        pcData.setLoaded(0, true); // È in cache
        smLoadedFields.set(0, false); // NON è nello StateManager

        // INNESCO WB: Forziamo il Fetch Plan a ignorare il campo (FETCH_NONE)
        when(fetchMock.requiresFetch(any())).thenReturn(FetchConfiguration.FETCH_NONE);

        pcData.load(smImplMock, fetchMock, null);

        // Oracolo WB: Il loadField non deve MAI essere chiamato, rispettando la policy
        verify(smImplMock, never()).storeField(anyInt(), any());
    }

    // =========================================================================
    // WB TESTS PER: load(OpenJPAStateManager sm, BitSet fields, FetchConfiguration fetch, Object context)
    // =========================================================================

    @Test
    public void testLoad_WB3() {
        // Obiettivo: Coprire i rami di transizione di stato del Broker e il controllo "|| loading"

        pcData.setLoaded(0, true); // È in cache

        BitSet targetFields = new BitSet();
        targetFields.set(0); // Vogliamo caricare il campo 0

        // INNESCO WB (Dettaglio architetturale): Mockiamo la classe BrokerImpl
        BrokerImpl brokerMock = mock(BrokerImpl.class);
        when(smImplMock.getContext()).thenReturn(brokerMock);

        // Simuliamo che OpenJPA sia già nel mezzo del caricamento di questo oggetto (Anti-Loop)
        when(brokerMock.isLoading("test_oid")).thenReturn(true);

        pcData.load(smImplMock, targetFields, fetchMock, null);

        // Oracolo WB: Essendo isLoading=true, il sistema entra nel ramo "loadIntermediate"
        // per prevenire loop infiniti, saltando il normale "loadField"
        verify(smImplMock, never()).storeField(anyInt(), any());
    }
}
