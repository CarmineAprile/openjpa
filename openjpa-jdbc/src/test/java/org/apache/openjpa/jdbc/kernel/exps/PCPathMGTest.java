package org.apache.openjpa.jdbc.kernel.exps;

import org.apache.openjpa.jdbc.meta.ClassMapping;
import org.apache.openjpa.meta.FieldMetaData;
import org.apache.openjpa.meta.JavaTypes;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PCPathMGTest {
    // ------------------
    // Test Mutant Driven
    // ------------------
    @Test
    public void testGetType_MD_ClassMetaDataFallback() {
        // Obiettivo: Uccidere i mutanti (e coprire il NO_COVERAGE) sulla riga 508.
        // Spiegazione: L'oracolo verifica che, in assenza di azioni (nessun field attraversato),
        // il path faccia correttamente fallback sul tipo della classe radice

        ClassMapping rootClassMapping = mock(ClassMapping.class);
        when(rootClassMapping.getDescribedType()).thenReturn((Class) Thread.class);
        // Creiamo il path
        PCPath path = new PCPath(rootClassMapping);
        // Iniettiamo esplicitamente i metadati per valorizzare la variabile interna _class
        path.setMetaData(rootClassMapping);


        Class<?> actualType = path.getType();
        assertEquals("Se il path è vuoto, deve restituire il tipo della classe radice",
                Thread.class, actualType);
    }
}
