package org.apache.openjpa.jdbc.kernel.exps.RandoopC4;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PCPathC4RandoopTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0501");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0502");
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0503");
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
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0504");
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0505");
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0506");
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0507");
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0508");
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0509");
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0510");
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0511");
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0512");
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
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0513");
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
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0514");
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0515");
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0516");
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0517");
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
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0518");
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0519");
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0520");
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
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0521");
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0522");
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
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0523");
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0524");
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
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0525");
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0526");
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
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0527");
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0528");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0529");
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
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0530");
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0531");
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
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0532");
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
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0533");
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0534");
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0535");
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0536");
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0537");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0538");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0539");
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
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0540");
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0541");
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0542");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0543");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0544");
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
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0545");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0546");
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
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0547");
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0548");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0549");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0550");
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
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0551");
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
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0552");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0553");
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
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0554");
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
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0555");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0556");
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
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0557");
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0558");
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0559");
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0560");
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0561");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0562");
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0563");
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
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0564");
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0565");
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
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0566");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0567");
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0568");
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
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0569");
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0570");
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0571");
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
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0572");
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
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0573");
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0574");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0575");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0576");
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
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0577");
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0578");
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0579");
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0580");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0581");
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
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0582");
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0583");
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0584");
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
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0585");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0586");
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0587");
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
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0588");
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0589");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0590");
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
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0591");
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
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0592");
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
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0593");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0594");
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
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0595");
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
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0596");
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0597");
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
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0598");
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
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0599");
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0600");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0601");
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0602");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0603");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0604");
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
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0605");
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0606");
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0607");
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
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0608");
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
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0609");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0610");
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
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0611");
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0612");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0613");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0614");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0615");
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0616");
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
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0617");
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
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0618");
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0619");
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0620");
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
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0621");
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
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0622");
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0623");
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
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0624");
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
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0625");
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
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0626");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0627");
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
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0628");
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0629");
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
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0630");
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
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0631");
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0632");
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0633");
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0634");
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
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0635");
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
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0636");
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
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0637");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0638");
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
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0639");
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0640");
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0641");
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0642");
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
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0643");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0644");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0645");
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
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0646");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0647");
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
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0648");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0649");
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0650");
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0651");
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0652");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0653");
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
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0654");
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
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0655");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0656");
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0657");
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0658");
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
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0659");
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
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0660");
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0661");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0662");
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
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0663");
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0664");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0665");
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

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0666");
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
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
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
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0667");
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
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping8 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0668");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    @Ignore
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0669");
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
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer12);
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0670");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0671");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState4.joins = joins5;
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pCPath1.toDataStoreValue(select2, expContext3, expState4, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0672");
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
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0673");
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
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState20 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins21 = expState20.joins;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState20.joins = joins22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        expState20.joins = joins24;
        org.apache.openjpa.jdbc.sql.Joins joins26 = null;
        expState20.joins = joins26;
        org.apache.openjpa.jdbc.sql.Joins joins28 = null;
        expState20.joins = joins28;
        org.apache.openjpa.jdbc.sql.Joins joins30 = expState20.joins;
        org.apache.openjpa.jdbc.sql.Joins joins31 = expState20.joins;
        org.apache.openjpa.jdbc.sql.Joins joins32 = null;
        expState20.joins = joins32;
        org.apache.openjpa.jdbc.sql.Joins joins34 = expState20.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) joins34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNotNull(expState20);
        org.junit.Assert.assertNull(joins21);
        org.junit.Assert.assertNull(joins30);
        org.junit.Assert.assertNull(joins31);
        org.junit.Assert.assertNull(joins34);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0674");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0675");
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
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0676");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer22);
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0677");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pCPath1.toDataStoreValue(select2, expContext3, expState4, obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0678");
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
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0679");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer20);
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0680");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping9 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0681");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer18);
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
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0682");
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
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0683");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            int int18 = pCPath1.length(select2, expContext3, expState4);
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0684");
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
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0685");
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
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0686");
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
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer18, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0687");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0688");
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
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0689");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer14, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0690");
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
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0691");
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
            int int12 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0692");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0693");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState0.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = joins4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0694");
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
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0695");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0696");
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
        org.apache.openjpa.jdbc.sql.Result result12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pCPath1.load(expContext2, expState3, result12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0697");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState3.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState3.joins;
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
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0698");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Result result7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0699");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer13, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0700");
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
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0701");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        pathExpState1.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState1.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = pathExpState1.joins;
        java.lang.Class<?> wildcardClass8 = pathExpState1.getClass();
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0702");
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0703");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            java.lang.Object obj11 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0704");
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
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping12 = pCPath1.getClassMapping(expState2);
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0705");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0706");
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
            org.apache.openjpa.jdbc.schema.Column[] columnArray9 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0707");
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
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0708");
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
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        expState3.joins = joins17;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer19 = null;
        org.apache.openjpa.jdbc.schema.Column column20 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer19, column20);
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
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0709");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer18);
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
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0710");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.junit.Assert.assertNull(joins20);
        org.junit.Assert.assertNull(joins21);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0711");
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
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0712");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0713");
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
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0714");
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
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0715");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0716");
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
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0717");
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
            pCPath1.select(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0718");
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
            java.lang.Object obj12 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0719");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0720");
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
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0721");
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
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer13);
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
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0722");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        pathExpState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins11 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Result result12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0723");
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
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0724");
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
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0725");
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
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState0.joins;
        java.lang.Class<?> wildcardClass16 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0726");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer18);
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0727");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0728");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState3.joins;
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
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0729");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState5.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = pathExpState5.joins;
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0730");
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
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0731");
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
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0732");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState0.joins = joins4;
        java.lang.Class<?> wildcardClass6 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0733");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState2.joins = joins10;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray12 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0734");
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0735");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        pathExpState1.joins = joins2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        pathExpState1.joins = joins4;
        java.lang.Class<?> wildcardClass6 = pathExpState1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0736");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0737");
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
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer12);
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0738");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0739");
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
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0740");
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0741");
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
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0742");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping17 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    @Ignore
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0743");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0744");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0745");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    @Ignore
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0746");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer20);
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0747");
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
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pCPath1.getFieldMapping(expState2);
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
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0748");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0749");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0750");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState9 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins8);
        org.apache.openjpa.jdbc.sql.Joins joins10 = pathExpState9.joins;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        pathExpState9.joins = joins11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) joins11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0751");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer22);
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0752");
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
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0753");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0754");
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
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0755");
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
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0756");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer10, 25);
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
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0757");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.junit.Assert.assertNull(joins18);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0758");
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
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0759");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0760");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0761");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0762");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            java.lang.Object obj17 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0763");
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
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0764");
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer10);
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
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0765");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        pathExpState1.joins = joins11;
        org.apache.openjpa.jdbc.sql.Joins joins13 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        pathExpState1.joins = joins14;
        java.lang.Class<?> wildcardClass16 = pathExpState1.getClass();
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0766");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0767");
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
        org.apache.openjpa.jdbc.sql.Result result14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0768");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0769");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            int int15 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0770");
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
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0771");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0772");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0773");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0774");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray10 = pCPath1.getColumns(expState2);
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
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0775");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0776");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping18 = pCPath1.getClassMapping(expState2);
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
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0777");
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
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0778");
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer15);
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
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0779");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.groupBy(select2, expContext3, expState4);
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0780");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0781");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
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
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0782");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer24);
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0783");
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
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0784");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    @Ignore
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0785");
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
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0786");
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
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0787");
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
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0788");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState12 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins11);
        org.apache.openjpa.jdbc.sql.Joins joins13 = pathExpState12.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        pathExpState12.joins = joins14;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        pathExpState12.joins = joins16;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        pathExpState12.joins = joins18;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) pathExpState12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0789");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping13 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0790");
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
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0791");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer20);
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
    @Ignore
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0792");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer18);
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
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0793");
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
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer10);
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0794");
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
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState0.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = joins14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0795");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState2.joins;
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
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0796");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState2.joins;
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
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0797");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer12, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0798");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0799");
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
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    @Ignore
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0800");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer16);
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
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0801");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        expState2.joins = joins13;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping15 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0802");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0803");
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0804");
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
            java.lang.Object obj13 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0805");
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
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0806");
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
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0807");
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
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0808");
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
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0809");
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
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0810");
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
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0811");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = pCPath1.length(select2, expContext3, expState4);
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0812");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0813");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer18);
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0814");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState22 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins23 = expState22.joins;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        expState22.joins = joins24;
        org.apache.openjpa.jdbc.sql.Joins joins26 = expState22.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) joins26);
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
        org.junit.Assert.assertNotNull(expState22);
        org.junit.Assert.assertNull(joins23);
        org.junit.Assert.assertNull(joins26);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0815");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray13 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0816");
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
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0817");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0818");
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
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping11 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0819");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer16);
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0820");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0821");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState2.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState2.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray9 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0822");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0823");
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
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0824");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState2.joins = joins12;
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
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0825");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0826");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0827");
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
        java.lang.Class<?> wildcardClass10 = pathExpState1.getClass();
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0828");
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
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0829");
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
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        expState3.joins = joins17;
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
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0830");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState20 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins21 = expState20.joins;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        expState20.joins = joins22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        expState20.joins = joins24;
        org.apache.openjpa.jdbc.sql.Joins joins26 = null;
        expState20.joins = joins26;
        org.apache.openjpa.jdbc.sql.Joins joins28 = null;
        expState20.joins = joins28;
        org.apache.openjpa.jdbc.sql.Joins joins30 = expState20.joins;
        java.lang.Class<?> wildcardClass31 = expState20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) expState20);
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
        org.junit.Assert.assertNotNull(expState20);
        org.junit.Assert.assertNull(joins21);
        org.junit.Assert.assertNull(joins30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0831");
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
            pCPath1.appendIsNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0832");
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
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0833");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer22);
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
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0834");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0835");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNull(joins19);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0836");
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
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0837");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState0.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState0.joins;
        java.lang.Class<?> wildcardClass7 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0838");
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0839");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer10);
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
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0840");
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
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0841");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer16, 5);
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0842");
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
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0843");
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
            java.lang.Object obj11 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) "hi!");
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0844");
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
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0845");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer15, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0846");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        expState0.joins = joins2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState0.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = joins4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0847");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
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
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0848");
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
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0849");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray19 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins18);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0850");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer16, 5);
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
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0851");
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
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer18, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0852");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0853");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0854");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0855");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0856");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer10, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0857");
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
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0858");
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
            pCPath1.selectColumns(select2, expContext3, expState4, false);
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0859");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0860");
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
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer8, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0861");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0862");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState0.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = joins5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0863");
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
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0864");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0865");
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
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0866");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer19);
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0867");
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
        org.apache.openjpa.jdbc.sql.Result result11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pCPath1.load(expContext2, expState3, result11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0868");
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
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0869");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Result result11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pCPath1.load(expContext2, expState3, result11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0870");
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
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        expState3.joins = joins17;
        org.apache.openjpa.jdbc.sql.Joins joins19 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins20 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Result result21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = pCPath1.load(expContext2, expState3, result21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins19);
        org.junit.Assert.assertNull(joins20);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0871");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0872");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.selectColumns(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0873");
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
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0874");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer14);
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
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0875");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState2.joins = joins12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray14 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0876");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer16);
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0877");
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
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState13 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        java.lang.Class<?> wildcardClass14 = expState13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNotNull(expState13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0878");
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
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0879");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer14, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0880");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        pathExpState5.joins = joins12;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0881");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState3.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        expState3.joins = joins9;
        org.apache.openjpa.jdbc.sql.Result result11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pCPath1.load(expContext2, expState3, result11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0882");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0883");
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
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0884");
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
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState13 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState13.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        expState13.joins = joins15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        expState13.joins = joins17;
        org.apache.openjpa.jdbc.sql.Joins joins19 = null;
        expState13.joins = joins19;
        org.apache.openjpa.jdbc.sql.Joins joins21 = null;
        expState13.joins = joins21;
        org.apache.openjpa.jdbc.sql.Joins joins23 = expState13.joins;
        org.apache.openjpa.jdbc.sql.Joins joins24 = expState13.joins;
        org.apache.openjpa.jdbc.sql.Joins joins25 = expState13.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) expState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNotNull(expState13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins23);
        org.junit.Assert.assertNull(joins24);
        org.junit.Assert.assertNull(joins25);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0885");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        pathExpState5.joins = joins12;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0886");
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
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0887");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        expState3.joins = joins16;
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
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0888");
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0889");
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
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0890");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer22, 1);
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
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0891");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0892");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.junit.Assert.assertNull(joins24);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0893");
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
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0894");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState5.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = expState5.joins;
        java.lang.Class<?> wildcardClass9 = expState5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) expState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cmpfield\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0895");
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
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0896");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer18);
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0897");
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
        org.apache.openjpa.jdbc.sql.Result result10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pCPath1.load(expContext2, expState3, result10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0898");
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
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer10, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 19 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0899");
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
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0900");
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
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState3.joins;
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
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0901");
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
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins17);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0902");
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
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping11 = pCPath1.getClassMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins10);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0903");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer12 = null;
        org.apache.openjpa.jdbc.schema.Column column13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, sQLBuffer12, column13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0904");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
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
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0905");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.Joins joins6 = pathExpState5.joins;
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
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0906");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer16);
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0907");
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
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState13 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins12);
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        pathExpState13.joins = joins14;
        java.lang.Class<?> wildcardClass16 = pathExpState13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) pathExpState13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0908");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState3.joins = joins10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = expState3.joins;
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
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0909");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer16);
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0910");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState3 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState3.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        expState3.joins = joins7;
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
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0911");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer9, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0912");
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
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer15);
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0913");
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
        java.lang.Class<?> wildcardClass13 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0914");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer22);
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
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0915");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        pathExpState1.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState1.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = pathExpState1.joins;
        java.lang.Class<?> wildcardClass9 = pathExpState1.getClass();
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0916");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0917");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer10, 23);
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
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0918");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer17);
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0919");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        expState3.joins = joins10;
        org.apache.openjpa.jdbc.sql.Result result12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pCPath1.load(expContext2, expState3, result12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    @Ignore
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0920");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0921");
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
            pCPath1.select(select2, expContext3, expState4, true);
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0922");
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
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer15);
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
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0923");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState2 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins3 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        expState2.joins = joins4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = expState2.joins;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.Column[] columnArray8 = pCPath1.getColumns(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0924");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0925");
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
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0926");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState0.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        expState0.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        expState0.joins = joins8;
        java.lang.Class<?> wildcardClass10 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0927");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = expState3.joins;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState3.joins = joins12;
        org.apache.openjpa.jdbc.sql.Result result14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = pCPath1.load(expContext2, expState3, result14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0928");
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
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState14 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins13);
        org.apache.openjpa.jdbc.sql.Joins joins15 = pathExpState14.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        pathExpState14.joins = joins16;
        java.lang.Class<?> wildcardClass18 = pathExpState14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0929");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsNotNull(select2, expContext3, expState4, sQLBuffer24);
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0930");
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
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0931");
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
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0932");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState4.joins = joins6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        pathExpState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins11 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins12 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Result result13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0933");
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
        org.apache.openjpa.jdbc.sql.Joins joins28 = null;
        expState12.joins = joins28;
        org.apache.openjpa.jdbc.sql.Joins joins30 = null;
        expState12.joins = joins30;
        org.apache.openjpa.jdbc.sql.Joins joins32 = expState12.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) joins32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this.classMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNotNull(expState12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins22);
        org.junit.Assert.assertNull(joins23);
        org.junit.Assert.assertNull(joins26);
        org.junit.Assert.assertNull(joins27);
        org.junit.Assert.assertNull(joins32);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0934");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer22);
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0935");
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState0 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins1 = null;
        expState0.joins = joins1;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        expState0.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        expState0.joins = joins6;
        java.lang.Class<?> wildcardClass8 = expState0.getClass();
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0936");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer8, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0937");
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
            java.lang.Object obj16 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) "");
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
    @Ignore
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0938");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer22);
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0939");
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
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        pathExpState4.joins = joins11;
        org.apache.openjpa.jdbc.sql.Joins joins13 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer15 = null;
        org.apache.openjpa.jdbc.schema.Column column16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, sQLBuffer15, column16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0940");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0941");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.groupBy(select2, expContext3, expState4);
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0942");
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
            pCPath1.select(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0943");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = pCPath1.toDataStoreValue(select2, expContext3, expState4, obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0944");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0945");
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
            pCPath1.appendIndex(select2, expContext3, expState4, sQLBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0946");
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
            int int12 = pCPath1.length(select2, expContext3, expState4);
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0947");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0948");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0949");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState2.joins = joins12;
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
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0950");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = pCPath1.length(select2, expContext3, expState4);
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
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0951");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        pathExpState1.joins = joins3;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState1.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        pathExpState1.joins = joins8;
        java.lang.Class<?> wildcardClass10 = pathExpState1.getClass();
        org.junit.Assert.assertNull(joins2);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0952");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            int int19 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0953");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins11);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0954");
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
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState11 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins10);
        org.apache.openjpa.jdbc.sql.Joins joins12 = pathExpState11.joins;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        pathExpState11.joins = joins13;
        java.lang.Class<?> wildcardClass15 = pathExpState11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) pathExpState11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0955");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        expState2.joins = joins12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState2.joins;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping15 = pCPath1.getFieldMapping(expState2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState2);
        org.junit.Assert.assertNull(joins3);
        org.junit.Assert.assertNull(joins14);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0956");
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
            java.lang.Object obj12 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) 18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0957");
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
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState13 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins12);
        org.apache.openjpa.jdbc.sql.Joins joins14 = pathExpState13.joins;
        java.lang.Class<?> wildcardClass15 = pathExpState13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) pathExpState13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0958");
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
            int int10 = pCPath1.length(select2, expContext3, expState4);
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
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0959");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer16);
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0960");
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
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer12);
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0961");
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
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0962");
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
            int int15 = pCPath1.length(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0963");
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
            pCPath1.appendIsNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer14);
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0964");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.selectColumns(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0965");
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
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = pCPath1.getFieldMapping(expState2);
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
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0966");
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
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0967");
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
            pCPath1.groupBy(select2, expContext3, expState4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0968");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState21 = org.apache.openjpa.jdbc.kernel.exps.ExpState.NULL;
        org.apache.openjpa.jdbc.sql.Joins joins22 = expState21.joins;
        org.apache.openjpa.jdbc.sql.Joins joins23 = null;
        expState21.joins = joins23;
        org.apache.openjpa.jdbc.sql.Joins joins25 = expState21.joins;
        java.lang.Class<?> wildcardClass26 = expState21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) expState21);
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
        org.junit.Assert.assertNotNull(expState21);
        org.junit.Assert.assertNull(joins22);
        org.junit.Assert.assertNull(joins25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0969");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer22);
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0970");
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
        org.apache.openjpa.jdbc.sql.Joins joins14 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins15 = expState0.joins;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        expState0.joins = joins16;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        expState0.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = expState0.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = joins20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState0);
        org.junit.Assert.assertNull(joins1);
        org.junit.Assert.assertNull(joins10);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins20);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0971");
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
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0972");
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
            pCPath1.orderBy(select2, expContext3, expState4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0973");
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
            pCPath1.appendSize(select2, expContext3, expState4, sQLBuffer15);
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0974");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.kernel.exps.ExpState expState5 = pCPath1.initialize(select2, expContext3, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.newJoins()\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0975");
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
        org.junit.Assert.assertNull(joins13);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0976");
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
            pCPath1.appendIsNotEmpty(select2, expContext3, expState4, sQLBuffer13);
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
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0977");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendIsNull(select2, expContext3, expState4, sQLBuffer24);
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
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0978");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
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
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0979");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState4.joins = joins5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = pathExpState4.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer8 = null;
        org.apache.openjpa.jdbc.schema.Column column9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, sQLBuffer8, column9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0980");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer18, 18);
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
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0981");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = pCPath1.length(select2, expContext3, expState4);
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
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0982");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
        org.apache.openjpa.jdbc.sql.Joins joins28 = null;
        expState16.joins = joins28;
        org.apache.openjpa.jdbc.sql.Joins joins30 = expState16.joins;
        org.apache.openjpa.jdbc.sql.Joins joins31 = expState16.joins;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) expState16);
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
        org.junit.Assert.assertNull(joins30);
        org.junit.Assert.assertNull(joins31);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0983");
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
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0984");
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
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0985");
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
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertNull(joins12);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0986");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer16, 11);
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
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0987");
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
            pCPath1.appendIsNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins8);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0988");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins7);
    }

    @Test
    @Ignore
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0989");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendType(select2, expContext3, expState4, sQLBuffer17);
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0990");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0991");
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
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0992");
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
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        expState3.joins = joins17;
        org.apache.openjpa.jdbc.sql.Joins joins19 = null;
        expState3.joins = joins19;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer21 = null;
        org.apache.openjpa.jdbc.schema.Column column22 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expState3, sQLBuffer21, column22);
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0993");
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer14, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins9);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0994");
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
            pCPath1.appendIsEmpty(select2, expContext3, expState4, sQLBuffer13);
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0995");
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
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer17, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 25 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins6);
        org.junit.Assert.assertNull(joins9);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNull(joins15);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0996");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
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
            pCPath1.appendTo(select2, expContext3, expState4, sQLBuffer12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState4);
        org.junit.Assert.assertNull(joins5);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0997");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, expState4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cols\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0998");
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
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer16);
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test0999");
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
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer18);
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.RandoopC4.PCPathC4RandoopTest1.test1000");
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
        org.apache.openjpa.jdbc.sql.Result result13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = pCPath1.load(expContext2, expState3, result13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.jdbc.kernel.exps.ExpState cannot be cast to class org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState (org.apache.openjpa.jdbc.kernel.exps.ExpState and org.apache.openjpa.jdbc.kernel.exps.PCPath$PathExpState are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expState3);
        org.junit.Assert.assertNull(joins12);
    }
}

