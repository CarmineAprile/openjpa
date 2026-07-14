package org.apache.openjpa.kernel;

import org.apache.openjpa.enhance.PersistenceCapable;
import org.apache.openjpa.meta.ClassMetaData;
import org.apache.openjpa.meta.FieldMetaData;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import java.util.BitSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class PCDataImplBBTest {

    private static final String TEST_OID = "test_object_id";

    private PCDataImpl pcData;
    private ClassMetaData metaMock;
    private OpenJPAStateManager smMock;
    private StateManagerImpl smImplMock;

    // Variabili di stato e parametri condivisi
    private BitSet loadedFields;
    private FetchConfiguration defaultFetch;
    private Object defaultContext;

    @Before
    public void setUp() {
        // 1. Mocking dei metadati della classe
        metaMock = mock(ClassMetaData.class);

        FieldMetaData fmd0 = mock(FieldMetaData.class);
        when(fmd0.getIndex()).thenReturn(0);
        when(fmd0.getManagement()).thenReturn(FieldMetaData.MANAGE_PERSISTENT);

        FieldMetaData fmd1 = mock(FieldMetaData.class);
        when(fmd1.getIndex()).thenReturn(1);
        when(fmd1.getManagement()).thenReturn(FieldMetaData.MANAGE_PERSISTENT);

        FieldMetaData[] fields = new FieldMetaData[]{fmd0, fmd1};
        when(metaMock.getFields()).thenReturn(fields);
        when(metaMock.getPrimaryKeyFields()).thenReturn(new FieldMetaData[0]);
        when(metaMock.getField(0)).thenReturn(fmd0);
        when(metaMock.getField(1)).thenReturn(fmd1);

        // 2. Inizializzazione del "Sut"
        pcData = new PCDataImpl(TEST_OID, metaMock);

        // 3. Mock dell'entità fisica condivisa
        PersistenceCapable pcMock = mock(PersistenceCapable.class);

        // 4. Setup dello StateManager astratto
        smMock = mock(OpenJPAStateManager.class);
        when(smMock.getMetaData()).thenReturn(metaMock);
        when(smMock.getPersistenceCapable()).thenReturn(pcMock);

        loadedFields = new BitSet();
        when(smMock.getLoaded()).thenReturn(loadedFields);
        when(smMock.getVersion()).thenReturn("v1");

        // 5. Setup dello StateManager concreto (Usato per evitare la CastException durante i test sul metodo LOAD)
        smImplMock = mock(StateManagerImpl.class);
        when(smImplMock.getMetaData()).thenReturn(metaMock);
        when(smImplMock.getPersistenceCapable()).thenReturn(pcMock);
        when(smImplMock.getLoaded()).thenReturn(new BitSet());

        // 6. Setup di Fetch e Context
        defaultFetch = mock(FetchConfiguration.class);
        when(defaultFetch.requiresFetch(any())).thenReturn(FetchConfiguration.FETCH_LOAD);
        defaultContext = new Object();
    }

    // ---------------------------------------------
    // BLACK-BOX TEST: store(OpenJPAStateManager sm)
    // Test sulla prima firma del metodo store
    // ---------------------------------------------
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

        pcData.store(smMock);

        assertTrue("Il campo 0 deve essere isLoaded() == true in PCData", pcData.isLoaded(0));
        assertFalse("Il campo 1 deve essere isLoaded() == false in PCData", pcData.isLoaded(1));
        assertEquals("La versione di PCData deve essere aggiornata a quella dello StateManager", "v1", pcData.getVersion());
    }

    @Test
    public void testCase3_Store() {
        // - A1: sm non nullo
        // - B3: sm contiene tutti i campi caricati
        // Oracolo: pcDataImpl memorizza lo stato di tutti i fields presenti nello StateManager

        // Entrambi i fields attivati
        loadedFields.set(0);
        loadedFields.set(1);

        pcData.store(smMock);

        assertTrue("Il campo 0 deve essere isLoaded() == true in PCData", pcData.isLoaded(0));
        assertTrue("Il campo 1 deve essere isLoaded() == true in PCData", pcData.isLoaded(1));
        assertEquals("La versione di PCData deve essere aggiornata a quella dello StateManager", "v1", pcData.getVersion());
    }

    @Test
    public void testCase4_Store() {
        // - A2: sm nullo
        // Oracolo: Lancia NullPointerException

        assertThrows("Senza uno StateManager valido, il metodo non può essere eseguito e lancia una NP-Exception",
                NullPointerException.class, () -> pcData.store(null));
    }


    // ------------------------------------------------------------
    // BLACK-BOX TEST: store(OpenJPAStateManager sm, BitSet fields)
    // Test sulla seconda firma del metodo store
    // ------------------------------------------------------------
    @Test
    public void testCase5_Store() {
        // - A1: sm valido
        // - C1: fields Vuoto
        // Oracolo: pcDataImpl non memorizza nessun dato dello StateManager

        // Setup C1
        BitSet targetFields = new BitSet();

        pcData.store(smMock, targetFields);

        assertFalse(pcData.isLoaded(0));
        assertFalse(pcData.isLoaded(1));
    }

    @Test
    public void testCase6_Store() {

        // - A1: sm valido
        // - C2: fields Parziale (solo campo 1)
        // Oracolo: PCDataImpl memorizza solo il field indicato ed aggiorna la propria versione

        // Setup C2
        BitSet targetFields = new BitSet();
        targetFields.set(1);

        pcData.store(smMock, targetFields);

        assertFalse(pcData.isLoaded(0));
        assertTrue(pcData.isLoaded(1));
        assertEquals("v1", pcData.getVersion());
    }

    @Test
    public void testCase7_Store() {
        // - A1: sm valido
        // - C3: fields tutti settati
        // Oracolo: PCData memorizza tutti i fields dello StateManager ed aggiorna la propria versione

        // Setup C3
        BitSet targetFields = new BitSet();
        targetFields.set(0);
        targetFields.set(1);

        pcData.store(smMock, targetFields);

        assertTrue("Il campo 0 deve essere isLoaded() == true in PCData", pcData.isLoaded(0));
        assertTrue("Il campo 1 deve essere isLoaded() == true in PCData", pcData.isLoaded(1));
        assertEquals("La versione di PCData deve essere aggiornata a quella dello StateManager", "v1", pcData.getVersion());
    }

    @Ignore("Creazione Oracolo Errata")
    @Test
    public void testCase8_Store() {
        // - A1: sm valido
        // - C4: fields nullo
        // Oracolo:Il sistema deve lanciare una NullPointerException non avendo il riferimento alla maschera di bit che indica i Field da dover caricare

        assertThrows("BitSet Fields = null deve causare una NullPointerException",
                NullPointerException.class, () -> pcData.store(smMock, null));
    }


    @Test
    public void testCase9_Store() {
        // - A1: sm valido
        // - C4: fields null
        // Oracolo Corretto: il metodo considera BitSet fields null come se fosse vuoto
        // quindi PCData non memorizza nessun Fields dello StateManager

        pcData.store(smMock, null);

        assertFalse("Il campo 0 deve essere isLoaded() == false in PCData", pcData.isLoaded(0));
        assertFalse("Il campo 1 deve essere isLoaded() == false in PCData", pcData.isLoaded(1));
    }

    @Test
    public void testCase10_Store() {
        // - A2: sm nullo
        // - C2: fields valido
        // Oracolo: NullPointerException

        // Setup C2
        BitSet targetFields = new BitSet();
        targetFields.set(0);

        assertThrows("Senza uno StateManager valido, il metodo non può essere eseguito e lancia una NP-Exception",
                NullPointerException.class, () -> pcData.store(null, targetFields));
    }


    // --------------------------------------------------------------------------------------
    // BLACK-BOX TEST: load(OpenJPAStateManager sm, FetchConfiguration fetch, Object context)
    // Test sulla prima firma del metodo load
    // --------------------------------------------------------------------------------------
    @Test
    public void testCase11_Load() {
        // - S1 (Stato Interno): Cache non vuota
        // - A1, B1, C1: Parametri validi
        // Oracolo: il metodo load trasferisce i dati nello StateManager e aggiorna la versione

        // Setup S1: Popoliamo la cache
        loadedFields.set(0);
        when(smMock.fetchField(eq(0), anyBoolean())).thenReturn("Test-Value");
        pcData.store(smMock); // Mette il dato nella cache
        pcData.setVersion("v2");

        pcData.load(smImplMock, defaultFetch, defaultContext);

        verify(smImplMock, description("Il metodo deve caricare nello StateManager il dato esatto contenuto nella cache di PCData"))
                .storeField(eq(0), eq("Test-Value"));
        verify(smImplMock, description("Deve aggiornare la versione dello StateManager"))
                .setVersion("v2");
    }


    @Test
    public void testCase12_Load() {
        // - S2 (Stato Interno): Cache vuota
        // - A1, B1, C1: Parametri validi
        // Oracolo: anche se la cache è vuota, il metodo aggiorna la Versione

        // Setup S2
        pcData.setVersion("v-empty");

        pcData.load(smImplMock, defaultFetch, defaultContext);

        verify(smImplMock, description("Il metodo deve aggiornare correttamente la versione, anche con la cache vuota"))
                .setVersion("v-empty");

    }

    @Test
    public void testCase13_Load() {
        // - A2: sm nullo
        // Oracolo: NullPointerException

        assertThrows("Senza uno StateManager valido, il metodo non può essere eseguito e lancia una NP-Exception",
                NullPointerException.class, () -> pcData.load(null, defaultFetch, defaultContext));
    }

    @Test
    public void testCase14_Load() {
        // - A1: sm valido
        // - B2: fetch nullo
        // Oracolo: la documentazione mostra i valori che Fetch può assumere, il valore null non è accettatto
        // dunque è attesa una NP-Exception

        // Setup S1
        pcData.setLoaded(0, true);
        pcData.setVersion("v2");

        assertThrows("Il parametro Fetch non può essere null",
                NullPointerException.class, () -> pcData.load(smImplMock, null, defaultContext));
    }

    @Test
    public void testCase15_Load() {
        // - A1: sm valido
        // - B1: fetch valido
        // - C2: context null
        // Oracolo: Context null viene tollerato (nella documentazione non viene spiegato in che modo deve essere configurato o quali valori deve assumere, quindi sarà un parametro opzionale)

        // Setup S1
        pcData.setLoaded(0, true);
        pcData.setVersion("v-context-null");

        pcData.load(smImplMock, defaultFetch, null);

        verify(smImplMock, description("Il metodo deve aggiornare la versione anche con context null"))
                .setVersion("v-context-null");
    }



    // -----------------------------------------------------------------------------------------------------
    // BLACK-BOX TEST: load(OpenJPAStateManager sm, BitSet fields, FetchConfiguration fetch, Object context)
    // Test sulla seconda firma del metodo load
    // -----------------------------------------------------------------------------------------------------
    @Test
    public void testCase16_Load() {
        // - S1: Cache non vuota
        // - A2: sm null
        // - B1: fields tutti settati
        // - C1: fetch valido
        // - D1: context valido
        // Oracolo: NullPointerException

        // Setup S1
        pcData.setLoaded(0, true);
        pcData.setLoaded(1, true);
        pcData.setVersion("v-test");

        // Setup B1
        BitSet targetFields = new BitSet();
        targetFields.set(0);
        targetFields.set(1);

        assertThrows("Senza uno StateManager valido, il metodo non può essere eseguito e lancia una NP-Exception",
                NullPointerException.class, () -> pcData.load(null, targetFields, defaultFetch, defaultContext));
    }

    @Test
    public void testCase17_Load() {
        // - S1: Cache Piena
        // - A1: sm valido
        // - B1: fields tutti settati
        // - C2: fetch null
        // - D1: context valido
        // Oracolo: NullPointerException

        // Setup metaMock
        when(metaMock.getField(anyInt())).thenReturn(null);

        // Setup S1
        pcData.setLoaded(0, true);
        pcData.setLoaded(1, true);

        // Setup B1
        BitSet targetFields = new BitSet();
        targetFields.set(0);
        targetFields.set(1);

        assertThrows("Il parametro Fetch non può essere null",
                NullPointerException.class, () -> pcData.load(smImplMock, targetFields, null, defaultContext));
    }

    @Test
    public void testCase18_Load() {
        // - S1: Cache non vuota
        // - A1: sm valido
        // - B1: fields tutti settati
        // - C1: fetch valido
        // - D2: context null
        // Oracolo: Context null viene tollerato (nella documentazione non viene spiegato in che modo deve essere configurato o quali valori deve assumere, quindi sarà un parametro opzionale)

        // Setup S1
        pcData.setLoaded(0, true);
        pcData.setLoaded(1, true);
        pcData.setVersion("v-context-null-2");

        // Setup B1
        BitSet targetFields = new BitSet();
        targetFields.set(0);
        targetFields.set(1);

        pcData.load(smImplMock, targetFields, defaultFetch, null);

        verify(smImplMock, description("Il metodo deve aggiornare la versione anche con context null"))
                .setVersion("v-context-null-2");
    }

    @Test
    public void testCase19_Load() {
        // - S1: Cache non vuota
        // - A1: sm valido
        // - B4: fields null
        // - C1: fetch valido
        // - D1: context valido
        // Oracolo: il metodo load() considera un bitSet null come se fosse vuoto
        // non carica nessun valore dentro lo StateManager eccetto la versione

        // Setup S1
        pcData.setLoaded(0, true);
        pcData.setLoaded(1, true);
        pcData.setVersion("v-null-bitset");

        pcData.load(smImplMock, null, defaultFetch, defaultContext);

        verify(smImplMock, never()).storeField(anyInt(), any());
        verify(smImplMock).setVersion("v-null-bitset");
    }

    @Test
    public void testCase20_Load() {
        // - S1: Cache non vuota
        // - A1: sm valido
        // - B3: fields vuoto
        // - C1: fetch valido
        // - D1: context valido
        // Oracolo: Nessun campo trasferito dentro lo StateManager, e la sua versione viene aggiornata

        // Setup S1
        pcData.setLoaded(0, true);
        pcData.setLoaded(1, true);
        pcData.setVersion("v-empty-fields");

        // Setup B3
        BitSet targetFields = new BitSet();

        pcData.load(smImplMock, targetFields, defaultFetch, defaultContext);

        verify(smImplMock, never()).storeField(anyInt(), any());
        verify(smImplMock, description("Il metodo deve aggiornare la versione anche con Fields tutti vuoti"))
                .setVersion("v-empty-fields");
    }

    @Test
    public void testCase21_Load() {
        // - S1: Cache non vuota
        // - A1: sm valido
        // - B2: fields Parziale (solo campo 1)
        // - C1: fetch valido
        // - D1: context valido
        // Oracolo: il metodo fa memorizzare allo StateManager solo il Field 1

        // Setups S1
        pcData.setLoaded(0, false);
        pcData.setLoaded(1, true);
        pcData.setVersion("v-partial-fields");

        // Setup B2
        BitSet targetFields = new BitSet();
        targetFields.set(1);

        pcData.load(smImplMock, targetFields, defaultFetch, defaultContext);

        verify(smImplMock, never().description("Il campo 0 NON deve essere caricato")).storeField(eq(0), any());
        verify(smImplMock, description("Il field 1 deve essere caricato nello StateManager")).storeField(eq(1), any());
        verify(smImplMock, description("Il metodo deve aggiornare la versione correttamente"))
                .setVersion("v-partial-fields");
    }

    @Test
    public void testCase22_Load() {
        // - S1: Cache Piena
        // - A1: sm valido
        // - B1: fields tutti settati
        // - C1: fetch valido
        // - D1: context valido
        // Oracolo: il metodo load deve caricare tutti i field dentro lo StateManager
        // inoltre aggiorna la versione

        // Setup S1
        pcData.setLoaded(0, true);
        pcData.setLoaded(1, true);
        pcData.setVersion("v-full-fields");

        // Setup B1
        BitSet targetFields = new BitSet();
        targetFields.set(0);
        targetFields.set(1);

        pcData.load(smImplMock, targetFields, defaultFetch, defaultContext);

        verify(smImplMock).storeField(eq(0), any());
        verify(smImplMock).storeField(eq(1), any());
        verify(smImplMock).setVersion("v-full-fields");
    }

    @Test
    public void testCase23_Load() {
        // - S2: Cache Vuota
        // - A1: sm valido
        // - B1: fields tutti settati
        // - C1: fetch valido
        // - D1: context valido
        // Oracolo: nonostante il BitSet richieda di caricare i campi, la cache
        // è vuota. Nessuno storeField viene invocato, ma aggiorna la Versione.

        // Setup S2
        pcData.setVersion("v-empty-cache");

        // Setup B1
        BitSet targetFields = new BitSet();
        targetFields.set(0);
        targetFields.set(1);

        pcData.load(smImplMock, targetFields, defaultFetch, defaultContext);

        verify(smImplMock, never()).storeField(anyInt(), any());
        verify(smImplMock).setVersion("v-empty-cache");
    }
}
