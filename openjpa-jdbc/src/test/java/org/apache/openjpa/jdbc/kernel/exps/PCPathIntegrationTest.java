package org.apache.openjpa.jdbc.kernel.exps;

import org.apache.openjpa.conf.OpenJPAConfiguration;
import org.apache.openjpa.jdbc.meta.ClassMapping;
import org.apache.openjpa.jdbc.meta.MappingDefaults;
import org.apache.openjpa.jdbc.meta.MappingRepository;
import org.apache.openjpa.meta.ClassMetaData;
import org.apache.openjpa.meta.FieldMetaData;
import org.apache.openjpa.meta.MetaDataFactory;
import org.apache.openjpa.meta.MetaDataRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Answers.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;

public class PCPathIntegrationTest {

    private PCPath path;
    private FieldMetaData realField;

    @Before
    public void setUp() {
        MappingRepository repo = new MappingRepository();

        OpenJPAConfiguration confMock = mock(OpenJPAConfiguration.class, RETURNS_DEEP_STUBS);
        repo.setConfiguration(confMock);

        MetaDataFactory factoryMock = mock(MetaDataFactory.class, RETURNS_DEEP_STUBS);
        repo.setMetaDataFactory(factoryMock);

        MappingDefaults defaultsMock = mock(MappingDefaults.class, RETURNS_DEEP_STUBS);
        repo.setMappingDefaults(defaultsMock);

        ClassMapping realMeta = (ClassMapping) repo.addMetaData(Thread.class);

        realField = realMeta.addDeclaredField("campoDiIntegrazione", String.class);

        path = new PCPath(realMeta);
    }

    @Test
    public void testIntegration() {
        // Obiettivo: Verificare che PCPath riesca ad attraversare e aggiornare
        // il proprio stato interno usando un oggetto FieldMetaData reale

        // Verifica precondizione: il path è vuoto
        assertNull("Il path iniziale deve essere vuoto", path.last());

        // Chiamiamo il metodo passandogli l'istanza REALE
        path.get(realField, false);

        // Oracolo: PCPath ha accettato l'oggetto vero ed è riuscito a navigarlo
        assertNotNull("Il path non deve più essere nullo dopo l'attraversamento", path.last());
        assertEquals("Il path deve puntare esattamente al vero FieldMetaData iniettato",
                realField, path.last());
    }
}
