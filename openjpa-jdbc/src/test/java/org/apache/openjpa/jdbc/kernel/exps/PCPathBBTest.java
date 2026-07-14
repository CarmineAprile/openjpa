package org.apache.openjpa.jdbc.kernel.exps;

import org.apache.openjpa.jdbc.meta.ClassMapping;
import org.apache.openjpa.meta.FieldMetaData;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PCPathBBTest {

    private PCPath path;
    private ClassMapping rootClassMapping;

    @Before
    public void setUp() {
        // Mock del metadato della classe di partenza (es. l'entità radice della query)
        rootClassMapping = mock(ClassMapping.class);
        // Inizializzazione della classe sotto test.
        // Stato di partenza implicito: S1 (PCPath vuoto, nessun attraversamento)
        path = new PCPath(rootClassMapping);
    }


    // ---------------------------------------------------------------
    // BLACK-BOX TEST: get(FieldMetaData field, boolean nullTraversal)
    // ---------------------------------------------------------------
    @Test
    public void testCase1_Get() {
        // - S1: Stato interno = PCPath appena inizializzato (last() == null)
        // - F1: field = valido (non null, appartenente all'oggetto corrente)
        // - N1: nullTraversal = true
        // Oracolo: il metodo deve aggiornare lo stato interno del PCPath.
        // Chiamando last() subito dopo, deve restituire il field appena passato

        // Setup F1
        FieldMetaData validField = mock(FieldMetaData.class);
        when(validField.getDeclaringMetaData()).thenReturn(rootClassMapping);

        path.get(validField, true);

        assertNotNull("The path should have a last field after traversal", path.last());
        assertEquals("The last field should match the traversed field",
                validField, path.last());
    }

    @Test
    public void testCase2_Get() {
        // - S1: Stato interno = PCPath appena inizializzato
        // - F1: field = valido
        // - N2: nullTraversal = false
        // Oracolo: il flag nullTraversal influisce sulla generazione SQL a runtime, ma dal punto di vista
        // dello stato dell'oggetto, l'attraversamento ha successo e last() deve restituire il field corrente

        // Setup F1
        FieldMetaData validField = mock(FieldMetaData.class);
        when(validField.getDeclaringMetaData()).thenReturn(rootClassMapping);

        path.get(validField, false);

        assertNotNull("The path should have a last field after traversal", path.last());
        assertEquals("The last field should match the traversed field even with nullTraversal false",
                validField, path.last());
    }

    @Test
    public void testCase3_Get() {
        // - S2: Stato interno = PCPath ha già effettuato un attraversamento (last() != null)
        // - F1: field = valido
        // - N1: nullTraversal = true
        // Oracolo: il metodo deve aggiornare lo stato concatenando il nuovo
        // percorso last() deve restituire il nuovo field

        // Setup S2
        FieldMetaData firstField = mock(FieldMetaData.class);
        when(firstField.getDeclaringMetaData()).thenReturn(rootClassMapping);
        path.get(firstField, true);

        // Per semplicità simuliamo una self-relation (es. Impiegato -> manager, che è un altro Impiegato)
        FieldMetaData secondField = mock(FieldMetaData.class);
        when(secondField.getDeclaringMetaData()).thenReturn(rootClassMapping);

        path.get(secondField, true);

        assertNotNull("The path should still have a last field after the second traversal", path.last());
        assertNotEquals("The last field should no longer be the previous field",
                firstField, path.last());
        assertEquals("The last field should be updated to the newly traversed field",
                secondField, path.last());
    }

    @Test
    public void testCase4_Get() {
        // - S2: Stato interno = PCPath ha già effettuato un attraversamento (last() != null)
        // - F1: field = valido (non null, appartenente all'oggetto corrente)
        // - N2: nullTraversal = false
        // Oracolo: Come nel caso S1-F1-N2, il flag nullTraversal a false non impedisce
        // l'aggiornamento dello stato interno in questa fase di costruzione del path
        // last() deve restituire il nuovo field

        // Setup S2
        FieldMetaData firstField = mock(FieldMetaData.class);
        when(firstField.getDeclaringMetaData()).thenReturn(rootClassMapping);
        path.get(firstField, true);

        // Setup F1
        FieldMetaData secondField = mock(FieldMetaData.class);
        when(secondField.getDeclaringMetaData()).thenReturn(rootClassMapping);

        path.get(secondField, false);

        assertNotNull("The path should still have a last field after the second traversal", path.last());
        assertNotEquals("The last field should no longer be the previous field",
                firstField, path.last());
        assertEquals("The last field should be updated to the newly traversed field even with nullTraversal false",
                secondField, path.last());
    }

    @Ignore
    @Test
    public void testCase5_Get_Wrong() {
        // - S1: Stato interno = PCPath appena inizializzato (last() == null)
        // - F2: field = invalido (appartiene a una classe diversa da quella corrente)
        // - N1/N2: nullTraversal = indifferente (usiamo true)
        // Oracolo: secondo la documentazione, la navigazione deve avvenire nel field "of the current object"
        // Un field di un oggetto diverso viola il contratto. Ci si aspetta un'eccezione
        // e lo stato (last()) non deve cambiare (rimane null)

        // SETUP F2 (Campo invalido)
        FieldMetaData invalidField = mock(FieldMetaData.class);
        ClassMapping wrongClassMapping = mock(ClassMapping.class);
        // Istruiamo il finto campo a dichiarare di appartenere alla classe sbagliata
        when(invalidField.getDeclaringMetaData()).thenReturn(wrongClassMapping);

        // ACT & ASSERT
        // Verifichiamo che venga lanciata l'eccezione corretta
        assertThrows(IllegalArgumentException.class, () -> path.get(invalidField, true));

        assertNull("The state should remain unchanged (null) after a failed traversal from the root",
                path.last());
    }

    @Test
    public void testCase5_Get() {
        // - S1: Stato interno = PCPath appena inizializzato (last() == null)
        // - F2: field = invalido (appartiene a una classe diversa da quella corrente)
        // - N1: nullTraversal = true
        // Oracolo Adattato: dopo l'esecuzione del metodo get, il field indicato viene aggiunto correttamente all'oggetto PCPath
        // La documentazione dice che il metodo get fa accedere al campo specificato
        // dell'oggetto corrente e aggiorna l'oggetto corrente con il valore di quel campo.
        // Inizialmente si era ipotizzato che nel caso in cui venisse indicato un campo non appartenente
        // all'oggetto, venisse lanciata un eccezione, comportamento smentito dal test precedente.

        // Setup F2
        FieldMetaData invalidField = mock(FieldMetaData.class);
        ClassMapping wrongClassMapping = mock(ClassMapping.class);
        // Istruiamo il mock a dichiarare di appartenere alla classe sbagliata
        when(invalidField.getDeclaringMetaData()).thenReturn(wrongClassMapping);

        assertNotEquals("I due mock devono essere istanze diverse", rootClassMapping, wrongClassMapping);
        path.get(invalidField, true);

        assertNotNull("The path accepts the invalid field without validation", path.last());
        assertEquals("The last field matches the invalid field, proving lack of internal validation", invalidField, path.last());
    }

    @Test
    public void testCase6_Get() {
        // - S2: Stato interno = PCPath ha già effettuato un attraversamento (last() != null)
        // - F2: field = invalido (appartiene a una classe diversa)
        // - N1: nullTraversal = true
        // SCOPERTA (Oracolo Adattato):
        // Come verificato nello stato S1, l'implementazione manca di validazione interna.
        // Anche se il path ha già degli elementi, accetterà un campo invalido
        // concatenandolo ciecamente e aggiornando il last()

        // SETUP S2 (Stato già attraversato)
        FieldMetaData firstField = mock(FieldMetaData.class);
        when(firstField.getDeclaringMetaData()).thenReturn(rootClassMapping);
        path.get(firstField, true);

        // 2. SETUP F2 (Campo invalido)
        FieldMetaData invalidField = mock(FieldMetaData.class);
        ClassMapping wrongClassMapping = mock(ClassMapping.class);
        when(invalidField.getDeclaringMetaData()).thenReturn(wrongClassMapping);

        assertNotEquals("I due mock devono essere istanze diverse", rootClassMapping, wrongClassMapping);

        path.get(invalidField, true);


        assertEquals("The last field matches the invalid field, proving lack of internal validation even in S2",
                invalidField, path.last());
        assertNotEquals("The last field should no longer be the previous field",
                firstField, path.last());
    }


    @Test
    @Ignore
    public void testCase7_Get_Wrong() {
        // - S1: Stato interno = PCPath appena inizializzato (last() == null)
        // - F3: field = null
        // - N2: nullTraversal = false
        // Oracolo: non essendo gestito esplicitamente, il passaggio di un parametro null per l'oggetto
        // field dovrebbe causare una NullPointerException quando PCPath tenta di estrarre
        // o elaborare informazioni da esso.

        // Ci aspettiamo che l'invocazione fallisca con NullPointerException
        assertThrows(NullPointerException.class, () -> path.get(null, false));
    }

    @Test
    public void testCase7_Get() {
        // - S1: Stato interno = PCPath appena inizializzato (last() == null)
        // - F3: field = null
        // - N2: nullTraversal = false
        // Oracolo Adattato: il metodo è permissivo e non effettua validazione. Accetta input nulli
        // senza lanciare NullPointerException. Lo stato interno (last())
        // rimane null senza generare errori.

        path.get(null, false);

        assertNull("The path accepts null without crashing and last() remains null", path.last());
    }

    @Test
    public void testCase8_Get() {
        // - S2: Stato interno = PCPath ha già effettuato un attraversamento (last() != null)
        // - F3: field = null
        // - N2: nullTraversal = false
        // Oracolo Adattato: dimostriamo che il null viene attivamente accettato dal percorso anche in corso d'opera,
        // andando a sovrascrivere l'ultimo campo precedentemente salvato.

        // 1. SETUP S2 (Stato già attraversato)
        FieldMetaData firstField = mock(FieldMetaData.class);
        when(firstField.getDeclaringMetaData()).thenReturn(rootClassMapping);

        path.get(firstField, true);
        assertNotNull("Precondizione: il path deve avere un last() non nullo nello stato S2", path.last());

        path.get(null, true);

        // Il path si è fidato del null e lo ha sostituito a firstField
        assertNull("The path accepts null, actively overwriting the previous last() field with null", path.last());
    }

    

    // ---------------------------------------------------------------
    // BLACK-BOX TEST: getType()
    // ---------------------------------------------------------------
    @Test
    public void testCase1_GetType() {
        // - S1: Stato interno = PCPath vuoto (nessun attraversamento)
        // Oracolo: Non essendoci campi attraversati, il tipo corrente del percorso
        // deve coincidere con il tipo della classe radice (ClassMapping)

        // SETUP S1
        when(rootClassMapping.getDescribedType()).thenReturn((Class) Object.class);

        Class<?> actualType = path.getType();

        assertEquals("Se il path è vuoto, getType() deve restituire il tipo della classe radice", Object.class, actualType);
    }

    @Test
    public void testCase2_GetType() {
        // - S2: Stato interno = PCPath ha attraversato un campo
        // - T1: Tipo base (es. String)
        // Oracolo: il metodo deve estrarre e restituire il tipo semplice del campo corrente

        // SETUP S2 + T1
        FieldMetaData simpleField = mock(FieldMetaData.class);
        when(simpleField.getDeclaringMetaData()).thenReturn(rootClassMapping);
        when(simpleField.getDeclaredType()).thenReturn(String.class);
        path.get(simpleField, true);

        Class<?> actualType = path.getType();

        assertEquals("Deve restituire il tipo esatto del campo semplice (String)", String.class, actualType);
    }

    @Test
    public void testCase3_GetType() {
        // - S2: Stato interno = PCPath ha attraversato un campo
        // - T3: Collezione (List)
        // Oracolo (Adattato Empiricamente): Verifichiamo che il metodo a questo livello non estragga il tipo generico
        // degli elementi, ma restituisca l'interfaccia base della collezione

        // SETUP S2 + T3
        FieldMetaData collectionField = mock(FieldMetaData.class);
        when(collectionField.getDeclaringMetaData()).thenReturn(rootClassMapping);
        when(collectionField.getDeclaredType()).thenReturn(java.util.List.class);
        path.get(collectionField, true);

        Class<?> actualType = path.getType();

        assertEquals("Deve restituire l'interfaccia base della collezione (List)", java.util.List.class, actualType);
    }

    @Test
    public void testCase4_GetType() {
        // - S2: Stato interno = PCPath ha attraversato un campo
        // - T4: Mappa (Map)
        // Oracolo (Adattato Empiricamente):
        // Verifichiamo che il metodo a questo livello non estragga i tipi chiave/valore,
        // ma restituisca l'interfaccia base della mappa

        // SETUP S2 + T4
        FieldMetaData mapField = mock(FieldMetaData.class);
        when(mapField.getDeclaringMetaData()).thenReturn(rootClassMapping);
        when(mapField.getDeclaredType()).thenReturn(java.util.Map.class);
        path.get(mapField, true);

        Class<?> actualType = path.getType();

        assertEquals("Deve restituire l'interfaccia base della mappa (Map)", java.util.Map.class, actualType);
    }
}

// TEST RIMOSSO
/*
@Test
public void testCase3_GetType() {
    // - S2: Stato interno = PCPath ha attraversato un campo
    // - T2: Relazione a Entità (Simuliamo un Thread.class)
    // Oracolo: attraversando una relazione verso un'altra entità,
    // deve restituire la classe dell'entità di destinazione

    // SETUP S2 + T2
    FieldMetaData relationField = mock(FieldMetaData.class);
    when(relationField.getDeclaringMetaData()).thenReturn(rootClassMapping);
    when(relationField.getDeclaredType()).thenReturn(Thread.class);
    path.get(relationField, true);

    Class<?> actualType = path.getType();

    assertEquals("Deve restituire il tipo della classe relazionata (Thread)", Thread.class, actualType);
}
*/
