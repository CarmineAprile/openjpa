package org.apache.openjpa.jdbc.kernel.exps.RandoopC4;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PCPathC4RandoopTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1001");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState2.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState2.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray12 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1002");
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
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
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
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1003");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState3.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = null;
        expState3.joins = joins19;
        org.apache.openjpa.jdbc.sql.Joins joins21 = null;
        expState3.joins = joins21;
        org.apache.openjpa.jdbc.sql.Joins joins23 = null;
        expState3.joins = joins23;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer25 = null;
        org.apache.openjpa.jdbc.schema.Column column26 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer25, column26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNull(joins18);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1004");
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
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1005");
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
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    @Ignore
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1006");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1007");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1008");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1009");
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
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1010");
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
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        expState4.joins = joins17;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1011");
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
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState12 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState12.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState12.joins = joins14;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        expState12.joins = joins16;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState12.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState12.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = expState12.joins;
        org.apache.openjpa.jdbc.sql.Joins joins23 = null;
        expState12.joins = joins23;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) joins23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNotNull(expState12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins22);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1012");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState3.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState3.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState3.joins = joins14;
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        org.apache.openjpa.jdbc.schema.Column column18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer17, column18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1013");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState4.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState4.joins = joins22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
        org.junit.Assert.assertNull(joins24);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1014");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1015");
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
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1016");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState4.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins20);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1017");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1018");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState3.joins;
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
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1019");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins20 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
        org.junit.Assert.assertNull(joins20);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1020");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState4.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState4.joins = joins22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        expState4.joins = joins24;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1021");
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer17);
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1022");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState4.joins = joins18;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer20);
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1023");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState4.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState4.joins = joins22;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1024");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState3.joins = joins13;
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
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1025");
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
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        pathExpState5.joins = joins16;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1026");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping11 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1027");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1028");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState2.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState2.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping12 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1029");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        org.apache.openjpa.jdbc.schema.Column column18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer17, column18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    @Ignore
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1030");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1031");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState3.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer20 = null;
        org.apache.openjpa.jdbc.schema.Column column21 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer20, column21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1032");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
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
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1033");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1034");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        pathExpState4.joins = joins11;
        org.apache.openjpa.jdbc.sql.Joins joins13 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        pathExpState4.joins = joins14;
        org.apache.openjpa.jdbc.sql.Joins joins16 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Result result17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1035");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1036");
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
            java.lang.Object obj13 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1037");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
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
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1038");
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
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer17);
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1039");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
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
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1040");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1041");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1042");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState3.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState3.joins = joins14;
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Result result17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = pCPath1.load(expContext2, expState3, result17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1043");
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
            org.apache.openjpa.jdbc.schema.Column[] columnArray13 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1044");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping14 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1045");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1046");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1047");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1048");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
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
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1049");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping8 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1050");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState4.joins = joins18;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState20 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins21 = null;
        expState20.joins = joins21;
        org.apache.openjpa.jdbc.sql.Joins joins23 = null;
        expState20.joins = joins23;
        org.apache.openjpa.jdbc.sql.Joins joins25 = expState20.joins;
        org.apache.openjpa.jdbc.sql.Joins joins26 = expState20.joins;
        org.apache.openjpa.jdbc.sql.Joins joins27 = expState20.joins;
        org.apache.openjpa.jdbc.sql.Joins joins28 = expState20.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) expState20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNotNull(expState20);
        org.junit.Assert.assertNull(joins25);
        org.junit.Assert.assertNull(joins26);
        org.junit.Assert.assertNull(joins27);
        org.junit.Assert.assertNull(joins28);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1051");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNull(joins18);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1052");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1053");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
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
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1054");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1055");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1056");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer17, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1057");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
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
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1058");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer14, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 24 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1059");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1060");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState3.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Result result12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pCPath1.load(expContext2, expState3, result12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1061");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1062");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState3.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState3.joins = joins14;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        org.apache.openjpa.jdbc.schema.Column column17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer16, column17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1063");
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
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1064");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        pathExpState5.joins = joins16;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState18 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState18.joins;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState18.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState18.joins = joins22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        expState18.joins = joins24;
        org.apache.openjpa.jdbc.sql.Joins joins26 = null;
        expState18.joins = joins26;
        org.apache.openjpa.jdbc.sql.Joins joins28 = expState18.joins;
        java.lang.Class<?> wildcardClass29 = expState18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNotNull(expState18);
        org.junit.Assert.assertNull(joins19);
        org.junit.Assert.assertNull(joins28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1065");
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
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1066");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState3.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState3.joins = joins12;
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
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1067");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1068");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState2.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState2.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray13 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1069");
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
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        expState4.joins = joins17;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1070");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        expState4.joins = joins17;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1071");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1072");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pCPath1.getColumns(expState2);
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1073");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState0.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState0.joins;
        java.lang.Class<?> wildcardClass8 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1074");
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
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState4.joins = joins18;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1075");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState4.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins21 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins20);
        org.junit.Assert.assertNull(joins21);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1076");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        pathExpState5.joins = joins15;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1077");
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
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState2.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState2.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping23 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins16);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNull(joins22);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1078");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNull(joins18);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1079");
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
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1080");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
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
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1081");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1082");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1083");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins20 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
        org.junit.Assert.assertNull(joins20);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1084");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState5.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1085");
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
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    @Ignore
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1086");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState4.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins20);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1087");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        pathExpState1.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState1.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = pathExpState1.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = joins8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1088");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1089");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState4.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins20);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1090");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1091");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState4.joins = joins18;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1092");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
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
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1093");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState12.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState12.joins = joins14;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        expState12.joins = joins16;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState12.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState12.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = expState12.joins;
        org.apache.openjpa.jdbc.sql.Joins joins23 = expState12.joins;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        expState12.joins = joins24;
        org.apache.openjpa.jdbc.sql.Joins joins26 = expState12.joins;
        org.apache.openjpa.jdbc.sql.Joins joins27 = expState12.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) expState12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNotNull(expState12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins22);
        org.junit.Assert.assertNull(joins23);
        org.junit.Assert.assertNull(joins26);
        org.junit.Assert.assertNull(joins27);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1094");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cols\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1095");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1096");
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
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        pathExpState5.joins = joins16;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        pathExpState5.joins = joins18;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1097");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1098");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        pathExpState5.joins = joins16;
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
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1099");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState3.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer18 = null;
        org.apache.openjpa.jdbc.schema.Column column19 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer18, column19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1100");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1101");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1102");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState5.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1103");
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
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1104");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1105");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
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
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1106");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
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
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1107");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState3.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState3.joins = joins14;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        org.apache.openjpa.jdbc.schema.Column column17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer16, column17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1108");
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
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
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
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1109");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState4.joins = joins18;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1110");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1111");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        pathExpState1.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState1.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState1.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        pathExpState1.joins = joins9;
        org.junit.Assert.assertNull(joins2);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1112");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState3.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState3.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState3.joins;
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
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1113");
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
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1114");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    @Ignore
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1115");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState4.joins = joins12;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    @Ignore
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1116");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1117");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        pathExpState5.joins = joins16;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1118");
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
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Result result18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = pCPath1.load(expContext2, expState3, result18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins16);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1119");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState2.joins = joins11;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState2.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState2.joins;
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
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1120");
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
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1121");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        pathExpState5.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        pathExpState5.joins = joins18;
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
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1122");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1123");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState2.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState2.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1124");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        org.apache.openjpa.jdbc.schema.Column column17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer16, column17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1125");
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
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState4.joins = joins18;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1126");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState4.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState4.joins = joins22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins25 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState26 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins25);
        org.apache.openjpa.jdbc.sql.Joins joins27 = pathExpState26.joins;
        org.apache.openjpa.jdbc.sql.Joins joins28 = null;
        pathExpState26.joins = joins28;
        org.apache.openjpa.jdbc.sql.Joins joins30 = pathExpState26.joins;
        org.apache.openjpa.jdbc.sql.Joins joins31 = null;
        pathExpState26.joins = joins31;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) joins31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
        org.junit.Assert.assertNull(joins24);
        org.junit.Assert.assertNull(joins27);
        org.junit.Assert.assertNull(joins30);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1127");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState4.joins;
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
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1128");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState20 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins19);
        org.apache.openjpa.jdbc.sql.Joins joins21 = null;
        pathExpState20.joins = joins21;
        org.apache.openjpa.jdbc.sql.Joins joins23 = pathExpState20.joins;
        java.lang.Class<?> wildcardClass24 = pathExpState20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1129");
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
            pCPath1.select(select2, expContext3, expState4, true);
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
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1130");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1131");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1132");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        pathExpState5.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = pathExpState5.joins;
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
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1133");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer14, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1134");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState4.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState4.joins = joins22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
        org.junit.Assert.assertNull(joins24);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1135");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.Result result9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1136");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1137");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray13 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    @Ignore
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1138");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    @Ignore
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1139");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
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
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1140");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNull(joins18);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1141");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState4.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1142");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
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
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1143");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState2.joins = joins8;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1144");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState4.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState4.joins = joins22;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1145");
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
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1146");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1147");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping7 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1148");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState3.joins;
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
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1149");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
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
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1150");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState3.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        org.apache.openjpa.jdbc.schema.Column column13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer12, column13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1151");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState4.joins = joins18;
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
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1152");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState2.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping11 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1153");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState15 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        expState15.joins = joins16;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState15.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState15.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState15.joins = joins22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = expState15.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) expState15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNotNull(expState15);
        org.junit.Assert.assertNull(joins24);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1154");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1155");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1156");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1157");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState2.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState2.joins = joins9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState2.joins = joins11;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState2.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1158");
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
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
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
        org.junit.Assert.assertNull(joins16);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1159");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        expState3.joins = joins16;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState3.joins = joins18;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer20 = null;
        org.apache.openjpa.jdbc.schema.Column column21 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer20, column21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1160");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1161");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer18, 19);
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1162");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState2.joins = joins13;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping15 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1163");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1164");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState2.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState2.joins = joins15;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray17 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1165");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState4.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState4.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNull(joins18);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1166");
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
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNull(joins18);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1167");
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
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1168");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState0.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState0.joins = joins14;
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        expState0.joins = joins17;
        org.apache.openjpa.jdbc.sql.Joins joins19 = null;
        expState0.joins = joins19;
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1169");
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
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        pathExpState5.joins = joins16;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1170");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState0.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState0.joins;
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1171");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState0.joins;
        java.lang.Class<?> wildcardClass14 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1172");
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
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1173");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState0.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState0.joins = joins7;
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1174");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1175");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState3.joins = joins15;
        org.apache.openjpa.jdbc.sql.Result result17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = pCPath1.load(expContext2, expState3, result17);
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
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1176");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
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
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1177");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState4.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState4.joins = joins22;
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
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1178");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Result result10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    @Ignore
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1179");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
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
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1180");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState4.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState4.joins = joins20;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer22);
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
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1181");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState0.joins;
        java.lang.Class<?> wildcardClass13 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1182");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState4.joins;
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
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1183");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState3.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState3.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState3.joins = joins14;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        org.apache.openjpa.jdbc.schema.Column column17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer16, column17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1184");
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
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1185");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1186");
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
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1187");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = pathExpState5.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1188");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState2.joins = joins18;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping20 = pCPath1.getFieldMapping(expState2);
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
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1189");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        expState4.joins = joins20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState4.joins = joins22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        expState4.joins = joins24;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1190");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState13 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState13.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState13.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState13.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState13.joins = joins18;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) expState13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNotNull(expState13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1191");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState4.joins;
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
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1192");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cols\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest2.test1193");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping15 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }
}

