package org.apache.openjpa.kernel.RandoopC2;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PCDataImplC2RandoopTest0 {

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
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test001");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 10.0f, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test002");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 0, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test003");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 0.0f, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test004");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 100L, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test005");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) false, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test006");
        java.lang.Object obj0 = null;
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test007");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) 100, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test008");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) '#', classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test009");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 10L, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test010");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) 1, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test011");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) true, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test012");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) '#', classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test013");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (-1.0d), classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test014");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 1.0d, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test015");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 1, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test016");
        java.lang.Object obj0 = org.apache.openjpa.kernel.AbstractPCData.NULL;
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.openjpa.meta.ClassMetaData classMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl4 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) wildcardClass1, classMetaData2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    @Ignore
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test017");
        java.lang.Object obj0 = org.apache.openjpa.kernel.AbstractPCData.NULL;
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.io.Serializable (java.lang.Object and java.io.Serializable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test018");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) -1, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test019");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.openjpa.meta.ClassMetaData classMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl4 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) wildcardClass1, classMetaData2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test020");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) 1, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test021");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 100, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test022");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) 100, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test023");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 0, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test024");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 100L, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test025");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 10L, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test026");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 100.0d, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test027");
        java.lang.Object obj0 = null;
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    @Ignore
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test028");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.io.Serializable (java.lang.Object and java.io.Serializable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test029");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 100, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test030");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) 0, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test031");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) "hi!", classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test032");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) -1, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test033");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) 100, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test034");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) 100, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test035");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) "", classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test036");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) 10, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test037");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) 100, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test038");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 100.0f, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test039");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) 0, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    @Ignore
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test040");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.io.Serializable (java.lang.Object and java.io.Serializable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test041");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) '#', classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test042");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 1.0f, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test043");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) ' ', classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test044");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) -1, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test045");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 1L, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test046");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) "", classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test047");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) 10, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test048");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 'a', classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test049");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 10.0f, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test050");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) "hi!", classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test051");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) 1, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test052");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 0.0d, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test053");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 'a', classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test054");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) 0, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test055");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 0.0d, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test056");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (-1L), classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test057");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (-1.0f), classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test058");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) false, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test059");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) -1, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test060");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 100.0f, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test061");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 1, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test062");
        java.lang.Object obj0 = org.apache.openjpa.kernel.AbstractPCData.NULL;
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.openjpa.meta.ClassMetaData classMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl4 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) wildcardClass1, classMetaData2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test063");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 100.0d, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test064");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 0, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test065");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 1.0f, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test066");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) '4', classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    @Ignore
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test067");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.openjpa.meta.ClassMetaData classMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl4 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.io.Serializable (java.lang.Object and java.io.Serializable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    @Ignore
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test068");
        java.lang.Object obj0 = org.apache.openjpa.kernel.AbstractPCData.NULL;
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.io.Serializable (java.lang.Object and java.io.Serializable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test069");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) true, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test070");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 0L, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test071");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) -1, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test072");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 10.0d, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test073");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (-1), classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test074");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) "", classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test075");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) 0, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test076");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 100.0d, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test077");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 0L, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test078");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) "hi!", classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test079");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 1.0d, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test080");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (-1.0f), classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test081");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) 1, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test082");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) ' ', classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    @Ignore
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test083");
        java.lang.Object obj0 = org.apache.openjpa.kernel.AbstractPCData.NULL;
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.openjpa.meta.ClassMetaData classMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl4 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.io.Serializable (java.lang.Object and java.io.Serializable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test084");
        java.lang.Object obj0 = org.apache.openjpa.kernel.AbstractPCData.NULL;
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.openjpa.meta.ClassMetaData classMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) wildcardClass1, classMetaData2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test085");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 0.0f, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test086");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (-1.0d), classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test087");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (-1.0f), classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    @Ignore
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test088");
        java.lang.Object obj0 = org.apache.openjpa.kernel.AbstractPCData.NULL;
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.openjpa.meta.ClassMetaData classMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.io.Serializable (java.lang.Object and java.io.Serializable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test089");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (-1), classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test090");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 10L, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test091");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) false, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test092");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 10, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test093");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) true, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    @Ignore
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test094");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.openjpa.meta.ClassMetaData classMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.io.Serializable (java.lang.Object and java.io.Serializable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test095");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 100L, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test096");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (-1L), classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test097");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 1L, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test098");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (-1), classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test099");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 10.0d, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test100");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.openjpa.meta.ClassMetaData classMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) wildcardClass1, classMetaData2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test101");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 0L, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test102");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 10.0f, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test103");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) 10, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    @Ignore
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test104");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.io.Serializable (java.lang.Object and java.io.Serializable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test105");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (-1.0d), classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test106");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 'a', classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test107");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) ' ', classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test108");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) 0, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test109");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) 0, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test110");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 100, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test111");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 1, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test112");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 100.0f, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    @Ignore
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test113");
        java.lang.Object obj0 = org.apache.openjpa.kernel.AbstractPCData.NULL;
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.io.Serializable (java.lang.Object and java.io.Serializable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test114");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 10, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test115");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.openjpa.meta.ClassMetaData classMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl4 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) wildcardClass1, classMetaData2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test116");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) '4', classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test117");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) 10, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test118");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 1L, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test119");
        java.lang.Object obj0 = null;
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test120");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 10, classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test121");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 0.0f, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test122");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) -1, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test123");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) 1, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test124");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 1.0d, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test125");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) 10, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test126");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 10.0d, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test127");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) 100, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test128");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl2 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) '4', classMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    @Ignore
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test129");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.openjpa.meta.ClassMetaData classMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl4 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.io.Serializable (java.lang.Object and java.io.Serializable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test130");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 0.0d, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test131");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (-1L), classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test132");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (byte) 1, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test133");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) (short) 10, classMetaData1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test134");
        org.apache.openjpa.meta.ClassMetaData classMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl3 = new org.apache.openjpa.kernel.PCDataImpl((java.lang.Object) 1.0f, classMetaData1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    @Ignore
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.kernel.RandoopC2.PCDataImplC2RandoopTest0.test135");
        java.lang.Object obj0 = org.apache.openjpa.kernel.AbstractPCData.NULL;
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.openjpa.meta.ClassMetaData classMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.kernel.PCDataImpl pCDataImpl4 = new org.apache.openjpa.kernel.PCDataImpl(obj0, classMetaData2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.io.Serializable (java.lang.Object and java.io.Serializable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

