package org.apache.openjpa.jdbc.kernel.exps.RandoopC3;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PCPathC3RandoopTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test001");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.EXP_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20 + "'", int0 == 20);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test002");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test003");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.SUBSTRING_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test004");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.LOCATE_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test005");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.SQRT_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test006");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.CONCAT_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test007");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.FLOOR_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 21 + "'", int0 == 21);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test008");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.FORCE_OUTER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test009");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.NULLIF_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 18 + "'", int0 == 18);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test010");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.COALESCE_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test011");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.ABS_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test012");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = pCPath1.getXPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.LinkedList.iterator()\" because \"this._actions\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test013");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.ARGS_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test014");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cmpfield\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test015");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.WHENSCALAR_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test016");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.INDEXOF_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test017");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cols\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test018");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.CMP_EQUAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test019");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.JOIN_REL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test020");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"field\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test021");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test022");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.EXTRACTDTF_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24 + "'", int0 == 24);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test023");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cols\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test024");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.kernel.exps.ExpressionVisitor expressionVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.acceptVisit(expressionVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.kernel.exps.ExpressionVisitor.enter(org.apache.openjpa.kernel.exps.Value)\" because \"visitor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test025");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Result result4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = pCPath1.load(expContext2, expState3, result4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test026");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test027");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test028");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test029");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test030");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer4 = null;
        org.apache.openjpa.jdbc.schema.Column column5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer4, column5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test031");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test032");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test033");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping3 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test034");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test035");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.LN_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 22 + "'", int0 == 22);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test036");
        org.apache.openjpa.jdbc.kernel.exps.SubQ subQ0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(subQ0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.kernel.exps.SubQ.getCandidate()\" because \"sub\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test037");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test038");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.CEILING_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 19 + "'", int0 == 19);
    }

    @Test
    @Ignore
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test039");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test040");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray4 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test041");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer6, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test042");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test043");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.TRIM_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test044");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test045");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.LOWER_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test046");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.WHENCONDITION_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test047");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test048");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test049");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test050");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test051");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.SIGN_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 23 + "'", int0 == 23);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test052");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.MATH_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test053");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test054");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        org.apache.openjpa.jdbc.schema.Column column7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, sQLBuffer6, column7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test055");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        org.apache.openjpa.jdbc.schema.Column column6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer5, column6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test056");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        java.lang.Class<?> wildcardClass1 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test057");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.meta.XMLMetaData xMLMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.get(xMLMetaData2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.XMLMetaData.getFieldMapping(String)\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test058");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.EXTRACTDTP_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 25 + "'", int0 == 25);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test059");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.SIMPLECASE_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test060");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = pathExpState1.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = joins2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test061");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test062");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test063");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.LENGTH_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test064");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.meta.XMLMetaData xMLMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.get(xMLMetaData2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.XMLMetaData.getFieldMapping(String)\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test065");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        org.apache.openjpa.jdbc.schema.Column column6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, sQLBuffer5, column6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test066");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test067");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test068");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test069");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test070");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.UPPER_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test071");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.GENERALCASE_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test072");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test073");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Result result7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pCPath1.load(expContext2, expState3, result7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test074");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.NULL_CMP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test075");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"field\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test076");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test077");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState2.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray8 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test078");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test079");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test080");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test081");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test082");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState2.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test083");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test084");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test085");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    @Ignore
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test086");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.verifyIndexedField();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"data\" because \"lastAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test087");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test088");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"field\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test089");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test090");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test091");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test092");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test093");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer8, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test094");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test095");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test096");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test097");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test098");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test099");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        org.apache.openjpa.jdbc.schema.Column column8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer7, column8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test100");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        java.lang.Class<?> wildcardClass2 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test101");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"field\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test102");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test103");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test104");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test105");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test106");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test107");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test108");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test109");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test110");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test111");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test112");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test113");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test114");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState2.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState2.joins = joins8;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping10 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test115");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping3 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test116");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray6 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test117");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test118");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test119");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Result result6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pCPath1.load(expContext2, expState3, result6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test120");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test121");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test122");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Result result6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test123");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test124");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test125");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test126");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test127");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test128");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        org.apache.openjpa.jdbc.schema.Column column9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, sQLBuffer8, column9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test129");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test130");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test131");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState3.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        org.apache.openjpa.jdbc.schema.Column column10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer9, column10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test132");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test133");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test134");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test135");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test136");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test137");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test138");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState10 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState10.joins;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState10.joins = joins12;
        java.lang.Class<?> wildcardClass14 = expState10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) expState10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNotNull(expState10);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test139");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test140");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test141");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test142");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState2.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState2.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState2.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping12 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    @Ignore
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test143");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test144");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test145");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test146");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test147");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test148");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test149");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = joins1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test150");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test151");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test152");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test153");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        expState0.joins = joins2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState0.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState0.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState0.joins = joins8;
        java.lang.Class<?> wildcardClass10 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test154");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Result result8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test155");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test156");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test157");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping4 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test158");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test159");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test160");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test161");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test162");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState2.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping8 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test163");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray3 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cols\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test164");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test165");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Result result5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test166");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test167");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState2.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState2.joins = joins8;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray10 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test168");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping6 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    @Ignore
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test169");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test170");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test171");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test172");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test173");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test174");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test175");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    @Ignore
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test176");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    @Ignore
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test177");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test178");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test179");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        java.lang.Class<?> wildcardClass2 = pathExpState1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test180");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test181");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test182");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState3.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState3.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState3.joins = joins11;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer13 = null;
        org.apache.openjpa.jdbc.schema.Column column14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer13, column14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test183");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test184");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test185");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test186");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping5 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test187");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test188");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test189");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test190");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState2.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState2.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState2.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test191");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState3.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        org.apache.openjpa.jdbc.schema.Column column9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer8, column9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test192");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test193");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test194");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray7 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test195");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState3.joins = joins7;
        org.apache.openjpa.jdbc.sql.Result result9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pCPath1.load(expContext2, expState3, result9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test196");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Result result5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = pCPath1.load(expContext2, expState3, result5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test197");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test198");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test199");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test200");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test201");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test202");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test203");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test204");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test205");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test206");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        org.apache.openjpa.jdbc.schema.Column column7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer6, column7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test207");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        expState0.joins = joins2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState0.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState0.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState0.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState0.joins;
        java.lang.Class<?> wildcardClass11 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    @Ignore
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test208");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test209");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test210");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test211");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test212");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test213");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test214");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test215");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test216");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState4.joins = joins14;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test217");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test218");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState3.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState3.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState3.joins = joins11;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState3.joins = joins13;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        org.apache.openjpa.jdbc.schema.Column column16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer15, column16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test219");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    @Ignore
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test220");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test221");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test222");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState3.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState3.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState3.joins = joins11;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Result result15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = pCPath1.load(expContext2, expState3, result15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test223");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test224");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test225");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState3.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Result result9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pCPath1.load(expContext2, expState3, result9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test226");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test227");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test228");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test229");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping7 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test230");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        expState0.joins = joins2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState0.joins;
        java.lang.Class<?> wildcardClass5 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test231");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test232");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test233");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test234");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState4.joins = joins14;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test235");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test236");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray3 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    @Ignore
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test237");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test238");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        expState0.joins = joins2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState0.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState0.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState0.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState0.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = joins11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test239");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState4.joins = joins14;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test240");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState4.joins = joins14;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState16 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState16.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState16.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState16.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState16.joins = joins22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        expState16.joins = joins24;
        org.apache.openjpa.jdbc.sql.Joins joins26 = expState16.joins;
        org.apache.openjpa.jdbc.sql.Joins joins27 = expState16.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) joins27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNotNull(expState16);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNull(joins26);
        org.junit.Assert.assertNull(joins27);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test241");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test242");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test243");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test244");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = pCPath1.toDataStoreValue(select2, expContext3, expState4, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cmpfield\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test245");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test246");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test247");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test248");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping6 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test249");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test250");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test251");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        org.apache.openjpa.jdbc.schema.Column column8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer7, column8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test252");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test253");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test254");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping7 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test255");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test256");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test257");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test258");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test259");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        org.apache.openjpa.jdbc.schema.Column column10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, sQLBuffer9, column10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test260");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState4.joins = joins14;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test261");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState2.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState2.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState2.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test262");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test263");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test264");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer15, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test265");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test266");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test267");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer14, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test268");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState4.joins = joins14;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test269");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test270");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test271");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test272");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test273");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test274");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState2.joins = joins7;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test275");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test276");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        pathExpState1.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState1.joins;
        java.lang.Class<?> wildcardClass6 = pathExpState1.getClass();
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test277");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test278");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test279");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test280");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test281");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test282");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test283");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test284");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test285");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test286");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cmpfield\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test287");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState0.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = joins3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test288");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test289");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test290");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState9 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState9.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState9.joins = joins12;
        java.lang.Class<?> wildcardClass14 = expState9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) expState9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNotNull(expState9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test291");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test292");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        org.apache.openjpa.jdbc.schema.Column column8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, sQLBuffer7, column8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test293");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test294");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test295");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer5, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cols\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test296");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        expState0.joins = joins2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState0.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState0.joins = joins6;
        java.lang.Class<?> wildcardClass8 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test297");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test298");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"field\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test299");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cols\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test300");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray8 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test301");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer7, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test302");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        org.apache.openjpa.jdbc.schema.Column column9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer8, column9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test303");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test304");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test305");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState5.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test306");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test307");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test308");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test309");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test310");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test311");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test312");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        pathExpState1.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState1.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = joins5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test313");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState5.joins = joins7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) joins7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cmpfield\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState5);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test314");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray5 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test315");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping7 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test316");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test317");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState6 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState6.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) joins7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNotNull(expState6);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test318");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test319");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test320");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        expState0.joins = joins2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState0.joins = joins4;
        java.lang.Class<?> wildcardClass6 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test321");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test322");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState4.joins = joins14;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test323");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer9, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test324");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test325");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test326");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test327");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState5.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test328");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test329");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test330");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test331");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test332");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState3.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState3.joins = joins9;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        org.apache.openjpa.jdbc.schema.Column column12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer11, column12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test333");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState5.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test334");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    @Ignore
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test335");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test336");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer4 = null;
        org.apache.openjpa.jdbc.schema.Column column5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer4, column5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test337");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test338");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test339");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test340");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer6, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 15 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test341");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test342");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState4.joins = joins14;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer16, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test343");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState0.joins;
        java.lang.Class<?> wildcardClass4 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test344");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        pathExpState1.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState1.joins = joins6;
        java.lang.Class<?> wildcardClass8 = pathExpState1.getClass();
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test345");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        java.lang.Class<?> wildcardClass3 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test346");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test347");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test348");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState0.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState0.joins = joins5;
        java.lang.Class<?> wildcardClass7 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test349");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState3.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        org.apache.openjpa.jdbc.schema.Column column10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer9, column10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test350");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        pathExpState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.Result result11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test351");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer5, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cols\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test352");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer9, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test353");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test354");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test355");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test356");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState2.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray10 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test357");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test358");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test359");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer11, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test360");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test361");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState10 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState10.joins = joins11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) joins11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNotNull(expState10);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test362");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test363");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test364");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test365");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test366");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test367");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState5.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test368");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"field\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test369");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        pathExpState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        org.apache.openjpa.jdbc.schema.Column column12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, sQLBuffer11, column12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test370");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping3 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"field\" because \"state\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test371");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState3.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState3.joins = joins8;
        org.apache.openjpa.jdbc.sql.Result result10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pCPath1.load(expContext2, expState3, result10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test372");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test373");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState3.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState3.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState3.joins = joins11;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        org.apache.openjpa.jdbc.schema.Column column16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer15, column16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test374");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test375");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test376");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState4.joins = joins14;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer16, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test377");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test378");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer10, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test379");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test380");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test381");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test382");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test383");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test384");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test385");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test386");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState5.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test387");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test388");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test389");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test390");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState5.joins = joins6;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test391");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test392");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping7 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test393");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer9, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test394");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray7 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test395");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test396");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test397");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"field\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test398");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping7 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test399");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState0.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState0.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState0.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = joins7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test400");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test401");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test402");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = null;
        org.apache.openjpa.jdbc.sql.Result result4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = pCPath1.load(expContext2, expState3, result4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"field\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test403");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer15, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test404");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test405");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState12 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState12.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState12.joins = joins14;
        java.lang.Class<?> wildcardClass16 = expState12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNotNull(expState12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test406");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    @Ignore
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test407");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState4.joins = joins14;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test408");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test409");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test410");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        pathExpState5.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test411");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test412");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer5, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cols\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test413");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping8 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test414");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test415");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        pathExpState5.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer15, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test416");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test417");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test418");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState3.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        org.apache.openjpa.jdbc.schema.Column column11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer10, column11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test419");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        pathExpState5.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test420");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer5, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cols\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test421");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test422");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        pathExpState1.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState1.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        pathExpState1.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = pathExpState1.joins;
        java.lang.Class<?> wildcardClass11 = pathExpState1.getClass();
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test423");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test424");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test425");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test426");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        expState0.joins = joins2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState0.joins = joins5;
        java.lang.Class<?> wildcardClass7 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test427");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState4.joins = joins14;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test428");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test429");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test430");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState8 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState8.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState8.joins = joins11;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState8.joins;
        java.lang.Class<?> wildcardClass14 = expState8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNotNull(expState8);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test431");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test432");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState3.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState3.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState3.joins = joins11;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        org.apache.openjpa.jdbc.schema.Column column15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer14, column15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test433");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        pathExpState5.joins = joins9;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test434");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test435");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test436");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test437");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test438");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState11 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState11.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState11.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState11.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        expState11.joins = joins16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) joins16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNotNull(expState11);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test439");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test440");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test441");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test442");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        pathExpState5.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test443");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray7 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test444");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer12, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test445");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test446");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test447");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    @Ignore
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test448");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test449");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test450");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test451");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test452");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState2.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState2.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState2.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping13 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test453");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test454");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test455");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test456");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        pathExpState5.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer12, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test457");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test458");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState4.joins = joins11;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test459");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState3.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        org.apache.openjpa.jdbc.schema.Column column10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer9, column10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test460");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState4.joins = joins11;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test461");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        pathExpState5.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test462");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState3.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState3.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        org.apache.openjpa.jdbc.schema.Column column12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer11, column12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test463");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test464");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState3.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        org.apache.openjpa.jdbc.schema.Column column12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer11, column12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test465");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test466");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        expState4.joins = joins16;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test467");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test468");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState4.joins = joins14;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test469");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test470");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test471");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        pathExpState5.joins = joins9;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test472");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test473");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test474");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        pathExpState1.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState1.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = pathExpState1.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = joins7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test475");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        pathExpState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        org.apache.openjpa.jdbc.schema.Column column11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, sQLBuffer10, column11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test476");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test477");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test478");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState2.joins = joins6;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray8 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test479");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test480");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState4.joins;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState12 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState12.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState12.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        expState12.joins = joins17;
        org.apache.openjpa.jdbc.sql.Joins joins19 = null;
        expState12.joins = joins19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) expState12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNotNull(expState12);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test481");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test482");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test483");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test484");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState4.joins = joins11;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test485");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test486");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState14 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState14.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        expState14.joins = joins16;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState14.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState14.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState14.joins = joins22;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) joins22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNotNull(expState14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test487");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test488");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState2.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState2.joins = joins9;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray11 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test489");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Result result9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test490");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState4.joins = joins9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test491");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState3.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState3.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState3.joins = joins11;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState3.joins = joins14;
        org.apache.openjpa.jdbc.sql.Result result16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pCPath1.load(expContext2, expState3, result16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test492");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        pathExpState5.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        pathExpState5.joins = joins14;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test493");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test494");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test495");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState2.joins = joins7;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray9 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test496");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        pathExpState5.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        pathExpState5.joins = joins14;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test497");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        expState0.joins = joins2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState0.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState0.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState0.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState0.joins = joins11;
        java.lang.Class<?> wildcardClass13 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test498");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        pathExpState5.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test499");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState2.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest0.test500");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        expState4.joins = joins16;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }
}

