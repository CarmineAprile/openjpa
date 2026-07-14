package org.apache.openjpa.jdbc.kernel.exps;

import org.apache.openjpa.jdbc.meta.ClassMapping;
import org.apache.openjpa.jdbc.meta.FieldMapping;
import org.apache.openjpa.jdbc.sql.DBDictionary;
import org.apache.openjpa.jdbc.sql.Joins;
import org.apache.openjpa.jdbc.sql.SQLBuffer;
import org.apache.openjpa.jdbc.sql.Select;
import org.apache.openjpa.kernel.exps.Context;
import org.apache.openjpa.meta.ClassMetaData;
import org.apache.openjpa.meta.FieldMetaData;
import org.apache.openjpa.meta.XMLMetaData;
import org.apache.openjpa.util.UserException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Comprehensive JUnit 4 tests for PCPath (PCPathGTTTest).
 * Generated via Expert Group Discussion focusing on edge cases,
 * standard paths, exception handling, and final class workarounds.
 */
public class PCPathGTTTest {

    private ClassMapping rootClassMapping;
    private PCPath path;

    @Before
    public void setUp() {
        rootClassMapping = mock(ClassMapping.class);
        path = new PCPath(rootClassMapping);
    }

    // =========================================================================
    // EXPERT 1: STATE INITIALIZATION & METADATA
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
        when(mockVar.getName()).thenReturn("unboundVar");
        when(mockVar.getPCPath()).thenReturn(null);

        PCPath varPath = new PCPath(rootClassMapping, mockVar);

        assertTrue(varPath.isVariablePath());
        assertEquals("unboundVar", varPath.getSchemaAlias());
        assertTrue(varPath.getPCPathString().contains("unboundVar"));
        assertFalse(varPath.isSubqueryPath());
    }

    @Test
    public void testConstructor_WithBoundVariable() {
        Variable mockVar = mock(Variable.class);
        PCPath boundOtherPath = new PCPath(rootClassMapping);
        boundOtherPath.setSchemaAlias("boundSchema");

        // Edge Case Handling: Initialize the internal _actions list in boundOtherPath
        // by executing a get action to prevent NPE during addAll()
        boundOtherPath.get(mock(FieldMetaData.class), false);

        when(mockVar.getName()).thenReturn("boundVar");
        when(mockVar.getPCPath()).thenReturn(boundOtherPath);

        PCPath varPath = new PCPath(rootClassMapping, mockVar);

        assertTrue(varPath.isVariablePath());
        assertEquals("boundSchema", varPath.getSchemaAlias());
        assertTrue("Should be an unaccessed variable after bound initialization", varPath.isUnaccessedVariable());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testConstructor_WithSubQuery() {
        SubQ mockSubQ = mock(SubQ.class);
        when(mockSubQ.getCandidate()).thenReturn(rootClassMapping);
        when(mockSubQ.getCandidateAlias()).thenReturn("subQAlias");
        when(mockSubQ.getType()).thenReturn((Class) String.class);

        PCPath subqPath = new PCPath(mockSubQ);

        assertTrue(subqPath.isSubqueryPath());
        assertEquals(String.class, subqPath.getType());
        assertEquals("subQAlias.subQAlias.", subqPath.getPCPathString());
    }

    @Test
    public void testSetSchemaAlias_IdempotentEdgeCase() {
        path.setSchemaAlias("firstAlias");
        assertEquals("firstAlias", path.getSchemaAlias());

        // Subsequent sets are ignored based on PCPath source code
        path.setSchemaAlias("secondAlias");
        assertEquals("firstAlias", path.getSchemaAlias());
    }

    @Test
    public void testSetContainsId_IdempotentEdgeCase() {
        path.setContainsId("cid_1");
        assertTrue(path.getPCPathString().contains("cid_1"));

        // Secondary setup - returns early due to _cid flag
        path.setContainsId("cid_2");
        assertFalse(path.getPCPathString().contains("cid_2"));
    }

    @Test
    public void testEqualsAndHashCode() {
        PCPath path1 = new PCPath(rootClassMapping);
        PCPath path2 = new PCPath(rootClassMapping);
        ClassMapping alternateMapping = mock(ClassMapping.class);
        PCPath path3 = new PCPath(alternateMapping);

        assertEquals(path1, path2);
        assertEquals(path1.hashCode(), path2.hashCode());
        assertNotEquals(path1, path3);
    }

    // =========================================================================
    // EXPERT 2: TRAVERSAL, XPATH & TYPES
    // =========================================================================

    @Test
    public void testGetAndKey() {
        FieldMetaData mockField = mock(FieldMetaData.class);
        path.get(mockField, false);
        assertFalse(path.isKey());

        path.getKey();
        assertTrue(path.isKey());
    }

    @Test
    public void testGetXPath_SkipsRootAndResolvesNames() {
        FieldMetaData mockField = mock(FieldMetaData.class);
        XMLMetaData rootXml = mock(XMLMetaData.class);
        XMLMetaData childXml = mock(XMLMetaData.class);

        when(childXml.getXmlname()).thenReturn("childNode");

        // First action is skipped (root element logic)
        path.get(mockField, rootXml);
        // Second action represents the child node
        path.get(mockField, childXml);

        assertTrue(path.isXPath());
        assertEquals("childNode", path.getXPath());
        assertEquals(childXml, path.getXmlMapping());
    }

    @Test
    public void testGetXPath_NullXmlNameDefaultsToAsterisk() {
        FieldMetaData mockField = mock(FieldMetaData.class);
        XMLMetaData rootXml = mock(XMLMetaData.class);
        XMLMetaData childXml = mock(XMLMetaData.class);

        when(childXml.getXmlname()).thenReturn(null);

        path.get(mockField, rootXml);
        path.get(mockField, childXml);

        assertTrue(path.isXPath());
        assertEquals("*", path.getXPath());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testGetType_FallbackEdgeCase() {
        // Without explicit implicit cast, it looks for actions.
        // With no actions, it uses `_class` if set.
        path.setMetaData(rootClassMapping);
        when(rootClassMapping.getDescribedType()).thenReturn((Class) Integer.class);

        assertEquals(Integer.class, path.getType());
    }

    @Test
    public void testGetType_UninitializedClassFallback() {
        // If _class is not set via setMetaData, defaults to Object.class
        assertEquals(Object.class, path.getType());
    }

    @Test
    public void testAddVariableActionAndStringRepresentation() {
        Variable mockVar = mock(Variable.class);
        when(mockVar.getName()).thenReturn("testVar");

        path.addVariableAction(mockVar);
        assertEquals("testVar.", path.getPCPathString());
    }

    @Test
    public void testSetSubqueryContext() {
        FieldMetaData mockField = mock(FieldMetaData.class);
        path.get(mockField, false);

        Context mockContext = mock(Context.class);
        path.setSubqueryContext(mockContext, "corrVar");

        assertNotNull(path.last());
    }

    // =========================================================================
    // EXPERT 3: SQL BUFFER APPENDS & EXCEPTIONS
    // =========================================================================

    @Test
    public void testAppendIsEmpty_NullFieldEdgeCase() {
        // Using real SQLBuffer since it is a final class
        DBDictionary mockDict = mock(DBDictionary.class);
        SQLBuffer realSql = new SQLBuffer(mockDict);
        Select mockSel = mock(Select.class);
        ExpContext mockCtx = mock(ExpContext.class);

        PCPath.PathExpState state = new PCPath.PathExpState(mock(Joins.class));
        state.field = null; // Edge case

        path.appendIsEmpty(mockSel, mockCtx, state, realSql);

        // FALSE constant is "1 <> 1"
        assertEquals("1 <> 1", realSql.getSQL());
    }

    @Test
    public void testAppendIsNull_NullFieldEdgeCase() {
        DBDictionary mockDict = mock(DBDictionary.class);
        SQLBuffer realSql = new SQLBuffer(mockDict);
        Select mockSel = mock(Select.class);
        ExpContext mockCtx = mock(ExpContext.class);

        PCPath.PathExpState state = new PCPath.PathExpState(mock(Joins.class));
        state.field = null;

        path.appendIsNull(mockSel, mockCtx, state, realSql);

        assertEquals("1 <> 1", realSql.getSQL());
    }

    @Test
    public void testAppendIsNotNull_NullFieldEdgeCase() {
        DBDictionary mockDict = mock(DBDictionary.class);
        SQLBuffer realSql = new SQLBuffer(mockDict);
        Select mockSel = mock(Select.class);
        ExpContext mockCtx = mock(ExpContext.class);

        PCPath.PathExpState state = new PCPath.PathExpState(mock(Joins.class));
        state.field = null;

        path.appendIsNotNull(mockSel, mockCtx, state, realSql);

        // TRUE constant is "1 = 1"
        assertEquals("1 = 1", realSql.getSQL());
    }

    @Test(expected = UserException.class)
    public void testVerifyIndexedField_ThrowsUserExceptionWhenNoOrderColumn() {
        FieldMapping mockFieldMapping = mock(FieldMapping.class);
        // Explicitly return null for order column to trigger the exception
        when(mockFieldMapping.getOrderColumn()).thenReturn(null);
        when(mockFieldMapping.getName()).thenReturn("badField");

        path.get(mockFieldMapping, false);

        // This should throw org.apache.openjpa.util.UserException
        path.verifyIndexedField();
    }

    @Test
    public void testAppendType_EmptyColumnsEdgeCase() {
        DBDictionary mockDict = mock(DBDictionary.class);
        SQLBuffer realSql = new SQLBuffer(mockDict);
        Select mockSel = mock(Select.class);
        ExpContext mockCtx = mock(ExpContext.class);

        PCPath.PathExpState state = new PCPath.PathExpState(mock(Joins.class));

        // Set metadata to allow type evaluation
        path.setMetaData(rootClassMapping);
        when(rootClassMapping.getDiscriminator()).thenReturn(null);
        when(rootClassMapping.getPrimaryKeyColumns()).thenReturn(new org.apache.openjpa.jdbc.schema.Column[0]);

        path.appendType(mockSel, mockCtx, state, realSql);

        // If cols array is empty, it appends "1"
        assertEquals("1", realSql.getSQL());
    }
}
