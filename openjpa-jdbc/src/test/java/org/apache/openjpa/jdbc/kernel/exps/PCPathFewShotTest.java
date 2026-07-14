package org.apache.openjpa.jdbc.kernel.exps;

import org.apache.openjpa.jdbc.meta.ClassMapping;
import org.apache.openjpa.jdbc.meta.FieldMapping;
import org.apache.openjpa.jdbc.sql.DBDictionary;
import org.apache.openjpa.jdbc.sql.SQLBuffer;
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
 * Uses Mockito to isolate tests and comprehensively verify internal behaviors.
 */
public class PCPathFewShotTest {

    private ClassMapping rootClassMapping;
    private PCPath path;

    @Before
    public void setUp() {
        rootClassMapping = mock(ClassMapping.class);
        path = new PCPath(rootClassMapping);
    }

    // =========================================================================
    // EXAMPLES PROVIDED (Few-Shot baselines)
    // =========================================================================

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

    // =========================================================================
    // COMPREHENSIVE TESTS
    // =========================================================================

    @Test
    public void testConstructor_WithClassMapping() {
        assertNotNull(path);
        assertEquals(Val.VAL, path.getId());
        assertNull(path.getSchemaAlias());
        assertFalse(path.isKey());
        assertFalse(path.isXPath());
        assertFalse(path.isVariable());
        assertEquals("", path.getPCPathString());
    }

    @Test
    public void testConstructor_WithUnboundVariable() {
        Variable mockVar = mock(Variable.class);
        when(mockVar.getName()).thenReturn("myUnboundVar");
        when(mockVar.getPCPath()).thenReturn(null);

        PCPath varPath = new PCPath(rootClassMapping, mockVar);

        assertTrue("Path should be identified as a variable path", varPath.isVariablePath());
        assertEquals("Schema alias should match the unbound variable name", "myUnboundVar", varPath.getSchemaAlias());
        assertTrue("String representation should contain the variable name", varPath.getPCPathString().contains("myUnboundVar"));
    }

    @Test
    public void testConstructor_WithBoundVariable() {
        Variable mockVar = mock(Variable.class);
        PCPath boundOtherPath = new PCPath(rootClassMapping);
        boundOtherPath.setSchemaAlias("existingSchema");

        // Initialize the internal _actions list in boundOtherPath by executing a get action
        boundOtherPath.get(mock(FieldMetaData.class), false);

        when(mockVar.getName()).thenReturn("myBoundVar");
        when(mockVar.getPCPath()).thenReturn(boundOtherPath);

        PCPath varPath = new PCPath(rootClassMapping, mockVar);

        assertTrue(varPath.isVariablePath());
        assertEquals("existingSchema", varPath.getSchemaAlias());
        assertTrue("Should be registered as an unaccessed variable initially", varPath.isUnaccessedVariable());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testConstructor_WithSubQuery() {
        SubQ mockSubQ = mock(SubQ.class);
        when(mockSubQ.getCandidate()).thenReturn(rootClassMapping);
        when(mockSubQ.getCandidateAlias()).thenReturn("mySubQAlias");
        when(mockSubQ.getType()).thenReturn((Class) String.class);

        PCPath subqPath = new PCPath(mockSubQ);

        assertEquals(String.class, subqPath.getType());
        assertTrue(subqPath.isSubqueryPath());
        // string generation repeats the subqAlias for action data and varName
        assertEquals("mySubQAlias.mySubQAlias.", subqPath.getPCPathString());
    }

    @Test
    public void testSetSchemaAlias_IdempotentBehavior() {
        path.setSchemaAlias("firstAlias");
        assertEquals("firstAlias", path.getSchemaAlias());

        // According to implementation, if it's already set, it ignores subsequent calls
        path.setSchemaAlias("secondAlias");
        assertEquals("firstAlias", path.getSchemaAlias());
    }

    @Test
    public void testMetaData_GetAndSet() {
        ClassMetaData newMetaData = mock(ClassMapping.class);
        path.setMetaData(newMetaData);

        assertEquals(newMetaData, path.getMetaData());
    }

    @Test
    public void testSetContainsId() {
        // Initial setup
        path.setContainsId("contains_id_1");
        assertTrue("Path string should reflect the added ContainsId variable action",
                path.getPCPathString().contains("contains_id_1"));

        // Secondary setup - should return early due to _cid boolean flag
        path.setContainsId("contains_id_2");
        assertFalse("Path string should NOT reflect the second ContainsId due to early return",
                path.getPCPathString().contains("contains_id_2"));
    }

    @Test
    public void testGetKey() {
        FieldMetaData mockField = mock(FieldMetaData.class);

        // Setup initial get action
        path.get(mockField, false);
        assertFalse("Initially, isKey should be false", path.isKey());

        // Trigger getKey
        path.getKey();
        assertTrue("isKey should be true after calling getKey()", path.isKey());
    }

    @Test
    public void testGetXPath_SkipsRootElement() {
        FieldMetaData mockField = mock(FieldMetaData.class);
        XMLMetaData rootXml = mock(XMLMetaData.class);
        XMLMetaData childXml = mock(XMLMetaData.class);

        when(childXml.getXmlname()).thenReturn("childNode");

        // The first get_xpath action represents the root element (which getXPath() skips)
        path.get(mockField, rootXml);
        // The second action is the child node
        path.get(mockField, childXml);

        assertTrue("Path should be identified as an XPath", path.isXPath());
        assertEquals("childNode", path.getXPath());
        assertEquals(childXml, path.getXmlMapping());
    }

    @Test
    public void testGetXPath_WithNullXmlName_DefaultsToAsterisk() {
        FieldMetaData mockField = mock(FieldMetaData.class);
        XMLMetaData rootXml = mock(XMLMetaData.class);
        XMLMetaData childXml = mock(XMLMetaData.class);

        // Simulating a child with no specific XML name bound
        when(childXml.getXmlname()).thenReturn(null);

        path.get(mockField, rootXml);
        path.get(mockField, childXml);

        assertTrue(path.isXPath());
        assertEquals("Null xml names should result in a wildcard '*'", "*", path.getXPath());
    }

    @Test
    public void testGetType_WithImplicitCast() {
        path.setImplicitType(Double.class);
        assertEquals(Double.class, path.getType());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testGetType_FallbackToClassMappingDescribedType() {
        // We must set the metadata so `_class` is populated
        path.setMetaData(rootClassMapping);

        // Cast to raw (Class) to fix generic mismatch in mockito when() stubbing
        when(rootClassMapping.getDescribedType()).thenReturn((Class) Long.class);

        assertEquals(Long.class, path.getType());
    }

    @Test
    public void testAppendIsEmpty_WithNullField() {
        // SQLBuffer is final, so we instantiate a real one instead of mocking it.
        DBDictionary mockDict = mock(DBDictionary.class);
        SQLBuffer realSql = new SQLBuffer(mockDict);

        Select mockSel = mock(Select.class);
        ExpContext mockCtx = mock(ExpContext.class);

        PCPath.PathExpState mockState = mock(PCPath.PathExpState.class);
        mockState.field = null;

        path.appendIsEmpty(mockSel, mockCtx, mockState, realSql);

        // If field is null, it appends FALSE ("1 <> 1")
        assertEquals("1 <> 1", realSql.getSQL());
    }

    @Test
    public void testAppendIsNull_WithNullField() {
        DBDictionary mockDict = mock(DBDictionary.class);
        SQLBuffer realSql = new SQLBuffer(mockDict);

        Select mockSel = mock(Select.class);
        ExpContext mockCtx = mock(ExpContext.class);

        PCPath.PathExpState mockState = mock(PCPath.PathExpState.class);
        mockState.field = null;

        path.appendIsNull(mockSel, mockCtx, mockState, realSql);

        // If field is null, it appends FALSE ("1 <> 1")
        assertEquals("1 <> 1", realSql.getSQL());
    }

    @Test
    public void testAppendIsNotNull_WithNullField() {
        DBDictionary mockDict = mock(DBDictionary.class);
        SQLBuffer realSql = new SQLBuffer(mockDict);

        Select mockSel = mock(Select.class);
        ExpContext mockCtx = mock(ExpContext.class);

        PCPath.PathExpState mockState = mock(PCPath.PathExpState.class);
        mockState.field = null;

        path.appendIsNotNull(mockSel, mockCtx, mockState, realSql);

        // If field is null, appendIsNotNull appends TRUE ("1 = 1")
        assertEquals("1 = 1", realSql.getSQL());
    }

    @Test
    public void testEqualsAndHashCode() {
        PCPath path1 = new PCPath(rootClassMapping);
        PCPath path2 = new PCPath(rootClassMapping);

        assertEquals("Two unmodified paths initialized with the same candidate should be equal", path1, path2);
        assertEquals("Equal objects must have matching hashcodes", path1.hashCode(), path2.hashCode());

        ClassMapping alternateMapping = mock(ClassMapping.class);
        PCPath path3 = new PCPath(alternateMapping);

        assertNotEquals("Paths with different candidate mappings should not be equal", path1, path3);
    }

    @Test
    public void testAddVariableAction() {
        Variable mockVar = mock(Variable.class);
        when(mockVar.getName()).thenReturn("testVariable");

        path.addVariableAction(mockVar);
        assertEquals("testVariable.", path.getPCPathString());
    }

    @Test
    public void testSetSubqueryContext() {
        FieldMetaData mockField = mock(FieldMetaData.class);
        path.get(mockField, false);

        Context mockContext = mock(Context.class);

        // No exception should be thrown; it handles internal Action context setting safely
        path.setSubqueryContext(mockContext, "corrVar");
        assertNotNull(path.last());
    }
}
