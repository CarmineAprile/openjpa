package org.apache.openjpa.jdbc.kernel.exps;

import org.apache.openjpa.jdbc.meta.ClassMapping;
import org.apache.openjpa.jdbc.meta.FieldMapping;
import org.apache.openjpa.jdbc.sql.Select;
import org.apache.openjpa.kernel.exps.Context;
import org.apache.openjpa.meta.ClassMetaData;
import org.apache.openjpa.meta.FieldMetaData;
import org.apache.openjpa.meta.XMLMetaData;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * JUnit 4 tests for PCPath.
 * Uses Mockito to isolate tests and mock complex OpenJPA dependencies.
 */
public class PCPathZeroShotTest {

    private ClassMapping mockClassMapping;
    private PCPath pcPath;

    @Before
    public void setUp() {
        mockClassMapping = mock(ClassMapping.class);
        pcPath = new PCPath(mockClassMapping);
    }

    @Test
    public void testConstructorWithClassMapping() {
        assertNotNull(pcPath);
        assertEquals(Val.VAL, pcPath.getId());
        assertNull(pcPath.getSchemaAlias());
        assertFalse(pcPath.isKey());
        assertFalse(pcPath.isXPath());
        assertFalse(pcPath.isVariable());
        assertEquals("", pcPath.getPCPathString());
    }

    @Test
    public void testConstructorWithVariableUnbound() {
        Variable mockVar = mock(Variable.class);
        when(mockVar.getName()).thenReturn("unboundVar");
        when(mockVar.getPCPath()).thenReturn(null);

        PCPath varPath = new PCPath(mockClassMapping, mockVar);

        assertTrue(varPath.isVariablePath());
        assertEquals("unboundVar", varPath.getSchemaAlias());
        assertTrue(varPath.getPCPathString().contains("unboundVar"));
    }

    @Test
    public void testConstructorWithVariableBound() {
        Variable mockVar = mock(Variable.class);
        PCPath boundOtherPath = new PCPath(mockClassMapping);
        boundOtherPath.setSchemaAlias("boundSchema");

        // Initialize _actions in boundOtherPath to prevent NPE during addAll() in constructor
        boundOtherPath.get(mock(FieldMetaData.class), false);

        when(mockVar.getName()).thenReturn("boundVar");
        when(mockVar.getPCPath()).thenReturn(boundOtherPath);

        PCPath varPath = new PCPath(mockClassMapping, mockVar);

        assertTrue(varPath.isVariablePath());
        assertEquals("boundSchema", varPath.getSchemaAlias());
        assertTrue(varPath.isUnaccessedVariable());
    }

    @Test
    public void testConstructorWithSubQ() {
        SubQ mockSubQ = mock(SubQ.class);
        when(mockSubQ.getCandidate()).thenReturn(mockClassMapping);
        when(mockSubQ.getCandidateAlias()).thenReturn("subqAlias");
        when(mockSubQ.getType()).thenReturn((Class) Object.class);

        PCPath subqPath = new PCPath(mockSubQ);

        assertEquals(Object.class, subqPath.getType());
        // The getPCPathString appends action data AND the varName resulting in a double alias string
        assertEquals("subqAlias.subqAlias.", subqPath.getPCPathString());
    }

    @Test
    public void testSchemaAlias() {
        pcPath.setSchemaAlias("mySchemaAlias");
        assertEquals("mySchemaAlias", pcPath.getSchemaAlias());

        // Second set should be ignored per the implementation if it's already set
        pcPath.setSchemaAlias("anotherAlias");
        assertEquals("mySchemaAlias", pcPath.getSchemaAlias());
    }

    @Test
    public void testSetAndGetMetaData() {
        ClassMetaData metaData = mock(ClassMapping.class);
        pcPath.setMetaData(metaData);
        assertEquals(metaData, pcPath.getMetaData());
    }

    @Test
    public void testAddVariableAction() {
        Variable mockVar = mock(Variable.class);
        when(mockVar.getName()).thenReturn("testVar");

        pcPath.addVariableAction(mockVar);
        assertEquals("testVar.", pcPath.getPCPathString());
    }

    @Test
    public void testSetContainsId() {
        pcPath.setContainsId("cid1");
        // Due to synchronized setContainsId, the second call should return early if _cid is true
        pcPath.setContainsId("cid2");

        String pathString = pcPath.getPCPathString();
        assertTrue(pathString.contains("cid1"));
        assertFalse(pathString.contains("cid2"));
    }

    @Test
    public void testGetAndKey() {
        FieldMetaData mockField = mock(FieldMetaData.class);

        pcPath.get(mockField, false);
        assertFalse(pcPath.isKey());

        pcPath.getKey();
        assertTrue(pcPath.isKey());
    }

    @Test
    public void testGetXPathAndIsXPath() {
        FieldMetaData mockField = mock(FieldMetaData.class);
        XMLMetaData mockXmlMetaRoot = mock(XMLMetaData.class);
        XMLMetaData mockXmlMetaChild = mock(XMLMetaData.class);

        when(mockXmlMetaChild.getXmlname()).thenReturn("xmlRoot");

        // The first get_xpath action is skipped by the getXPath() loop as the root element.
        pcPath.get(mockField, mockXmlMetaRoot);
        // The second action gets appended to the xpath string.
        pcPath.get(mockField, mockXmlMetaChild);

        assertTrue(pcPath.isXPath());
        assertEquals(mockXmlMetaChild, pcPath.getXmlMapping());
        assertEquals("xmlRoot", pcPath.getXPath());
    }

    @Test
    public void testGetXPathWithNullXmlName() {
        FieldMetaData mockField = mock(FieldMetaData.class);
        XMLMetaData mockXmlMetaRoot = mock(XMLMetaData.class);
        XMLMetaData mockXmlMetaChild = mock(XMLMetaData.class);

        when(mockXmlMetaChild.getXmlname()).thenReturn(null);

        // Skip the root XML element
        pcPath.get(mockField, mockXmlMetaRoot);
        // Process child element with null name (should fall back to "*")
        pcPath.get(mockField, mockXmlMetaChild);

        assertTrue(pcPath.isXPath());
        assertEquals("*", pcPath.getXPath());
    }

    @Test
    public void testGetTypeWithImplicitType() {
        pcPath.setImplicitType(String.class);
        assertEquals(String.class, pcPath.getType());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testGetTypeFallback() {
        // Must set the metadata first so `_class` is populated and not null
        pcPath.setMetaData(mockClassMapping);

        when(mockClassMapping.getDescribedType()).thenReturn((Class) Integer.class);
        assertEquals(Integer.class, pcPath.getType());
    }

    @Test
    public void testEqualsAndHashCode() {
        PCPath path1 = new PCPath(mockClassMapping);
        PCPath path2 = new PCPath(mockClassMapping);

        assertEquals(path1, path2);
        assertEquals(path1.hashCode(), path2.hashCode());

        ClassMapping otherMapping = mock(ClassMapping.class);
        PCPath path3 = new PCPath(otherMapping);

        assertNotEquals(path1, path3);
    }

    @Test
    public void testIsSubqueryPath() {
        assertFalse(pcPath.isSubqueryPath());

        SubQ mockSubQ = mock(SubQ.class);
        when(mockSubQ.getCandidate()).thenReturn(mockClassMapping);
        when(mockSubQ.getCandidateAlias()).thenReturn("subqAlias");
        PCPath subqPath = new PCPath(mockSubQ);

        assertTrue(subqPath.isSubqueryPath());
    }

    @Test
    public void testLastFieldActionRetrieval() {
        FieldMetaData mockField = mock(FieldMetaData.class);
        pcPath.get(mockField, false);

        assertEquals(mockField, pcPath.last());
    }

    @Test
    public void testSetSubqueryContext() {
        FieldMetaData mockField = mock(FieldMetaData.class);
        pcPath.get(mockField, false);

        Context mockContext = mock(Context.class);
        pcPath.setSubqueryContext(mockContext, "correlationVar");

        // As internal state _correlationVar and actions are private,
        // we mainly assert that it doesn't throw exceptions and handles the state internally.
        assertNotNull(pcPath.last());
    }

    @Test
    public void testGetPCPathStringWithFieldMapping() {
        FieldMapping mockFieldMapping = mock(FieldMapping.class);
        when(mockFieldMapping.getName()).thenReturn("myField");

        // Simulating the path string generation
        pcPath.get(mockFieldMapping, false);
        String pathStr = pcPath.getPCPathString();

        assertTrue(pathStr.contains("myField."));
    }
}
