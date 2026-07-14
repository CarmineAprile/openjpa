package org.apache.openjpa.jdbc.kernel.exps.RandoopC4;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PCPathC4RandoopTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0001");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.EXP_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20 + "'", int0 == 20);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0002");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0003");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.SUBSTRING_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0004");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.LOCATE_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0005");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.SQRT_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0006");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.CONCAT_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0007");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.FLOOR_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 21 + "'", int0 == 21);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0008");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.FORCE_OUTER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0009");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.NULLIF_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 18 + "'", int0 == 18);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0010");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.COALESCE_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0011");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.ABS_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0012");
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0013");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.ARGS_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0014");
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0015");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.WHENSCALAR_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0016");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.INDEXOF_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0017");
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
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0018");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.CMP_EQUAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0019");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.JOIN_REL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0020");
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0021");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cols\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0022");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.EXTRACTDTF_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24 + "'", int0 == 24);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0023");
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
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0024");
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
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0025");
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
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0026");
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
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0027");
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
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0028");
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
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0029");
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
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0030");
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0031");
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
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0032");
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
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0033");
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0034");
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0035");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.LN_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 22 + "'", int0 == 22);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0036");
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
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0037");
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
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0038");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.getKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"data\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0039");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.CEILING_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 19 + "'", int0 == 19);
    }

    @Test
    @Ignore
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0040");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0041");
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0042");
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
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0043");
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0044");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.TRIM_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0045");
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0046");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.LOWER_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0047");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.WHENCONDITION_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0048");
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0049");
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0050");
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0051");
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0052");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.SIGN_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 23 + "'", int0 == 23);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0053");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.MATH_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0054");
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
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0055");
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0056");
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0057");
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
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0058");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.EXTRACTDTP_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 25 + "'", int0 == 25);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0059");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.SIMPLECASE_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0060");
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
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0061");
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0062");
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
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0063");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.LENGTH_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0064");
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
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0065");
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0066");
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0067");
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0068");
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0069");
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0070");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.UPPER_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0071");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.GENERALCASE_VAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0072");
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0073");
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0074");
        int int0 = org.apache.openjpa.jdbc.kernel.exps.Val.NULL_CMP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0075");
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0076");
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
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0077");
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
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0078");
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
    @Ignore
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0079");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.XMLMetaData xMLMetaData2 = pCPath1.getXmlMapping();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.LinkedList.getLast()\" because \"this._actions\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0080");
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0081");
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
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0082");
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0083");
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0084");
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0085");
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0086");
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0087");
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0088");
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0089");
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0090");
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
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0091");
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0092");
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0093");
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0094");
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0095");
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0096");
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
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0097");
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0098");
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
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0099");
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
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0100");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        java.lang.Class<?> wildcardClass2 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0101");
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
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0102");
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0103");
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0104");
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0105");
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0106");
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0107");
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0108");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0109");
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0110");
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0111");
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
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0112");
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0113");
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
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0114");
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
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0115");
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0116");
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0117");
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0118");
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0119");
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0120");
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0121");
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0122");
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0123");
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0124");
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0125");
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
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0126");
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0127");
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0128");
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
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0129");
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0130");
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0131");
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0132");
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0133");
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0134");
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0135");
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0136");
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0137");
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0138");
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
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0139");
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0140");
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0141");
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0142");
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0143");
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
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0144");
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0145");
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0146");
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0147");
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0148");
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
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0149");
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0150");
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0151");
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0152");
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
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0153");
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
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0154");
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
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0155");
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0156");
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0157");
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0158");
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0159");
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0160");
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0161");
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0162");
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0163");
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0164");
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0165");
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0166");
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0167");
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0168");
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0169");
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
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0170");
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0171");
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0172");
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0173");
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0174");
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
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0175");
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
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0176");
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
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    @Ignore
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0177");
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
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0178");
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0179");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        java.lang.Class<?> wildcardClass2 = pathExpState1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0180");
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0181");
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0182");
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
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0183");
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0184");
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0185");
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0186");
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0187");
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0188");
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0189");
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0190");
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0191");
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0192");
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0193");
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0194");
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0195");
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0196");
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0197");
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0198");
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0199");
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0200");
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0201");
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0202");
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0203");
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
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0204");
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0205");
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0206");
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
    @Ignore
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0207");
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
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0208");
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0209");
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
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0210");
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0211");
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
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0212");
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0213");
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0214");
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0215");
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0216");
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
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0217");
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0218");
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0219");
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
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0220");
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
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0221");
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0222");
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0223");
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0224");
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0225");
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0226");
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0227");
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0228");
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0229");
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0230");
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0231");
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0232");
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0233");
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0234");
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0235");
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
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0236");
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0237");
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0238");
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0239");
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0240");
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
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0241");
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0242");
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0243");
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0244");
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
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0245");
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0246");
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
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0247");
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0248");
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0249");
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0250");
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0251");
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
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0252");
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0253");
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
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0254");
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0255");
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
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0256");
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0257");
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0258");
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0259");
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0260");
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
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0261");
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
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0262");
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0263");
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0264");
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
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0265");
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0266");
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
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0267");
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0268");
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0269");
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0270");
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0271");
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0272");
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
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0273");
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
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0274");
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
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0275");
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0276");
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0277");
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0278");
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0279");
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
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0280");
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0281");
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
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0282");
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
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0283");
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0284");
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0285");
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0286");
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0287");
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
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0288");
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0289");
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0290");
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0291");
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0292");
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0293");
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0294");
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0295");
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
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0296");
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0297");
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0298");
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0299");
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0300");
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0301");
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0302");
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0303");
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
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0304");
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0305");
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0306");
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0307");
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
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0308");
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0309");
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0310");
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
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0311");
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0312");
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0313");
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0314");
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0315");
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0316");
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0317");
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0318");
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0319");
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
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0320");
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0321");
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0322");
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0323");
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0324");
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0325");
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0326");
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
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0327");
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
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0328");
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
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0329");
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0330");
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0331");
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0332");
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0333");
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
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0334");
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0335");
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0336");
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0337");
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
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0338");
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0339");
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
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0340");
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0341");
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0342");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        java.lang.Class<?> wildcardClass3 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0343");
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0344");
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
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0345");
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
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0346");
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0347");
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0348");
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0349");
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0350");
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0351");
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0352");
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0353");
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0354");
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0355");
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0356");
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0357");
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0358");
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0359");
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0360");
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0361");
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0362");
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0363");
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0364");
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
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0365");
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0366");
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
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0367");
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0368");
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0369");
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0370");
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0371");
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0372");
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0373");
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0374");
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0375");
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0376");
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0377");
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0378");
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0379");
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
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0380");
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
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0381");
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
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0382");
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0383");
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
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0384");
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0385");
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0386");
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0387");
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0388");
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0389");
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0390");
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
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0391");
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0392");
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0393");
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0394");
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0395");
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0396");
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0397");
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0398");
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0399");
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0400");
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0401");
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0402");
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0403");
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0404");
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
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0405");
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
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0406");
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0407");
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
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0408");
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0409");
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0410");
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0411");
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0412");
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0413");
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0414");
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0415");
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0416");
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0417");
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0418");
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
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0419");
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0420");
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0421");
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0422");
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0423");
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0424");
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0425");
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0426");
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0427");
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0428");
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0429");
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0430");
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0431");
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0432");
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0433");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0434");
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0435");
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0436");
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0437");
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0438");
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0439");
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0440");
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0441");
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0442");
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0443");
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0444");
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0445");
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
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0446");
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0447");
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0448");
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0449");
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0450");
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0451");
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0452");
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0453");
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0454");
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0455");
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0456");
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0457");
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0458");
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0459");
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0460");
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
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0461");
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0462");
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0463");
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
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0464");
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0465");
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0466");
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0467");
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0468");
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0469");
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0470");
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0471");
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0472");
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0473");
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0474");
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0475");
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0476");
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0477");
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0478");
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0479");
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0480");
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0481");
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0482");
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0483");
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0484");
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0485");
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0486");
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0487");
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0488");
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0489");
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0490");
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0491");
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0492");
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0493");
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
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0494");
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0495");
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
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0496");
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0497");
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

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0498");
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
        org.apache.openjpa.jdbc.sql.Result result13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = pCPath1.load(expContext2, expState3, result13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0499");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState2.joins = joins14;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        expState2.joins = joins16;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping18 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest0.test0500");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState5.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        pathExpState5.joins = joins8;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

