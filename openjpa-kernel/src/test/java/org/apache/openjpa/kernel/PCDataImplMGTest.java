package org.apache.openjpa.kernel;

import org.apache.openjpa.meta.ClassMetaData;
import org.apache.openjpa.meta.FieldMetaData;
import org.junit.Test;

import java.util.BitSet;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PCDataImplMGTest {
    // ------------------
    // Test Mutant Driven
    // ------------------
    @Test
    public void testLoad1() {

        ClassMetaData metaMock = mock(ClassMetaData.class);
        FieldMetaData fmdMock = mock(FieldMetaData.class);
        when(fmdMock.getIndex()).thenReturn(0);
        when(metaMock.getFields()).thenReturn(new FieldMetaData[]{ fmdMock });

        PCDataImpl pcData = new PCDataImpl("oid", metaMock);

        // Inseriamo dati dentro PCDataImpl per vedere se li trasferisce al StateManager
        pcData.setImplData("GlobalImplData");
        pcData.setIntermediate(0, "InterData");

        // Usiamo StateManagerImpl mockato perché alla riga 157 c'è un cast esplicito
        StateManagerImpl smMock = mock(StateManagerImpl.class);
        when(smMock.getMetaData()).thenReturn(metaMock);
        when(smMock.getImplData()).thenReturn(null);
        when(smMock.getLoaded()).thenReturn(new BitSet()); // Tutto a false

        FetchConfiguration fetchMock = mock(FetchConfiguration.class);
        when(fetchMock.requiresFetch(fmdMock)).thenReturn(FetchConfiguration.FETCH_NONE);

        pcData.load(smMock, fetchMock, null);

        // ASSERT: Verifichiamo che gli assert confermano l'uccisione dei mutanti sopravvissuti
        verify(smMock).setLoading(true); // Uccide riga 157
        verify(smMock).setImplData("GlobalImplData", true); // Uccide riga 154
        verify(smMock).setIntermediate(0, "InterData"); // Uccide riga 162
    }

    @Test
    public void testLoad2() throws Exception {
        ClassMetaData metaMock = mock(ClassMetaData.class);
        FieldMetaData fmd0 = mock(FieldMetaData.class);
        when(fmd0.getIndex()).thenReturn(0);
        FieldMetaData fmd1 = mock(FieldMetaData.class);
        when(fmd1.getIndex()).thenReturn(1);

        when(metaMock.getFields()).thenReturn(new FieldMetaData[]{ fmd0, fmd1 });
        when(metaMock.getField(0)).thenReturn(fmd0);
        when(metaMock.getField(1)).thenReturn(fmd1);

        PCDataImpl pcData = new PCDataImpl("oid", metaMock);
        pcData.setImplData("GlobalImplData");

        // Campo 0: non caricato -> chiamerà loadIntermediate
        pcData.setIntermediate(0, "Inter0");
        // Campo 1: già caricato -> chiamerà loadImplData e fields.clear(1)
        pcData.setLoaded(1, true);
        pcData.setImplData(1, "FieldImpl1");

        StateManagerImpl smMock = mock(StateManagerImpl.class);
        when(smMock.getMetaData()).thenReturn(metaMock);
        when(smMock.getImplData()).thenReturn(null);
        when(smMock.getLoaded()).thenReturn(new BitSet());

        FetchConfiguration fetchMock = mock(FetchConfiguration.class);

        BitSet fieldsToLoad = new BitSet();
        fieldsToLoad.set(0);
        fieldsToLoad.set(1);

        pcData.load(smMock, fieldsToLoad, fetchMock, null);

        // ASSERT: Controllo uccisione dei mutanti sopravvissuti
        verify(smMock).setImplData("GlobalImplData", true); // riga 173
        verify(smMock).setIntermediate(0, "Inter0"); // riga 188
        verify(smMock).setImplData(1, "FieldImpl1"); // riga 192

        assertTrue("Il bit 0 non doveva essere cancellato", fieldsToLoad.get(0));
        assertFalse("Il bit 1 doveva essere cancellato da fields.clear", fieldsToLoad.get(1)); // riga 193
    }

    @Test
    public void testStore1() throws Exception {
        ClassMetaData metaMock = mock(ClassMetaData.class);
        FieldMetaData fmd0 = mock(FieldMetaData.class);
        when(fmd0.getIndex()).thenReturn(0);
        when(fmd0.getManagement()).thenReturn(FieldMetaData.MANAGE_PERSISTENT);

        FieldMetaData fmd1 = mock(FieldMetaData.class);
        when(fmd1.getIndex()).thenReturn(1);
        when(fmd1.getManagement()).thenReturn(FieldMetaData.MANAGE_PERSISTENT);

        when(metaMock.getFields()).thenReturn(new FieldMetaData[]{ fmd0, fmd1 });

        PCDataImpl pcData = new PCDataImpl("oid", metaMock);

        StateManagerImpl smMock = mock(StateManagerImpl.class);
        when(smMock.getMetaData()).thenReturn(metaMock);

        // Mock per far trasferire i dati da StateManager a PCData
        when(smMock.isImplDataCacheable()).thenReturn(true);
        when(smMock.getImplData()).thenReturn("GlobalImplData");

        org.apache.openjpa.enhance.PersistenceCapable pcMock = mock(org.apache.openjpa.enhance.PersistenceCapable.class);
        when(smMock.getPersistenceCapable()).thenReturn(pcMock);
        when(pcMock.pcIsDetached()).thenReturn(false);

        BitSet smLoaded = new BitSet();
        smLoaded.set(0); // Il campo 0 andrà nel ramo storeImplData
        when(smMock.getLoaded()).thenReturn(smLoaded);

        when(smMock.isImplDataCacheable(0)).thenReturn(true);
        when(smMock.getImplData(0)).thenReturn("FieldImpl0");

        when(smMock.getIntermediate(1)).thenReturn("Inter1"); // Il campo 1 andrà nel ramo storeIntermediate


        pcData.store(smMock);

        // ASSERT: Verifichiamo che i mutanti sopravvissuti vengano eliminati
        assertEquals("GlobalImplData", pcData.getImplData()); // riga 256
        assertEquals("FieldImpl0", pcData.getImplData(0)); // riga 262
        assertEquals("Inter1", pcData.getIntermediate(1)); // riga 264
    }

    @Test
    public void testStore2() throws Exception {
        ClassMetaData metaMock = mock(ClassMetaData.class);
        FieldMetaData fmd0 = mock(FieldMetaData.class);
        when(fmd0.getIndex()).thenReturn(0);
        when(fmd0.getManagement()).thenReturn(FieldMetaData.MANAGE_PERSISTENT);

        FieldMetaData fmd1 = mock(FieldMetaData.class);
        when(fmd1.getIndex()).thenReturn(1);
        when(fmd1.getManagement()).thenReturn(FieldMetaData.MANAGE_PERSISTENT);

        when(metaMock.getFields()).thenReturn(new FieldMetaData[]{ fmd0, fmd1 });

        PCDataImpl pcData = new PCDataImpl("oid", metaMock);

        StateManagerImpl smMock = mock(StateManagerImpl.class);
        when(smMock.getMetaData()).thenReturn(metaMock);
        when(smMock.isImplDataCacheable()).thenReturn(true);
        when(smMock.getImplData()).thenReturn("GlobalImplData");

        org.apache.openjpa.enhance.PersistenceCapable pcMock = mock(org.apache.openjpa.enhance.PersistenceCapable.class);
        when(smMock.getPersistenceCapable()).thenReturn(pcMock);
        when(pcMock.pcIsDetached()).thenReturn(false);

        when(smMock.isImplDataCacheable(0)).thenReturn(true);
        when(smMock.getImplData(0)).thenReturn("FieldImpl0");

        when(smMock.getIntermediate(1)).thenReturn("Inter1");

        BitSet fieldsToStore = new BitSet();
        fieldsToStore.set(0); // Campo 0 farà eseguire storeField e storeImplData
        // Campo 1 non è settato nel BitSet, quindi finirà nell'else if(!isLoaded) e farà storeIntermediate

        pcData.store(smMock, fieldsToStore);

        // ASSERT: Controllo eliminazione dei mutanti sopravvisuti
        assertEquals("GlobalImplData", pcData.getImplData()); // riga 271
        assertEquals("FieldImpl0", pcData.getImplData(0)); // riga 277
        assertEquals("Inter1", pcData.getIntermediate(1)); // riga 279
    }
}
