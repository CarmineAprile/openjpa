package org.apache.openjpa.jdbc.kernel.exps.RandoopC3;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PCPathC3RandoopTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test501");
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
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test502");
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
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test503");
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

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test504");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer15, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test505");
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
            int int13 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test506");
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
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test507");
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
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test508");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test509");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test510");
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
            java.lang.Object obj13 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test511");
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
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test512");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test513");
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
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    @Ignore
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test514");
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
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test515");
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
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test516");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test517");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState0.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState0.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState0.joins = joins7;
        java.lang.Class<?> wildcardClass9 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test518");
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
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test519");
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
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test520");
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
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test521");
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
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test522");
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
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState12 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins13 = expState12.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        expState12.joins = joins14;
        org.apache.openjpa.jdbc.sql.Joins joins16 = expState12.joins;
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        expState12.joins = joins17;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState12.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) joins19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNotNull(expState12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins16);
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    @Ignore
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test523");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test524");
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
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test525");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray11 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test526");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState0.joins = joins10;
        java.lang.Class<?> wildcardClass12 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test527");
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
            int int11 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test528");
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
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test529");
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
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test530");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState3.joins;
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
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test531");
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
            java.lang.Object obj17 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    @Ignore
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test532");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test533");
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
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping9 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test534");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test535");
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
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test536");
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
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState16 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins15);
        org.apache.openjpa.jdbc.sql.Joins joins17 = pathExpState16.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        pathExpState16.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = pathExpState16.joins;
        org.apache.openjpa.jdbc.sql.Joins joins21 = null;
        pathExpState16.joins = joins21;
        org.apache.openjpa.jdbc.sql.Joins joins23 = null;
        pathExpState16.joins = joins23;
        org.apache.openjpa.jdbc.sql.Joins joins25 = pathExpState16.joins;
        org.apache.openjpa.jdbc.sql.Joins joins26 = null;
        pathExpState16.joins = joins26;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) pathExpState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNull(joins20);
        org.junit.Assert.assertNull(joins25);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test537");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test538");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
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
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test539");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState5.joins = joins7;
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test540");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test541");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer16);
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
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test542");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test543");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer6, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test544");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test545");
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
            int int20 = pCPath1.length(select2, expContext3, expState4);
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
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test546");
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
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test547");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cmpfield\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test548");
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
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test549");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test550");
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
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test551");
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
            pCPath1.orderBy(select2, expContext3, expState4, false);
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
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test552");
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
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test553");
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test554");
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
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer15, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test555");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer15, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test556");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping3 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"field\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test557");
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
        java.lang.Class<?> wildcardClass12 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test558");
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
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test559");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = pCPath1.getFieldMapping(expState2);
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
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test560");
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
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping10 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test561");
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
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test562");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        pathExpState1.joins = joins2;
        java.lang.Class<?> wildcardClass4 = pathExpState1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test563");
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
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test564");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState3.joins;
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
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test565");
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
            pCPath1.orderBy(select2, expContext3, expState4, false);
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
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test566");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test567");
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
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test568");
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
            int int12 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test569");
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
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test570");
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
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test571");
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
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test572");
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
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test573");
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
        // The following exception was thrown during execution in test generation
        try {
            int int10 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test574");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test575");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = joins10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test576");
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
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer12);
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
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test577");
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
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState15 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins14);
        org.apache.openjpa.jdbc.sql.Joins joins16 = pathExpState15.joins;
        java.lang.Class<?> wildcardClass17 = pathExpState15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test578");
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
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer18);
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
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test579");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState10.joins = joins13;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState10.joins;
        java.lang.Class<?> wildcardClass16 = expState10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) expState10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNotNull(expState10);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test580");
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
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test581");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test582");
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
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test583");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        expState0.joins = joins2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState0.joins;
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
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test584");
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
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test585");
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
            java.lang.Object obj13 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test586");
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
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test587");
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
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test588");
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
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping16 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test589");
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
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState17 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins16);
        org.apache.openjpa.jdbc.sql.Joins joins18 = pathExpState17.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = null;
        pathExpState17.joins = joins19;
        org.apache.openjpa.jdbc.sql.Joins joins21 = pathExpState17.joins;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        pathExpState17.joins = joins22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        pathExpState17.joins = joins24;
        org.apache.openjpa.jdbc.sql.Joins joins26 = pathExpState17.joins;
        org.apache.openjpa.jdbc.sql.Joins joins27 = pathExpState17.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) pathExpState17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins21);
        org.junit.Assert.assertNull(joins26);
        org.junit.Assert.assertNull(joins27);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test590");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = pathExpState4.joins;
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
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test591");
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
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test592");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer12);
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
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test593");
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
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test594");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test595");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test596");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping11 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test597");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins12 = pathExpState1.joins;
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test598");
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
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test599");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray10 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test600");
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
            java.lang.Object obj10 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test601");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer12, (int) (short) -1);
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
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test602");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        pathExpState4.joins = joins7;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer9 = null;
        org.apache.openjpa.jdbc.schema.Column column10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, sQLBuffer9, column10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test603");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer12);
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
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test604");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Result result8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test605");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test606");
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
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping16 = pCPath1.getClassMapping(expState2);
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
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test607");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer21);
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
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test608");
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
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test609");
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
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer12, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test610");
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
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test611");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test612");
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
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test613");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test614");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer19, (int) (short) 1);
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
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test615");
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
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test616");
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
        java.lang.Class<?> wildcardClass16 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test617");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer18);
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
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test618");
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
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test619");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer15, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test620");
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
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test621");
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
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pCPath1.toDataStoreValue(select2, expContext3, expState4, obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test622");
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
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test623");
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
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test624");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState3.joins;
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
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test625");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState0.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState0.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState0.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState0.joins;
        java.lang.Class<?> wildcardClass11 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test626");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test627");
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
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test628");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test629");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test630");
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
            pCPath1.selectColumns(select2, expContext3, expState4, true);
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
    @Ignore
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test631");
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
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test632");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        expState0.joins = joins2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState0.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState0.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState0.joins = joins9;
        java.lang.Class<?> wildcardClass11 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test633");
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
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping13 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test634");
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
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test635");
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
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test636");
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
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test637");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState3.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Result result8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pCPath1.load(expContext2, expState3, result8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test638");
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
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer15, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test639");
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
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray20 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test640");
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
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test641");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        pathExpState1.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState1.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = pathExpState1.joins;
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test642");
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
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer10);
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
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test643");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer16, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    @Ignore
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test644");
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
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test645");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test646");
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
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test647");
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
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test648");
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
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray15 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test649");
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
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test650");
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
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test651");
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
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test652");
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
            pCPath1.selectColumns(select2, expContext3, expState4, false);
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
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test653");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        pathExpState5.joins = joins11;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test654");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test655");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test656");
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
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test657");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer10);
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
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test658");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer17, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test659");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState0.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState0.joins = joins6;
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test660");
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
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = pCPath1.getFieldMapping(expState2);
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
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test661");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer10, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    @Ignore
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test662");
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
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins18);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test663");
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
        org.apache.openjpa.jdbc.sql.Joins joins17 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Result result19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = pCPath1.load(expContext2, expState3, result19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
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
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test664");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer11, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test665");
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test666");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test667");
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
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test668");
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
            pCPath1.select(select2, expContext3, expState4, false);
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
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test669");
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
            java.lang.Object obj16 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test670");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState1.joins = joins10;
        java.lang.Class<?> wildcardClass12 = pathExpState1.getClass();
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test671");
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
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer19);
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
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test672");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState0.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState0.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState0.joins = joins7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        expState0.joins = joins11;
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC3.PCPathC3RandoopTest1.test673");
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
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }
}

