package org.apache.openjpa.jdbc.kernel.exps;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PCPathRandoopTest2 {

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
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1001");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = pathExpState1.cmpfield;
        org.apache.openjpa.jdbc.schema.Column[] columnArray5 = pathExpState1.cols;
        boolean boolean6 = pathExpState1.isEmbedElementColl;
        org.apache.openjpa.jdbc.sql.Joins joins7 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState8 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins7);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = null;
        pathExpState8.field = fieldMapping9;
        org.apache.openjpa.jdbc.schema.Column[] columnArray11 = null;
        pathExpState8.cols = columnArray11;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = null;
        pathExpState8.cmpfield = fieldMapping13;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping15 = null;
        pathExpState8.field = fieldMapping15;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = null;
        pathExpState8.cmpfield = fieldMapping17;
        org.apache.openjpa.jdbc.schema.Column[] columnArray19 = pathExpState8.cols;
        pathExpState8.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState23 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins22);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping24 = null;
        pathExpState23.field = fieldMapping24;
        org.apache.openjpa.jdbc.schema.Column[] columnArray26 = null;
        pathExpState23.cols = columnArray26;
        org.apache.openjpa.jdbc.sql.Joins joins28 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState29 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins28);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping30 = null;
        pathExpState29.field = fieldMapping30;
        org.apache.openjpa.jdbc.schema.Column column32 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray33 = new org.apache.openjpa.jdbc.schema.Column[] { column32 };
        pathExpState29.cols = columnArray33;
        pathExpState23.cols = columnArray33;
        org.apache.openjpa.jdbc.schema.Column[] columnArray36 = pathExpState23.cols;
        pathExpState8.cols = columnArray36;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping38 = pathExpState8.field;
        org.apache.openjpa.jdbc.sql.Joins joins39 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState40 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins39);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping41 = null;
        pathExpState40.field = fieldMapping41;
        org.apache.openjpa.jdbc.schema.Column[] columnArray43 = null;
        pathExpState40.cols = columnArray43;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping45 = null;
        pathExpState40.cmpfield = fieldMapping45;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping47 = null;
        pathExpState40.field = fieldMapping47;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping49 = null;
        pathExpState40.cmpfield = fieldMapping49;
        org.apache.openjpa.jdbc.schema.Column[] columnArray51 = pathExpState40.cols;
        pathExpState40.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins54 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState55 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins54);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping56 = null;
        pathExpState55.field = fieldMapping56;
        org.apache.openjpa.jdbc.schema.Column[] columnArray58 = null;
        pathExpState55.cols = columnArray58;
        org.apache.openjpa.jdbc.sql.Joins joins60 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState61 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins60);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping62 = null;
        pathExpState61.field = fieldMapping62;
        org.apache.openjpa.jdbc.schema.Column column64 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray65 = new org.apache.openjpa.jdbc.schema.Column[] { column64 };
        pathExpState61.cols = columnArray65;
        pathExpState55.cols = columnArray65;
        org.apache.openjpa.jdbc.schema.Column[] columnArray68 = pathExpState55.cols;
        pathExpState40.cols = columnArray68;
        pathExpState8.cols = columnArray68;
        pathExpState1.cols = columnArray68;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping72 = null;
        pathExpState1.cmpfield = fieldMapping72;
        boolean boolean74 = pathExpState1.joinedRel;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping75 = pathExpState1.cmpfield;
        org.apache.openjpa.jdbc.sql.Joins joins76 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState77 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins76);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping78 = null;
        pathExpState77.field = fieldMapping78;
        org.apache.openjpa.jdbc.schema.Column[] columnArray80 = null;
        pathExpState77.cols = columnArray80;
        org.apache.openjpa.jdbc.sql.Joins joins82 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState83 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins82);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping84 = null;
        pathExpState83.field = fieldMapping84;
        org.apache.openjpa.jdbc.schema.Column column86 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray87 = new org.apache.openjpa.jdbc.schema.Column[] { column86 };
        pathExpState83.cols = columnArray87;
        pathExpState77.cols = columnArray87;
        org.apache.openjpa.jdbc.sql.Joins joins90 = pathExpState77.joins;
        org.apache.openjpa.jdbc.schema.Column[] columnArray91 = pathExpState77.cols;
        pathExpState1.cols = columnArray91;
        org.junit.Assert.assertNull(fieldMapping4);
        org.junit.Assert.assertNull(columnArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(columnArray19);
        org.junit.Assert.assertNotNull(columnArray33);
        org.junit.Assert.assertArrayEquals(columnArray33, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray36);
        org.junit.Assert.assertArrayEquals(columnArray36, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping38);
        org.junit.Assert.assertNull(columnArray51);
        org.junit.Assert.assertNotNull(columnArray65);
        org.junit.Assert.assertArrayEquals(columnArray65, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray68);
        org.junit.Assert.assertArrayEquals(columnArray68, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(fieldMapping75);
        org.junit.Assert.assertNotNull(columnArray87);
        org.junit.Assert.assertArrayEquals(columnArray87, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(joins90);
        org.junit.Assert.assertNotNull(columnArray91);
        org.junit.Assert.assertArrayEquals(columnArray91, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1002");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column column4 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray5 = new org.apache.openjpa.jdbc.schema.Column[] { column4 };
        pathExpState1.cols = columnArray5;
        boolean boolean7 = pathExpState1.joinedRel;
        pathExpState1.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState1.field = fieldMapping10;
        boolean boolean12 = pathExpState1.joinedRel;
        boolean boolean13 = pathExpState1.joinedRel;
        org.junit.Assert.assertNotNull(columnArray5);
        org.junit.Assert.assertArrayEquals(columnArray5, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1003");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState11 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins10);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState11.field = fieldMapping12;
        org.apache.openjpa.jdbc.schema.Column column14 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] { column14 };
        pathExpState11.cols = columnArray15;
        pathExpState5.cols = columnArray15;
        pathExpState5.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping20 = null;
        pathExpState5.cmpfield = fieldMapping20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        pathExpState5.joins = joins22;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping24 = pathExpState5.field;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping25 = null;
        pathExpState5.cmpfield = fieldMapping25;
        org.apache.openjpa.jdbc.sql.Joins joins27 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping24);
        org.junit.Assert.assertNull(joins27);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1004");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState1.cmpfield = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState1.field = fieldMapping8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState1.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.schema.Column[] columnArray12 = pathExpState1.cols;
        pathExpState1.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState16 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins15);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = null;
        pathExpState16.field = fieldMapping17;
        org.apache.openjpa.jdbc.schema.Column[] columnArray19 = null;
        pathExpState16.cols = columnArray19;
        org.apache.openjpa.jdbc.sql.Joins joins21 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState22 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins21);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping23 = null;
        pathExpState22.field = fieldMapping23;
        org.apache.openjpa.jdbc.schema.Column column25 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray26 = new org.apache.openjpa.jdbc.schema.Column[] { column25 };
        pathExpState22.cols = columnArray26;
        pathExpState16.cols = columnArray26;
        org.apache.openjpa.jdbc.schema.Column[] columnArray29 = pathExpState16.cols;
        pathExpState1.cols = columnArray29;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping31 = pathExpState1.field;
        org.apache.openjpa.jdbc.sql.Joins joins32 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState33 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins32);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping34 = null;
        pathExpState33.field = fieldMapping34;
        org.apache.openjpa.jdbc.schema.Column[] columnArray36 = null;
        pathExpState33.cols = columnArray36;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping38 = null;
        pathExpState33.cmpfield = fieldMapping38;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping40 = null;
        pathExpState33.field = fieldMapping40;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping42 = null;
        pathExpState33.cmpfield = fieldMapping42;
        org.apache.openjpa.jdbc.schema.Column[] columnArray44 = pathExpState33.cols;
        pathExpState33.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins47 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState48 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins47);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping49 = null;
        pathExpState48.field = fieldMapping49;
        org.apache.openjpa.jdbc.schema.Column[] columnArray51 = null;
        pathExpState48.cols = columnArray51;
        org.apache.openjpa.jdbc.sql.Joins joins53 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState54 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins53);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping55 = null;
        pathExpState54.field = fieldMapping55;
        org.apache.openjpa.jdbc.schema.Column column57 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray58 = new org.apache.openjpa.jdbc.schema.Column[] { column57 };
        pathExpState54.cols = columnArray58;
        pathExpState48.cols = columnArray58;
        org.apache.openjpa.jdbc.schema.Column[] columnArray61 = pathExpState48.cols;
        pathExpState33.cols = columnArray61;
        pathExpState1.cols = columnArray61;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping64 = pathExpState1.cmpfield;
        org.junit.Assert.assertNull(columnArray12);
        org.junit.Assert.assertNotNull(columnArray26);
        org.junit.Assert.assertArrayEquals(columnArray26, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray29);
        org.junit.Assert.assertArrayEquals(columnArray29, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping31);
        org.junit.Assert.assertNull(columnArray44);
        org.junit.Assert.assertNotNull(columnArray58);
        org.junit.Assert.assertArrayEquals(columnArray58, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray61);
        org.junit.Assert.assertArrayEquals(columnArray61, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping64);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1005");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        pathExpState1.joinedRel = true;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = null;
        pathExpState1.field = fieldMapping4;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState1.cmpfield = fieldMapping6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        pathExpState1.joins = joins8;
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1006");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState11 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins10);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState11.field = fieldMapping12;
        org.apache.openjpa.jdbc.schema.Column column14 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] { column14 };
        pathExpState11.cols = columnArray15;
        pathExpState5.cols = columnArray15;
        pathExpState5.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState21 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins20);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping22 = null;
        pathExpState21.field = fieldMapping22;
        org.apache.openjpa.jdbc.schema.Column[] columnArray24 = null;
        pathExpState21.cols = columnArray24;
        org.apache.openjpa.jdbc.sql.Joins joins26 = null;
        pathExpState21.joins = joins26;
        org.apache.openjpa.jdbc.schema.Column column28 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray29 = new org.apache.openjpa.jdbc.schema.Column[] { column28 };
        pathExpState21.cols = columnArray29;
        pathExpState5.cols = columnArray29;
        pathExpState5.isEmbedElementColl = true;
        boolean boolean34 = pathExpState5.isEmbedElementColl;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray29);
        org.junit.Assert.assertArrayEquals(columnArray29, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1007");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.field = fieldMapping12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pathExpState5.cols;
        pathExpState5.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins19 = pathExpState5.joins;
        pathExpState5.joinedRel = true;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping22 = null;
        pathExpState5.cmpfield = fieldMapping22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        pathExpState5.joins = joins24;
        org.apache.openjpa.jdbc.sql.Joins joins26 = pathExpState5.joins;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping27 = pathExpState5.cmpfield;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray16);
        org.junit.Assert.assertNull(joins19);
        org.junit.Assert.assertNull(joins26);
        org.junit.Assert.assertNull(fieldMapping27);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1008");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState11 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins10);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState11.field = fieldMapping12;
        org.apache.openjpa.jdbc.schema.Column column14 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] { column14 };
        pathExpState11.cols = columnArray15;
        pathExpState5.cols = columnArray15;
        boolean boolean18 = pathExpState5.joinedRel;
        boolean boolean19 = pathExpState5.joinedRel;
        boolean boolean20 = pathExpState5.isEmbedElementColl;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1009");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.sql.Joins joins2 = null;
        pathExpState1.joins = joins2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        pathExpState1.joins = joins4;
        pathExpState1.joinedRel = true;
        boolean boolean8 = pathExpState1.isEmbedElementColl;
        boolean boolean9 = pathExpState1.joinedRel;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState11 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins10);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState11.field = fieldMapping12;
        org.apache.openjpa.jdbc.schema.Column[] columnArray14 = null;
        pathExpState11.cols = columnArray14;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = null;
        pathExpState11.cmpfield = fieldMapping16;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping18 = null;
        pathExpState11.field = fieldMapping18;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping20 = null;
        pathExpState11.cmpfield = fieldMapping20;
        org.apache.openjpa.jdbc.schema.Column[] columnArray22 = pathExpState11.cols;
        pathExpState11.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins25 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState26 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins25);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping27 = null;
        pathExpState26.field = fieldMapping27;
        org.apache.openjpa.jdbc.schema.Column[] columnArray29 = null;
        pathExpState26.cols = columnArray29;
        org.apache.openjpa.jdbc.sql.Joins joins31 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState32 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins31);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping33 = null;
        pathExpState32.field = fieldMapping33;
        org.apache.openjpa.jdbc.schema.Column column35 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray36 = new org.apache.openjpa.jdbc.schema.Column[] { column35 };
        pathExpState32.cols = columnArray36;
        pathExpState26.cols = columnArray36;
        org.apache.openjpa.jdbc.schema.Column[] columnArray39 = pathExpState26.cols;
        pathExpState11.cols = columnArray39;
        org.apache.openjpa.jdbc.sql.Joins joins41 = null;
        pathExpState11.joins = joins41;
        org.apache.openjpa.jdbc.sql.Joins joins43 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState44 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins43);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping45 = null;
        pathExpState44.field = fieldMapping45;
        org.apache.openjpa.jdbc.schema.Column[] columnArray47 = null;
        pathExpState44.cols = columnArray47;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping49 = null;
        pathExpState44.cmpfield = fieldMapping49;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping51 = null;
        pathExpState44.field = fieldMapping51;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping53 = null;
        pathExpState44.cmpfield = fieldMapping53;
        org.apache.openjpa.jdbc.schema.Column[] columnArray55 = pathExpState44.cols;
        pathExpState44.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins58 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState59 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins58);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping60 = null;
        pathExpState59.field = fieldMapping60;
        org.apache.openjpa.jdbc.schema.Column[] columnArray62 = null;
        pathExpState59.cols = columnArray62;
        org.apache.openjpa.jdbc.sql.Joins joins64 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState65 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins64);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping66 = null;
        pathExpState65.field = fieldMapping66;
        org.apache.openjpa.jdbc.schema.Column column68 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray69 = new org.apache.openjpa.jdbc.schema.Column[] { column68 };
        pathExpState65.cols = columnArray69;
        pathExpState59.cols = columnArray69;
        org.apache.openjpa.jdbc.schema.Column[] columnArray72 = pathExpState59.cols;
        pathExpState44.cols = columnArray72;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping74 = pathExpState44.field;
        org.apache.openjpa.jdbc.schema.Column[] columnArray75 = pathExpState44.cols;
        org.apache.openjpa.jdbc.schema.Column[] columnArray76 = pathExpState44.cols;
        pathExpState11.cols = columnArray76;
        pathExpState1.cols = columnArray76;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(columnArray22);
        org.junit.Assert.assertNotNull(columnArray36);
        org.junit.Assert.assertArrayEquals(columnArray36, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray39);
        org.junit.Assert.assertArrayEquals(columnArray39, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(columnArray55);
        org.junit.Assert.assertNotNull(columnArray69);
        org.junit.Assert.assertArrayEquals(columnArray69, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray72);
        org.junit.Assert.assertArrayEquals(columnArray72, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping74);
        org.junit.Assert.assertNotNull(columnArray75);
        org.junit.Assert.assertArrayEquals(columnArray75, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray76);
        org.junit.Assert.assertArrayEquals(columnArray76, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1010");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        boolean boolean10 = pathExpState5.isEmbedElementColl;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1011");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = pathExpState1.cmpfield;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        pathExpState1.cmpfield = fieldMapping5;
        pathExpState1.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = pathExpState1.cmpfield;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = pathExpState1.field;
        org.junit.Assert.assertNull(fieldMapping4);
        org.junit.Assert.assertNull(fieldMapping9);
        org.junit.Assert.assertNull(fieldMapping10);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1012");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column column8 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] { column8 };
        pathExpState5.cols = columnArray9;
        boolean boolean11 = pathExpState5.joinedRel;
        pathExpState5.isEmbedElementColl = false;
        boolean boolean14 = pathExpState5.joinedRel;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = pathExpState5.cols;
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pathExpState5.cols;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray16);
        org.junit.Assert.assertArrayEquals(columnArray16, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1013");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = pathExpState1.cmpfield;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        pathExpState1.cmpfield = fieldMapping5;
        org.apache.openjpa.jdbc.sql.Joins joins7 = pathExpState1.joins;
        boolean boolean8 = pathExpState1.isEmbedElementColl;
        org.junit.Assert.assertNull(fieldMapping4);
        org.junit.Assert.assertNull(joins7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1014");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        pathExpState4.cmpfield = fieldMapping5;
        org.apache.openjpa.jdbc.schema.Column[] columnArray7 = pathExpState4.cols;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        pathExpState4.joins = joins8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState4.joins = joins10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState4.cmpfield = fieldMapping12;
        org.apache.openjpa.jdbc.sql.Result result14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray7);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1015");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.field = fieldMapping12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pathExpState5.cols;
        boolean boolean17 = pathExpState5.isEmbedElementColl;
        boolean boolean18 = pathExpState5.isEmbedElementColl;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1016");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pathExpState5.cmpfield;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = pathExpState5.cols;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer10, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping8);
        org.junit.Assert.assertNull(columnArray9);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1017");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.field = fieldMapping12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pathExpState5.cols;
        pathExpState5.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins19 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState20 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins19);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping21 = null;
        pathExpState20.field = fieldMapping21;
        org.apache.openjpa.jdbc.schema.Column[] columnArray23 = null;
        pathExpState20.cols = columnArray23;
        org.apache.openjpa.jdbc.sql.Joins joins25 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState26 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins25);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping27 = null;
        pathExpState26.field = fieldMapping27;
        org.apache.openjpa.jdbc.schema.Column column29 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray30 = new org.apache.openjpa.jdbc.schema.Column[] { column29 };
        pathExpState26.cols = columnArray30;
        pathExpState20.cols = columnArray30;
        org.apache.openjpa.jdbc.schema.Column[] columnArray33 = pathExpState20.cols;
        pathExpState5.cols = columnArray33;
        org.apache.openjpa.jdbc.sql.Joins joins35 = null;
        pathExpState5.joins = joins35;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray16);
        org.junit.Assert.assertNotNull(columnArray30);
        org.junit.Assert.assertArrayEquals(columnArray30, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray33);
        org.junit.Assert.assertArrayEquals(columnArray33, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1018");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState7 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins6);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState7.field = fieldMapping8;
        org.apache.openjpa.jdbc.schema.Column column10 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray11 = new org.apache.openjpa.jdbc.schema.Column[] { column10 };
        pathExpState7.cols = columnArray11;
        pathExpState1.cols = columnArray11;
        pathExpState1.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = null;
        pathExpState1.cmpfield = fieldMapping16;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        pathExpState1.joins = joins18;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping20 = pathExpState1.field;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping21 = null;
        pathExpState1.cmpfield = fieldMapping21;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping23 = pathExpState1.field;
        org.junit.Assert.assertNotNull(columnArray11);
        org.junit.Assert.assertArrayEquals(columnArray11, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping20);
        org.junit.Assert.assertNull(fieldMapping23);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1019");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        pathExpState1.joinedRel = true;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = null;
        pathExpState1.field = fieldMapping4;
        pathExpState1.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pathExpState1.cmpfield;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState10 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins9);
        org.apache.openjpa.jdbc.schema.Column[] columnArray11 = pathExpState10.cols;
        boolean boolean12 = pathExpState10.joinedRel;
        org.apache.openjpa.jdbc.sql.Joins joins13 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState14 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins13);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping15 = null;
        pathExpState14.field = fieldMapping15;
        org.apache.openjpa.jdbc.schema.Column[] columnArray17 = null;
        pathExpState14.cols = columnArray17;
        org.apache.openjpa.jdbc.sql.Joins joins19 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState20 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins19);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping21 = null;
        pathExpState20.field = fieldMapping21;
        org.apache.openjpa.jdbc.schema.Column column23 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray24 = new org.apache.openjpa.jdbc.schema.Column[] { column23 };
        pathExpState20.cols = columnArray24;
        pathExpState14.cols = columnArray24;
        pathExpState14.isEmbedElementColl = false;
        pathExpState14.joinedRel = false;
        pathExpState14.joinedRel = true;
        org.apache.openjpa.jdbc.schema.Column[] columnArray33 = pathExpState14.cols;
        pathExpState10.cols = columnArray33;
        pathExpState1.cols = columnArray33;
        pathExpState1.isEmbedElementColl = false;
        org.junit.Assert.assertNull(fieldMapping8);
        org.junit.Assert.assertNull(columnArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(columnArray24);
        org.junit.Assert.assertArrayEquals(columnArray24, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray33);
        org.junit.Assert.assertArrayEquals(columnArray33, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1020");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column column8 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] { column8 };
        pathExpState5.cols = columnArray9;
        boolean boolean11 = pathExpState5.joinedRel;
        pathExpState5.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.field = fieldMapping14;
        boolean boolean16 = pathExpState5.joinedRel;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = pathExpState5.cmpfield;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(fieldMapping17);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1021");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState11 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins10);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState11.field = fieldMapping12;
        org.apache.openjpa.jdbc.schema.Column column14 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] { column14 };
        pathExpState11.cols = columnArray15;
        pathExpState5.cols = columnArray15;
        pathExpState5.isEmbedElementColl = false;
        boolean boolean20 = pathExpState5.joinedRel;
        boolean boolean21 = pathExpState5.isEmbedElementColl;
        pathExpState5.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins24 = pathExpState5.joins;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping25 = null;
        pathExpState5.cmpfield = fieldMapping25;
        pathExpState5.joinedRel = true;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(joins24);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1022");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState1.joins = joins6;
        org.apache.openjpa.jdbc.schema.Column column8 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] { column8 };
        pathExpState1.cols = columnArray9;
        org.apache.openjpa.jdbc.schema.Column[] columnArray11 = new org.apache.openjpa.jdbc.schema.Column[] {};
        pathExpState1.cols = columnArray11;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = pathExpState1.cmpfield;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState1.field = fieldMapping14;
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray11);
        org.junit.Assert.assertArrayEquals(columnArray11, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertNull(fieldMapping13);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1023");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.schema.Column column12 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray13 = new org.apache.openjpa.jdbc.schema.Column[] { column12 };
        pathExpState5.cols = columnArray13;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping15 = pathExpState5.cmpfield;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        pathExpState5.joins = joins16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this._class\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray13);
        org.junit.Assert.assertArrayEquals(columnArray13, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping15);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1024");
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1025");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.cmpfield = fieldMapping12;
        boolean boolean14 = pathExpState5.isEmbedElementColl;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping15 = null;
        pathExpState5.cmpfield = fieldMapping15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNull(joins18);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1026");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState1.joins = joins6;
        org.apache.openjpa.jdbc.schema.Column column8 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] { column8 };
        pathExpState1.cols = columnArray9;
        org.apache.openjpa.jdbc.schema.Column[] columnArray11 = new org.apache.openjpa.jdbc.schema.Column[] {};
        pathExpState1.cols = columnArray11;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = pathExpState1.field;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        pathExpState1.joins = joins14;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = null;
        pathExpState1.cmpfield = fieldMapping16;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        pathExpState1.joins = joins18;
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray11);
        org.junit.Assert.assertArrayEquals(columnArray11, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertNull(fieldMapping13);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1027");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        pathExpState4.field = fieldMapping5;
        org.apache.openjpa.jdbc.schema.Column[] columnArray7 = null;
        pathExpState4.cols = columnArray7;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = null;
        pathExpState4.cmpfield = fieldMapping9;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = null;
        pathExpState4.field = fieldMapping11;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = null;
        pathExpState4.cmpfield = fieldMapping13;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping15 = pathExpState4.cmpfield;
        pathExpState4.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.schema.Column[] columnArray18 = pathExpState4.cols;
        org.apache.openjpa.jdbc.sql.Joins joins19 = null;
        pathExpState4.joins = joins19;
        org.apache.openjpa.jdbc.sql.Result result21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping15);
        org.junit.Assert.assertNull(columnArray18);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1028");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.field = fieldMapping12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pathExpState5.cols;
        boolean boolean17 = pathExpState5.isEmbedElementColl;
        boolean boolean18 = pathExpState5.isEmbedElementColl;
        pathExpState5.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins21 = null;
        pathExpState5.joins = joins21;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1029");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = pathExpState1.cmpfield;
        boolean boolean5 = pathExpState1.joinedRel;
        boolean boolean6 = pathExpState1.isEmbedElementColl;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping7 = pathExpState1.field;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        pathExpState1.joins = joins8;
        org.junit.Assert.assertNull(fieldMapping4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(fieldMapping7);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1030");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState11 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins10);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState11.field = fieldMapping12;
        org.apache.openjpa.jdbc.schema.Column column14 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] { column14 };
        pathExpState11.cols = columnArray15;
        pathExpState5.cols = columnArray15;
        boolean boolean18 = pathExpState5.joinedRel;
        boolean boolean19 = pathExpState5.joinedRel;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1031");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState11 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins10);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState11.field = fieldMapping12;
        org.apache.openjpa.jdbc.schema.Column column14 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] { column14 };
        pathExpState11.cols = columnArray15;
        pathExpState5.cols = columnArray15;
        boolean boolean18 = pathExpState5.joinedRel;
        boolean boolean19 = pathExpState5.joinedRel;
        boolean boolean20 = pathExpState5.isEmbedElementColl;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping21 = pathExpState5.cmpfield;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping22 = null;
        pathExpState5.cmpfield = fieldMapping22;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(fieldMapping21);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1032");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState5.cmpfield = fieldMapping8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = pathExpState5.field;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping12);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1033");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        boolean boolean5 = pathExpState4.isEmbedElementColl;
        org.apache.openjpa.jdbc.schema.Column[] columnArray6 = pathExpState4.cols;
        org.apache.openjpa.jdbc.sql.Result result7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(columnArray6);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1034");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState11 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins10);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState11.field = fieldMapping12;
        org.apache.openjpa.jdbc.schema.Column column14 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] { column14 };
        pathExpState11.cols = columnArray15;
        pathExpState5.cols = columnArray15;
        pathExpState5.isEmbedElementColl = false;
        boolean boolean20 = pathExpState5.joinedRel;
        boolean boolean21 = pathExpState5.isEmbedElementColl;
        pathExpState5.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins24 = pathExpState5.joins;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping25 = null;
        pathExpState5.cmpfield = fieldMapping25;
        pathExpState5.joinedRel = true;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(joins24);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1035");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.field = fieldMapping12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pathExpState5.cols;
        pathExpState5.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins19 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState20 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins19);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping21 = null;
        pathExpState20.field = fieldMapping21;
        org.apache.openjpa.jdbc.schema.Column[] columnArray23 = null;
        pathExpState20.cols = columnArray23;
        org.apache.openjpa.jdbc.sql.Joins joins25 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState26 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins25);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping27 = null;
        pathExpState26.field = fieldMapping27;
        org.apache.openjpa.jdbc.schema.Column column29 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray30 = new org.apache.openjpa.jdbc.schema.Column[] { column29 };
        pathExpState26.cols = columnArray30;
        pathExpState20.cols = columnArray30;
        org.apache.openjpa.jdbc.schema.Column[] columnArray33 = pathExpState20.cols;
        pathExpState5.cols = columnArray33;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping35 = pathExpState5.field;
        org.apache.openjpa.jdbc.sql.Joins joins36 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState37 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins36);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping38 = null;
        pathExpState37.field = fieldMapping38;
        org.apache.openjpa.jdbc.schema.Column[] columnArray40 = null;
        pathExpState37.cols = columnArray40;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping42 = null;
        pathExpState37.cmpfield = fieldMapping42;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping44 = null;
        pathExpState37.field = fieldMapping44;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping46 = null;
        pathExpState37.cmpfield = fieldMapping46;
        org.apache.openjpa.jdbc.schema.Column[] columnArray48 = pathExpState37.cols;
        pathExpState37.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins51 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState52 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins51);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping53 = null;
        pathExpState52.field = fieldMapping53;
        org.apache.openjpa.jdbc.schema.Column[] columnArray55 = null;
        pathExpState52.cols = columnArray55;
        org.apache.openjpa.jdbc.sql.Joins joins57 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState58 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins57);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping59 = null;
        pathExpState58.field = fieldMapping59;
        org.apache.openjpa.jdbc.schema.Column column61 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray62 = new org.apache.openjpa.jdbc.schema.Column[] { column61 };
        pathExpState58.cols = columnArray62;
        pathExpState52.cols = columnArray62;
        org.apache.openjpa.jdbc.schema.Column[] columnArray65 = pathExpState52.cols;
        pathExpState37.cols = columnArray65;
        pathExpState5.cols = columnArray65;
        org.apache.openjpa.jdbc.sql.Joins joins68 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState69 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins68);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping70 = null;
        pathExpState69.field = fieldMapping70;
        org.apache.openjpa.jdbc.schema.Column[] columnArray72 = null;
        pathExpState69.cols = columnArray72;
        org.apache.openjpa.jdbc.sql.Joins joins74 = null;
        pathExpState69.joins = joins74;
        org.apache.openjpa.jdbc.schema.Column column76 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray77 = new org.apache.openjpa.jdbc.schema.Column[] { column76 };
        pathExpState69.cols = columnArray77;
        pathExpState5.cols = columnArray77;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer80 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray16);
        org.junit.Assert.assertNotNull(columnArray30);
        org.junit.Assert.assertArrayEquals(columnArray30, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray33);
        org.junit.Assert.assertArrayEquals(columnArray33, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping35);
        org.junit.Assert.assertNull(columnArray48);
        org.junit.Assert.assertNotNull(columnArray62);
        org.junit.Assert.assertArrayEquals(columnArray62, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray65);
        org.junit.Assert.assertArrayEquals(columnArray65, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray77);
        org.junit.Assert.assertArrayEquals(columnArray77, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1036");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState7 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins6);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState7.field = fieldMapping8;
        org.apache.openjpa.jdbc.schema.Column column10 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray11 = new org.apache.openjpa.jdbc.schema.Column[] { column10 };
        pathExpState7.cols = columnArray11;
        pathExpState1.cols = columnArray11;
        org.apache.openjpa.jdbc.sql.Joins joins14 = pathExpState1.joins;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = pathExpState1.cols;
        java.lang.Class<?> wildcardClass16 = columnArray15.getClass();
        org.junit.Assert.assertNotNull(columnArray11);
        org.junit.Assert.assertArrayEquals(columnArray11, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1037");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.field = fieldMapping12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pathExpState5.cols;
        org.apache.openjpa.jdbc.sql.Joins joins17 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState19 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins18);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping20 = null;
        pathExpState19.field = fieldMapping20;
        org.apache.openjpa.jdbc.schema.Column[] columnArray22 = null;
        pathExpState19.cols = columnArray22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        pathExpState19.joins = joins24;
        org.apache.openjpa.jdbc.schema.Column column26 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray27 = new org.apache.openjpa.jdbc.schema.Column[] { column26 };
        pathExpState19.cols = columnArray27;
        pathExpState5.cols = columnArray27;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray16);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNotNull(columnArray27);
        org.junit.Assert.assertArrayEquals(columnArray27, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1038");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.cmpfield = fieldMapping2;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = pathExpState1.field;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        pathExpState1.joins = joins5;
        org.junit.Assert.assertNull(fieldMapping4);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1039");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.cmpfield = fieldMapping2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = pathExpState1.joins;
        pathExpState1.joinedRel = true;
        org.junit.Assert.assertNull(joins4);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1040");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.schema.Column[] columnArray12 = pathExpState5.cols;
        boolean boolean13 = pathExpState5.joinedRel;
        pathExpState5.joinedRel = false;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1041");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pathExpState5.cmpfield;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = null;
        pathExpState5.cmpfield = fieldMapping9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState12 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins11);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = null;
        pathExpState12.field = fieldMapping13;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = null;
        pathExpState12.cols = columnArray15;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = null;
        pathExpState12.cmpfield = fieldMapping17;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping19 = null;
        pathExpState12.field = fieldMapping19;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping21 = null;
        pathExpState12.cmpfield = fieldMapping21;
        org.apache.openjpa.jdbc.schema.Column[] columnArray23 = pathExpState12.cols;
        pathExpState12.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins26 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState27 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins26);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping28 = null;
        pathExpState27.field = fieldMapping28;
        org.apache.openjpa.jdbc.schema.Column[] columnArray30 = null;
        pathExpState27.cols = columnArray30;
        org.apache.openjpa.jdbc.sql.Joins joins32 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState33 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins32);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping34 = null;
        pathExpState33.field = fieldMapping34;
        org.apache.openjpa.jdbc.schema.Column column36 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray37 = new org.apache.openjpa.jdbc.schema.Column[] { column36 };
        pathExpState33.cols = columnArray37;
        pathExpState27.cols = columnArray37;
        org.apache.openjpa.jdbc.schema.Column[] columnArray40 = pathExpState27.cols;
        pathExpState12.cols = columnArray40;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping42 = pathExpState12.field;
        org.apache.openjpa.jdbc.sql.Joins joins43 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState44 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins43);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping45 = null;
        pathExpState44.field = fieldMapping45;
        org.apache.openjpa.jdbc.schema.Column[] columnArray47 = null;
        pathExpState44.cols = columnArray47;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping49 = null;
        pathExpState44.cmpfield = fieldMapping49;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping51 = null;
        pathExpState44.field = fieldMapping51;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping53 = null;
        pathExpState44.cmpfield = fieldMapping53;
        org.apache.openjpa.jdbc.schema.Column[] columnArray55 = pathExpState44.cols;
        pathExpState44.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins58 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState59 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins58);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping60 = null;
        pathExpState59.field = fieldMapping60;
        org.apache.openjpa.jdbc.schema.Column[] columnArray62 = null;
        pathExpState59.cols = columnArray62;
        org.apache.openjpa.jdbc.sql.Joins joins64 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState65 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins64);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping66 = null;
        pathExpState65.field = fieldMapping66;
        org.apache.openjpa.jdbc.schema.Column column68 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray69 = new org.apache.openjpa.jdbc.schema.Column[] { column68 };
        pathExpState65.cols = columnArray69;
        pathExpState59.cols = columnArray69;
        org.apache.openjpa.jdbc.schema.Column[] columnArray72 = pathExpState59.cols;
        pathExpState44.cols = columnArray72;
        pathExpState12.cols = columnArray72;
        org.apache.openjpa.jdbc.sql.Joins joins75 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState76 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins75);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping77 = null;
        pathExpState76.field = fieldMapping77;
        org.apache.openjpa.jdbc.schema.Column[] columnArray79 = null;
        pathExpState76.cols = columnArray79;
        org.apache.openjpa.jdbc.sql.Joins joins81 = null;
        pathExpState76.joins = joins81;
        org.apache.openjpa.jdbc.schema.Column column83 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray84 = new org.apache.openjpa.jdbc.schema.Column[] { column83 };
        pathExpState76.cols = columnArray84;
        pathExpState12.cols = columnArray84;
        pathExpState5.cols = columnArray84;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer88 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping8);
        org.junit.Assert.assertNull(columnArray23);
        org.junit.Assert.assertNotNull(columnArray37);
        org.junit.Assert.assertArrayEquals(columnArray37, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray40);
        org.junit.Assert.assertArrayEquals(columnArray40, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping42);
        org.junit.Assert.assertNull(columnArray55);
        org.junit.Assert.assertNotNull(columnArray69);
        org.junit.Assert.assertArrayEquals(columnArray69, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray72);
        org.junit.Assert.assertArrayEquals(columnArray72, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray84);
        org.junit.Assert.assertArrayEquals(columnArray84, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1042");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.field = fieldMapping12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        pathExpState5.joins = joins16;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping18 = pathExpState5.field;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping18);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1043");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pathExpState5.cmpfield;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = null;
        pathExpState5.cmpfield = fieldMapping9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = pathExpState5.joins;
        pathExpState5.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.schema.Column[] columnArray14 = pathExpState5.cols;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping8);
        org.junit.Assert.assertNull(joins11);
        org.junit.Assert.assertNull(columnArray14);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1044");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState1.cmpfield = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState1.field = fieldMapping8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState1.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.schema.Column[] columnArray12 = pathExpState1.cols;
        boolean boolean13 = pathExpState1.isEmbedElementColl;
        pathExpState1.isEmbedElementColl = true;
        boolean boolean16 = pathExpState1.joinedRel;
        boolean boolean17 = pathExpState1.isEmbedElementColl;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping18 = null;
        pathExpState1.cmpfield = fieldMapping18;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping20 = pathExpState1.field;
        org.junit.Assert.assertNull(columnArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(fieldMapping20);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1045");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pathExpState5.cmpfield;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = pathExpState5.cols;
        boolean boolean10 = pathExpState5.isEmbedElementColl;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState12 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins11);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = null;
        pathExpState12.field = fieldMapping13;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = null;
        pathExpState12.cols = columnArray15;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = null;
        pathExpState12.cmpfield = fieldMapping17;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping19 = null;
        pathExpState12.field = fieldMapping19;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping21 = null;
        pathExpState12.cmpfield = fieldMapping21;
        org.apache.openjpa.jdbc.schema.Column[] columnArray23 = pathExpState12.cols;
        pathExpState12.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins26 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState27 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins26);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping28 = null;
        pathExpState27.field = fieldMapping28;
        org.apache.openjpa.jdbc.schema.Column[] columnArray30 = null;
        pathExpState27.cols = columnArray30;
        org.apache.openjpa.jdbc.sql.Joins joins32 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState33 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins32);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping34 = null;
        pathExpState33.field = fieldMapping34;
        org.apache.openjpa.jdbc.schema.Column column36 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray37 = new org.apache.openjpa.jdbc.schema.Column[] { column36 };
        pathExpState33.cols = columnArray37;
        pathExpState27.cols = columnArray37;
        org.apache.openjpa.jdbc.schema.Column[] columnArray40 = pathExpState27.cols;
        pathExpState12.cols = columnArray40;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping42 = pathExpState12.field;
        org.apache.openjpa.jdbc.sql.Joins joins43 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState44 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins43);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping45 = null;
        pathExpState44.field = fieldMapping45;
        org.apache.openjpa.jdbc.schema.Column[] columnArray47 = null;
        pathExpState44.cols = columnArray47;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping49 = null;
        pathExpState44.cmpfield = fieldMapping49;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping51 = null;
        pathExpState44.field = fieldMapping51;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping53 = null;
        pathExpState44.cmpfield = fieldMapping53;
        org.apache.openjpa.jdbc.schema.Column[] columnArray55 = pathExpState44.cols;
        pathExpState44.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins58 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState59 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins58);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping60 = null;
        pathExpState59.field = fieldMapping60;
        org.apache.openjpa.jdbc.schema.Column[] columnArray62 = null;
        pathExpState59.cols = columnArray62;
        org.apache.openjpa.jdbc.sql.Joins joins64 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState65 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins64);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping66 = null;
        pathExpState65.field = fieldMapping66;
        org.apache.openjpa.jdbc.schema.Column column68 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray69 = new org.apache.openjpa.jdbc.schema.Column[] { column68 };
        pathExpState65.cols = columnArray69;
        pathExpState59.cols = columnArray69;
        org.apache.openjpa.jdbc.schema.Column[] columnArray72 = pathExpState59.cols;
        pathExpState44.cols = columnArray72;
        pathExpState12.cols = columnArray72;
        pathExpState5.cols = columnArray72;
        pathExpState5.joinedRel = true;
        org.apache.openjpa.jdbc.sql.Joins joins78 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState79 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins78);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping80 = null;
        pathExpState79.field = fieldMapping80;
        org.apache.openjpa.jdbc.schema.Column column82 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray83 = new org.apache.openjpa.jdbc.schema.Column[] { column82 };
        pathExpState79.cols = columnArray83;
        boolean boolean85 = pathExpState79.joinedRel;
        pathExpState79.isEmbedElementColl = false;
        boolean boolean88 = pathExpState79.joinedRel;
        org.apache.openjpa.jdbc.schema.Column[] columnArray89 = pathExpState79.cols;
        pathExpState5.cols = columnArray89;
        boolean boolean91 = pathExpState5.joinedRel;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer92 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping8);
        org.junit.Assert.assertNull(columnArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(columnArray23);
        org.junit.Assert.assertNotNull(columnArray37);
        org.junit.Assert.assertArrayEquals(columnArray37, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray40);
        org.junit.Assert.assertArrayEquals(columnArray40, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping42);
        org.junit.Assert.assertNull(columnArray55);
        org.junit.Assert.assertNotNull(columnArray69);
        org.junit.Assert.assertArrayEquals(columnArray69, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray72);
        org.junit.Assert.assertArrayEquals(columnArray72, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray83);
        org.junit.Assert.assertArrayEquals(columnArray83, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(columnArray89);
        org.junit.Assert.assertArrayEquals(columnArray89, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1046");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        pathExpState5.joinedRel = true;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = pathExpState5.field;
        pathExpState5.joinedRel = false;
        org.apache.openjpa.jdbc.schema.Column[] columnArray17 = pathExpState5.cols;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        pathExpState5.joins = joins18;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.orderBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping14);
        org.junit.Assert.assertNull(columnArray17);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1047");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.field = fieldMapping12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pathExpState5.cols;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = pathExpState5.cmpfield;
        pathExpState5.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        pathExpState5.joins = joins20;
        pathExpState5.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping24 = pathExpState5.field;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray16);
        org.junit.Assert.assertNull(fieldMapping17);
        org.junit.Assert.assertNull(fieldMapping24);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1048");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState7 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins6);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState7.field = fieldMapping8;
        org.apache.openjpa.jdbc.schema.Column column10 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray11 = new org.apache.openjpa.jdbc.schema.Column[] { column10 };
        pathExpState7.cols = columnArray11;
        pathExpState1.cols = columnArray11;
        pathExpState1.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.sql.Joins joins16 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState17 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins16);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping18 = null;
        pathExpState17.field = fieldMapping18;
        org.apache.openjpa.jdbc.schema.Column[] columnArray20 = null;
        pathExpState17.cols = columnArray20;
        org.apache.openjpa.jdbc.sql.Joins joins22 = null;
        pathExpState17.joins = joins22;
        org.apache.openjpa.jdbc.schema.Column column24 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray25 = new org.apache.openjpa.jdbc.schema.Column[] { column24 };
        pathExpState17.cols = columnArray25;
        pathExpState1.cols = columnArray25;
        pathExpState1.isEmbedElementColl = true;
        boolean boolean30 = pathExpState1.isEmbedElementColl;
        org.apache.openjpa.jdbc.schema.Column[] columnArray31 = pathExpState1.cols;
        org.junit.Assert.assertNotNull(columnArray11);
        org.junit.Assert.assertArrayEquals(columnArray11, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray25);
        org.junit.Assert.assertArrayEquals(columnArray25, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(columnArray31);
        org.junit.Assert.assertArrayEquals(columnArray31, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1049");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState1.joins = joins6;
        org.apache.openjpa.jdbc.schema.Column column8 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] { column8 };
        pathExpState1.cols = columnArray9;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = pathExpState1.cmpfield;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState1.field = fieldMapping12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        pathExpState1.joins = joins14;
        boolean boolean16 = pathExpState1.joinedRel;
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1050");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState5.cmpfield = fieldMapping8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = pathExpState5.field;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping10);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1051");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.field = fieldMapping12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pathExpState5.cols;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = pathExpState5.cmpfield;
        pathExpState5.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray16);
        org.junit.Assert.assertNull(fieldMapping17);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1052");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState11 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins10);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState11.field = fieldMapping12;
        org.apache.openjpa.jdbc.schema.Column column14 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] { column14 };
        pathExpState11.cols = columnArray15;
        pathExpState5.cols = columnArray15;
        pathExpState5.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState21 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins20);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping22 = null;
        pathExpState21.field = fieldMapping22;
        org.apache.openjpa.jdbc.schema.Column[] columnArray24 = null;
        pathExpState21.cols = columnArray24;
        org.apache.openjpa.jdbc.sql.Joins joins26 = null;
        pathExpState21.joins = joins26;
        org.apache.openjpa.jdbc.schema.Column column28 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray29 = new org.apache.openjpa.jdbc.schema.Column[] { column28 };
        pathExpState21.cols = columnArray29;
        pathExpState5.cols = columnArray29;
        boolean boolean32 = pathExpState5.isEmbedElementColl;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping33 = pathExpState5.field;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray29);
        org.junit.Assert.assertArrayEquals(columnArray29, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(fieldMapping33);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1053");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        pathExpState5.joinedRel = true;
        pathExpState5.isEmbedElementColl = false;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1054");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState1.joins = joins6;
        pathExpState1.joinedRel = true;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = pathExpState1.field;
        pathExpState1.joinedRel = false;
        pathExpState1.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = pathExpState1.cols;
        org.apache.openjpa.jdbc.sql.Joins joins16 = pathExpState1.joins;
        org.junit.Assert.assertNull(fieldMapping10);
        org.junit.Assert.assertNull(columnArray15);
        org.junit.Assert.assertNull(joins16);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1055");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pathExpState5.cmpfield;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = null;
        pathExpState5.cmpfield = fieldMapping9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState12 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins11);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = null;
        pathExpState12.field = fieldMapping13;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = null;
        pathExpState12.cols = columnArray15;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = null;
        pathExpState12.cmpfield = fieldMapping17;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping19 = null;
        pathExpState12.field = fieldMapping19;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping21 = null;
        pathExpState12.cmpfield = fieldMapping21;
        org.apache.openjpa.jdbc.schema.Column[] columnArray23 = pathExpState12.cols;
        pathExpState12.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins26 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState27 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins26);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping28 = null;
        pathExpState27.field = fieldMapping28;
        org.apache.openjpa.jdbc.schema.Column[] columnArray30 = null;
        pathExpState27.cols = columnArray30;
        org.apache.openjpa.jdbc.sql.Joins joins32 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState33 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins32);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping34 = null;
        pathExpState33.field = fieldMapping34;
        org.apache.openjpa.jdbc.schema.Column column36 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray37 = new org.apache.openjpa.jdbc.schema.Column[] { column36 };
        pathExpState33.cols = columnArray37;
        pathExpState27.cols = columnArray37;
        org.apache.openjpa.jdbc.schema.Column[] columnArray40 = pathExpState27.cols;
        pathExpState12.cols = columnArray40;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping42 = pathExpState12.field;
        org.apache.openjpa.jdbc.sql.Joins joins43 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState44 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins43);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping45 = null;
        pathExpState44.field = fieldMapping45;
        org.apache.openjpa.jdbc.schema.Column[] columnArray47 = null;
        pathExpState44.cols = columnArray47;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping49 = null;
        pathExpState44.cmpfield = fieldMapping49;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping51 = null;
        pathExpState44.field = fieldMapping51;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping53 = null;
        pathExpState44.cmpfield = fieldMapping53;
        org.apache.openjpa.jdbc.schema.Column[] columnArray55 = pathExpState44.cols;
        pathExpState44.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins58 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState59 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins58);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping60 = null;
        pathExpState59.field = fieldMapping60;
        org.apache.openjpa.jdbc.schema.Column[] columnArray62 = null;
        pathExpState59.cols = columnArray62;
        org.apache.openjpa.jdbc.sql.Joins joins64 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState65 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins64);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping66 = null;
        pathExpState65.field = fieldMapping66;
        org.apache.openjpa.jdbc.schema.Column column68 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray69 = new org.apache.openjpa.jdbc.schema.Column[] { column68 };
        pathExpState65.cols = columnArray69;
        pathExpState59.cols = columnArray69;
        org.apache.openjpa.jdbc.schema.Column[] columnArray72 = pathExpState59.cols;
        pathExpState44.cols = columnArray72;
        pathExpState12.cols = columnArray72;
        org.apache.openjpa.jdbc.sql.Joins joins75 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState76 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins75);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping77 = null;
        pathExpState76.field = fieldMapping77;
        org.apache.openjpa.jdbc.schema.Column[] columnArray79 = null;
        pathExpState76.cols = columnArray79;
        org.apache.openjpa.jdbc.sql.Joins joins81 = null;
        pathExpState76.joins = joins81;
        org.apache.openjpa.jdbc.schema.Column column83 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray84 = new org.apache.openjpa.jdbc.schema.Column[] { column83 };
        pathExpState76.cols = columnArray84;
        pathExpState12.cols = columnArray84;
        pathExpState5.cols = columnArray84;
        pathExpState5.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.sql.Joins joins90 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer91 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping8);
        org.junit.Assert.assertNull(columnArray23);
        org.junit.Assert.assertNotNull(columnArray37);
        org.junit.Assert.assertArrayEquals(columnArray37, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray40);
        org.junit.Assert.assertArrayEquals(columnArray40, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping42);
        org.junit.Assert.assertNull(columnArray55);
        org.junit.Assert.assertNotNull(columnArray69);
        org.junit.Assert.assertArrayEquals(columnArray69, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray72);
        org.junit.Assert.assertArrayEquals(columnArray72, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray84);
        org.junit.Assert.assertArrayEquals(columnArray84, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(joins90);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1056");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = pathExpState1.cmpfield;
        boolean boolean5 = pathExpState1.joinedRel;
        boolean boolean6 = pathExpState1.isEmbedElementColl;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping7 = pathExpState1.field;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState1.field = fieldMapping8;
        pathExpState1.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState1.field = fieldMapping12;
        org.junit.Assert.assertNull(fieldMapping4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(fieldMapping7);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1057");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pathExpState5.cmpfield;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = null;
        pathExpState5.cmpfield = fieldMapping9;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState12 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins11);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = null;
        pathExpState12.field = fieldMapping13;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = null;
        pathExpState12.cols = columnArray15;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = null;
        pathExpState12.cmpfield = fieldMapping17;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping19 = null;
        pathExpState12.field = fieldMapping19;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping21 = null;
        pathExpState12.cmpfield = fieldMapping21;
        org.apache.openjpa.jdbc.schema.Column[] columnArray23 = pathExpState12.cols;
        pathExpState12.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins26 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState27 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins26);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping28 = null;
        pathExpState27.field = fieldMapping28;
        org.apache.openjpa.jdbc.schema.Column[] columnArray30 = null;
        pathExpState27.cols = columnArray30;
        org.apache.openjpa.jdbc.sql.Joins joins32 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState33 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins32);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping34 = null;
        pathExpState33.field = fieldMapping34;
        org.apache.openjpa.jdbc.schema.Column column36 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray37 = new org.apache.openjpa.jdbc.schema.Column[] { column36 };
        pathExpState33.cols = columnArray37;
        pathExpState27.cols = columnArray37;
        org.apache.openjpa.jdbc.schema.Column[] columnArray40 = pathExpState27.cols;
        pathExpState12.cols = columnArray40;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping42 = pathExpState12.field;
        org.apache.openjpa.jdbc.sql.Joins joins43 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState44 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins43);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping45 = null;
        pathExpState44.field = fieldMapping45;
        org.apache.openjpa.jdbc.schema.Column[] columnArray47 = null;
        pathExpState44.cols = columnArray47;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping49 = null;
        pathExpState44.cmpfield = fieldMapping49;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping51 = null;
        pathExpState44.field = fieldMapping51;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping53 = null;
        pathExpState44.cmpfield = fieldMapping53;
        org.apache.openjpa.jdbc.schema.Column[] columnArray55 = pathExpState44.cols;
        pathExpState44.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins58 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState59 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins58);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping60 = null;
        pathExpState59.field = fieldMapping60;
        org.apache.openjpa.jdbc.schema.Column[] columnArray62 = null;
        pathExpState59.cols = columnArray62;
        org.apache.openjpa.jdbc.sql.Joins joins64 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState65 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins64);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping66 = null;
        pathExpState65.field = fieldMapping66;
        org.apache.openjpa.jdbc.schema.Column column68 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray69 = new org.apache.openjpa.jdbc.schema.Column[] { column68 };
        pathExpState65.cols = columnArray69;
        pathExpState59.cols = columnArray69;
        org.apache.openjpa.jdbc.schema.Column[] columnArray72 = pathExpState59.cols;
        pathExpState44.cols = columnArray72;
        pathExpState12.cols = columnArray72;
        org.apache.openjpa.jdbc.sql.Joins joins75 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState76 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins75);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping77 = null;
        pathExpState76.field = fieldMapping77;
        org.apache.openjpa.jdbc.schema.Column[] columnArray79 = null;
        pathExpState76.cols = columnArray79;
        org.apache.openjpa.jdbc.sql.Joins joins81 = null;
        pathExpState76.joins = joins81;
        org.apache.openjpa.jdbc.schema.Column column83 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray84 = new org.apache.openjpa.jdbc.schema.Column[] { column83 };
        pathExpState76.cols = columnArray84;
        pathExpState12.cols = columnArray84;
        pathExpState5.cols = columnArray84;
        pathExpState5.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping90 = pathExpState5.field;
        pathExpState5.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer93 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping8);
        org.junit.Assert.assertNull(columnArray23);
        org.junit.Assert.assertNotNull(columnArray37);
        org.junit.Assert.assertArrayEquals(columnArray37, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray40);
        org.junit.Assert.assertArrayEquals(columnArray40, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping42);
        org.junit.Assert.assertNull(columnArray55);
        org.junit.Assert.assertNotNull(columnArray69);
        org.junit.Assert.assertArrayEquals(columnArray69, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray72);
        org.junit.Assert.assertArrayEquals(columnArray72, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray84);
        org.junit.Assert.assertArrayEquals(columnArray84, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping90);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1058");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = pathExpState1.cmpfield;
        org.apache.openjpa.jdbc.schema.Column[] columnArray5 = pathExpState1.cols;
        boolean boolean6 = pathExpState1.isEmbedElementColl;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping7 = pathExpState1.field;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState1.field = fieldMapping8;
        org.junit.Assert.assertNull(fieldMapping4);
        org.junit.Assert.assertNull(columnArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(fieldMapping7);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1059");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState1.joins = joins6;
        org.apache.openjpa.jdbc.schema.Column column8 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] { column8 };
        pathExpState1.cols = columnArray9;
        org.apache.openjpa.jdbc.schema.Column[] columnArray11 = new org.apache.openjpa.jdbc.schema.Column[] {};
        pathExpState1.cols = columnArray11;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = pathExpState1.field;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        pathExpState1.joins = joins14;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = pathExpState1.field;
        boolean boolean17 = pathExpState1.isEmbedElementColl;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState19 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins18);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping20 = null;
        pathExpState19.field = fieldMapping20;
        org.apache.openjpa.jdbc.schema.Column[] columnArray22 = null;
        pathExpState19.cols = columnArray22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        pathExpState19.joins = joins24;
        org.apache.openjpa.jdbc.schema.Column[] columnArray26 = pathExpState19.cols;
        org.apache.openjpa.jdbc.schema.Column[] columnArray27 = pathExpState19.cols;
        org.apache.openjpa.jdbc.sql.Joins joins28 = pathExpState19.joins;
        boolean boolean29 = pathExpState19.isEmbedElementColl;
        org.apache.openjpa.jdbc.sql.Joins joins30 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState31 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins30);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping32 = null;
        pathExpState31.cmpfield = fieldMapping32;
        org.apache.openjpa.jdbc.schema.Column[] columnArray34 = pathExpState31.cols;
        org.apache.openjpa.jdbc.sql.Joins joins35 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState36 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins35);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping37 = null;
        pathExpState36.field = fieldMapping37;
        org.apache.openjpa.jdbc.schema.Column[] columnArray39 = null;
        pathExpState36.cols = columnArray39;
        org.apache.openjpa.jdbc.sql.Joins joins41 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState42 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins41);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping43 = null;
        pathExpState42.field = fieldMapping43;
        org.apache.openjpa.jdbc.schema.Column column45 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray46 = new org.apache.openjpa.jdbc.schema.Column[] { column45 };
        pathExpState42.cols = columnArray46;
        pathExpState36.cols = columnArray46;
        org.apache.openjpa.jdbc.schema.Column[] columnArray49 = pathExpState36.cols;
        pathExpState31.cols = columnArray49;
        org.apache.openjpa.jdbc.schema.Column[] columnArray51 = pathExpState31.cols;
        pathExpState19.cols = columnArray51;
        pathExpState1.cols = columnArray51;
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray11);
        org.junit.Assert.assertArrayEquals(columnArray11, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertNull(fieldMapping13);
        org.junit.Assert.assertNull(fieldMapping16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(columnArray26);
        org.junit.Assert.assertNull(columnArray27);
        org.junit.Assert.assertNull(joins28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(columnArray34);
        org.junit.Assert.assertNotNull(columnArray46);
        org.junit.Assert.assertArrayEquals(columnArray46, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray49);
        org.junit.Assert.assertArrayEquals(columnArray49, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray51);
        org.junit.Assert.assertArrayEquals(columnArray51, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1060");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState7 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins6);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState7.field = fieldMapping8;
        org.apache.openjpa.jdbc.schema.Column column10 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray11 = new org.apache.openjpa.jdbc.schema.Column[] { column10 };
        pathExpState7.cols = columnArray11;
        pathExpState1.cols = columnArray11;
        pathExpState1.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = null;
        pathExpState1.cmpfield = fieldMapping16;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        pathExpState1.joins = joins18;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping20 = pathExpState1.field;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping21 = pathExpState1.cmpfield;
        org.junit.Assert.assertNotNull(columnArray11);
        org.junit.Assert.assertArrayEquals(columnArray11, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping20);
        org.junit.Assert.assertNull(fieldMapping21);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1061");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.field = fieldMapping12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pathExpState5.cols;
        pathExpState5.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins19 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState20 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins19);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping21 = null;
        pathExpState20.field = fieldMapping21;
        org.apache.openjpa.jdbc.schema.Column[] columnArray23 = null;
        pathExpState20.cols = columnArray23;
        org.apache.openjpa.jdbc.sql.Joins joins25 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState26 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins25);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping27 = null;
        pathExpState26.field = fieldMapping27;
        org.apache.openjpa.jdbc.schema.Column column29 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray30 = new org.apache.openjpa.jdbc.schema.Column[] { column29 };
        pathExpState26.cols = columnArray30;
        pathExpState20.cols = columnArray30;
        org.apache.openjpa.jdbc.schema.Column[] columnArray33 = pathExpState20.cols;
        pathExpState5.cols = columnArray33;
        org.apache.openjpa.jdbc.sql.Joins joins35 = null;
        pathExpState5.joins = joins35;
        org.apache.openjpa.jdbc.sql.Joins joins37 = null;
        pathExpState5.joins = joins37;
        boolean boolean39 = pathExpState5.isEmbedElementColl;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray16);
        org.junit.Assert.assertNotNull(columnArray30);
        org.junit.Assert.assertArrayEquals(columnArray30, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray33);
        org.junit.Assert.assertArrayEquals(columnArray33, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1062");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.schema.Column column12 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray13 = new org.apache.openjpa.jdbc.schema.Column[] { column12 };
        pathExpState5.cols = columnArray13;
        pathExpState5.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState18 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins17);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping19 = null;
        pathExpState18.field = fieldMapping19;
        org.apache.openjpa.jdbc.schema.Column[] columnArray21 = null;
        pathExpState18.cols = columnArray21;
        org.apache.openjpa.jdbc.sql.Joins joins23 = null;
        pathExpState18.joins = joins23;
        org.apache.openjpa.jdbc.schema.Column[] columnArray25 = pathExpState18.cols;
        org.apache.openjpa.jdbc.schema.Column[] columnArray26 = pathExpState18.cols;
        org.apache.openjpa.jdbc.sql.Joins joins27 = pathExpState18.joins;
        boolean boolean28 = pathExpState18.isEmbedElementColl;
        org.apache.openjpa.jdbc.sql.Joins joins29 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState30 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins29);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping31 = null;
        pathExpState30.cmpfield = fieldMapping31;
        org.apache.openjpa.jdbc.schema.Column[] columnArray33 = pathExpState30.cols;
        org.apache.openjpa.jdbc.sql.Joins joins34 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState35 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins34);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping36 = null;
        pathExpState35.field = fieldMapping36;
        org.apache.openjpa.jdbc.schema.Column[] columnArray38 = null;
        pathExpState35.cols = columnArray38;
        org.apache.openjpa.jdbc.sql.Joins joins40 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState41 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins40);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping42 = null;
        pathExpState41.field = fieldMapping42;
        org.apache.openjpa.jdbc.schema.Column column44 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray45 = new org.apache.openjpa.jdbc.schema.Column[] { column44 };
        pathExpState41.cols = columnArray45;
        pathExpState35.cols = columnArray45;
        org.apache.openjpa.jdbc.schema.Column[] columnArray48 = pathExpState35.cols;
        pathExpState30.cols = columnArray48;
        org.apache.openjpa.jdbc.schema.Column[] columnArray50 = pathExpState30.cols;
        pathExpState18.cols = columnArray50;
        pathExpState5.cols = columnArray50;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this._class\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray13);
        org.junit.Assert.assertArrayEquals(columnArray13, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(columnArray25);
        org.junit.Assert.assertNull(columnArray26);
        org.junit.Assert.assertNull(joins27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(columnArray33);
        org.junit.Assert.assertNotNull(columnArray45);
        org.junit.Assert.assertArrayEquals(columnArray45, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray48);
        org.junit.Assert.assertArrayEquals(columnArray48, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray50);
        org.junit.Assert.assertArrayEquals(columnArray50, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1063");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        boolean boolean6 = pathExpState5.isEmbedElementColl;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1064");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        pathExpState4.field = fieldMapping5;
        org.apache.openjpa.jdbc.schema.Column[] columnArray7 = null;
        pathExpState4.cols = columnArray7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        pathExpState4.joins = joins9;
        org.apache.openjpa.jdbc.schema.Column column11 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray12 = new org.apache.openjpa.jdbc.schema.Column[] { column11 };
        pathExpState4.cols = columnArray12;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState15 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins14);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = null;
        pathExpState15.field = fieldMapping16;
        org.apache.openjpa.jdbc.schema.Column column18 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray19 = new org.apache.openjpa.jdbc.schema.Column[] { column18 };
        pathExpState15.cols = columnArray19;
        pathExpState4.cols = columnArray19;
        org.apache.openjpa.jdbc.schema.Column[] columnArray22 = pathExpState4.cols;
        org.apache.openjpa.jdbc.sql.Result result23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray12);
        org.junit.Assert.assertArrayEquals(columnArray12, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray19);
        org.junit.Assert.assertArrayEquals(columnArray19, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray22);
        org.junit.Assert.assertArrayEquals(columnArray22, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1065");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState1.cmpfield = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState1.field = fieldMapping8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState1.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.schema.Column[] columnArray12 = pathExpState1.cols;
        pathExpState1.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState16 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins15);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = null;
        pathExpState16.field = fieldMapping17;
        org.apache.openjpa.jdbc.schema.Column[] columnArray19 = null;
        pathExpState16.cols = columnArray19;
        org.apache.openjpa.jdbc.sql.Joins joins21 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState22 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins21);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping23 = null;
        pathExpState22.field = fieldMapping23;
        org.apache.openjpa.jdbc.schema.Column column25 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray26 = new org.apache.openjpa.jdbc.schema.Column[] { column25 };
        pathExpState22.cols = columnArray26;
        pathExpState16.cols = columnArray26;
        org.apache.openjpa.jdbc.schema.Column[] columnArray29 = pathExpState16.cols;
        pathExpState1.cols = columnArray29;
        org.apache.openjpa.jdbc.sql.Joins joins31 = null;
        pathExpState1.joins = joins31;
        org.apache.openjpa.jdbc.sql.Joins joins33 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState34 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins33);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping35 = null;
        pathExpState34.field = fieldMapping35;
        org.apache.openjpa.jdbc.schema.Column[] columnArray37 = null;
        pathExpState34.cols = columnArray37;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping39 = null;
        pathExpState34.cmpfield = fieldMapping39;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping41 = null;
        pathExpState34.field = fieldMapping41;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping43 = null;
        pathExpState34.cmpfield = fieldMapping43;
        org.apache.openjpa.jdbc.schema.Column[] columnArray45 = pathExpState34.cols;
        pathExpState34.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins48 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState49 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins48);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping50 = null;
        pathExpState49.field = fieldMapping50;
        org.apache.openjpa.jdbc.schema.Column[] columnArray52 = null;
        pathExpState49.cols = columnArray52;
        org.apache.openjpa.jdbc.sql.Joins joins54 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState55 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins54);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping56 = null;
        pathExpState55.field = fieldMapping56;
        org.apache.openjpa.jdbc.schema.Column column58 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray59 = new org.apache.openjpa.jdbc.schema.Column[] { column58 };
        pathExpState55.cols = columnArray59;
        pathExpState49.cols = columnArray59;
        org.apache.openjpa.jdbc.schema.Column[] columnArray62 = pathExpState49.cols;
        pathExpState34.cols = columnArray62;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping64 = pathExpState34.field;
        org.apache.openjpa.jdbc.schema.Column[] columnArray65 = pathExpState34.cols;
        org.apache.openjpa.jdbc.schema.Column[] columnArray66 = pathExpState34.cols;
        pathExpState1.cols = columnArray66;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping68 = pathExpState1.field;
        org.junit.Assert.assertNull(columnArray12);
        org.junit.Assert.assertNotNull(columnArray26);
        org.junit.Assert.assertArrayEquals(columnArray26, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray29);
        org.junit.Assert.assertArrayEquals(columnArray29, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(columnArray45);
        org.junit.Assert.assertNotNull(columnArray59);
        org.junit.Assert.assertArrayEquals(columnArray59, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray62);
        org.junit.Assert.assertArrayEquals(columnArray62, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping64);
        org.junit.Assert.assertNotNull(columnArray65);
        org.junit.Assert.assertArrayEquals(columnArray65, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray66);
        org.junit.Assert.assertArrayEquals(columnArray66, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping68);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1066");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        pathExpState4.field = fieldMapping5;
        org.apache.openjpa.jdbc.schema.Column[] columnArray7 = null;
        pathExpState4.cols = columnArray7;
        org.apache.openjpa.jdbc.sql.Joins joins9 = null;
        pathExpState4.joins = joins9;
        org.apache.openjpa.jdbc.schema.Column column11 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray12 = new org.apache.openjpa.jdbc.schema.Column[] { column11 };
        pathExpState4.cols = columnArray12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = pathExpState4.cmpfield;
        org.apache.openjpa.jdbc.sql.Joins joins15 = null;
        pathExpState4.joins = joins15;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = null;
        pathExpState4.cmpfield = fieldMapping17;
        org.apache.openjpa.jdbc.sql.Result result19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = pCPath1.load(expContext2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, result19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"store\" because \"ctx\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray12);
        org.junit.Assert.assertArrayEquals(columnArray12, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping14);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1067");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.field = fieldMapping12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pathExpState5.cols;
        org.apache.openjpa.jdbc.sql.Joins joins17 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState19 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins18);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping20 = null;
        pathExpState19.field = fieldMapping20;
        org.apache.openjpa.jdbc.schema.Column[] columnArray22 = null;
        pathExpState19.cols = columnArray22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        pathExpState19.joins = joins24;
        org.apache.openjpa.jdbc.schema.Column column26 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray27 = new org.apache.openjpa.jdbc.schema.Column[] { column26 };
        pathExpState19.cols = columnArray27;
        pathExpState5.cols = columnArray27;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping30 = null;
        pathExpState5.field = fieldMapping30;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray16);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertNotNull(columnArray27);
        org.junit.Assert.assertArrayEquals(columnArray27, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1068");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState1.joins = joins6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = pathExpState1.cols;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = pathExpState1.cols;
        org.apache.openjpa.jdbc.schema.Column[] columnArray10 = pathExpState1.cols;
        boolean boolean11 = pathExpState1.joinedRel;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState13 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins12);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState13.field = fieldMapping14;
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = null;
        pathExpState13.cols = columnArray16;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        pathExpState13.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState21 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins20);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping22 = null;
        pathExpState21.field = fieldMapping22;
        org.apache.openjpa.jdbc.schema.Column[] columnArray24 = null;
        pathExpState21.cols = columnArray24;
        org.apache.openjpa.jdbc.sql.Joins joins26 = null;
        pathExpState21.joins = joins26;
        org.apache.openjpa.jdbc.schema.Column column28 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray29 = new org.apache.openjpa.jdbc.schema.Column[] { column28 };
        pathExpState21.cols = columnArray29;
        org.apache.openjpa.jdbc.sql.Joins joins31 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState32 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins31);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping33 = null;
        pathExpState32.field = fieldMapping33;
        org.apache.openjpa.jdbc.schema.Column column35 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray36 = new org.apache.openjpa.jdbc.schema.Column[] { column35 };
        pathExpState32.cols = columnArray36;
        pathExpState21.cols = columnArray36;
        pathExpState13.cols = columnArray36;
        pathExpState1.cols = columnArray36;
        org.junit.Assert.assertNull(columnArray8);
        org.junit.Assert.assertNull(columnArray9);
        org.junit.Assert.assertNull(columnArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(columnArray29);
        org.junit.Assert.assertArrayEquals(columnArray29, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray36);
        org.junit.Assert.assertArrayEquals(columnArray36, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1069");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.cmpfield = fieldMapping2;
        org.apache.openjpa.jdbc.sql.Joins joins4 = pathExpState1.joins;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        pathExpState1.cmpfield = fieldMapping5;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping7 = pathExpState1.field;
        org.apache.openjpa.jdbc.sql.Joins joins8 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState9 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins8);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState9.field = fieldMapping10;
        org.apache.openjpa.jdbc.schema.Column[] columnArray12 = null;
        pathExpState9.cols = columnArray12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState9.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = null;
        pathExpState9.field = fieldMapping16;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping18 = null;
        pathExpState9.cmpfield = fieldMapping18;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping20 = pathExpState9.cmpfield;
        pathExpState9.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins23 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState24 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins23);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping25 = null;
        pathExpState24.field = fieldMapping25;
        org.apache.openjpa.jdbc.schema.Column[] columnArray27 = null;
        pathExpState24.cols = columnArray27;
        org.apache.openjpa.jdbc.sql.Joins joins29 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState30 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins29);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping31 = null;
        pathExpState30.field = fieldMapping31;
        org.apache.openjpa.jdbc.schema.Column column33 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray34 = new org.apache.openjpa.jdbc.schema.Column[] { column33 };
        pathExpState30.cols = columnArray34;
        pathExpState24.cols = columnArray34;
        pathExpState24.isEmbedElementColl = false;
        pathExpState24.joinedRel = false;
        pathExpState24.joinedRel = true;
        org.apache.openjpa.jdbc.schema.Column[] columnArray43 = pathExpState24.cols;
        pathExpState9.cols = columnArray43;
        pathExpState1.cols = columnArray43;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping46 = null;
        pathExpState1.field = fieldMapping46;
        org.junit.Assert.assertNull(joins4);
        org.junit.Assert.assertNull(fieldMapping7);
        org.junit.Assert.assertNull(fieldMapping20);
        org.junit.Assert.assertNotNull(columnArray34);
        org.junit.Assert.assertArrayEquals(columnArray34, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray43);
        org.junit.Assert.assertArrayEquals(columnArray43, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1070");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.schema.Column column12 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray13 = new org.apache.openjpa.jdbc.schema.Column[] { column12 };
        pathExpState5.cols = columnArray13;
        pathExpState5.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState18 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins17);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping19 = null;
        pathExpState18.field = fieldMapping19;
        org.apache.openjpa.jdbc.schema.Column[] columnArray21 = null;
        pathExpState18.cols = columnArray21;
        org.apache.openjpa.jdbc.sql.Joins joins23 = null;
        pathExpState18.joins = joins23;
        org.apache.openjpa.jdbc.schema.Column[] columnArray25 = pathExpState18.cols;
        org.apache.openjpa.jdbc.schema.Column[] columnArray26 = pathExpState18.cols;
        org.apache.openjpa.jdbc.sql.Joins joins27 = pathExpState18.joins;
        boolean boolean28 = pathExpState18.isEmbedElementColl;
        org.apache.openjpa.jdbc.sql.Joins joins29 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState30 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins29);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping31 = null;
        pathExpState30.cmpfield = fieldMapping31;
        org.apache.openjpa.jdbc.schema.Column[] columnArray33 = pathExpState30.cols;
        org.apache.openjpa.jdbc.sql.Joins joins34 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState35 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins34);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping36 = null;
        pathExpState35.field = fieldMapping36;
        org.apache.openjpa.jdbc.schema.Column[] columnArray38 = null;
        pathExpState35.cols = columnArray38;
        org.apache.openjpa.jdbc.sql.Joins joins40 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState41 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins40);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping42 = null;
        pathExpState41.field = fieldMapping42;
        org.apache.openjpa.jdbc.schema.Column column44 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray45 = new org.apache.openjpa.jdbc.schema.Column[] { column44 };
        pathExpState41.cols = columnArray45;
        pathExpState35.cols = columnArray45;
        org.apache.openjpa.jdbc.schema.Column[] columnArray48 = pathExpState35.cols;
        pathExpState30.cols = columnArray48;
        org.apache.openjpa.jdbc.schema.Column[] columnArray50 = pathExpState30.cols;
        pathExpState18.cols = columnArray50;
        pathExpState5.cols = columnArray50;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer53 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray13);
        org.junit.Assert.assertArrayEquals(columnArray13, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(columnArray25);
        org.junit.Assert.assertNull(columnArray26);
        org.junit.Assert.assertNull(joins27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(columnArray33);
        org.junit.Assert.assertNotNull(columnArray45);
        org.junit.Assert.assertArrayEquals(columnArray45, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray48);
        org.junit.Assert.assertArrayEquals(columnArray48, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray50);
        org.junit.Assert.assertArrayEquals(columnArray50, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1071");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState1.cmpfield = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState1.field = fieldMapping8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState1.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = pathExpState1.cmpfield;
        pathExpState1.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping15 = null;
        pathExpState1.cmpfield = fieldMapping15;
        org.junit.Assert.assertNull(fieldMapping12);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1072");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState11 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins10);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState11.field = fieldMapping12;
        org.apache.openjpa.jdbc.schema.Column column14 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] { column14 };
        pathExpState11.cols = columnArray15;
        pathExpState5.cols = columnArray15;
        org.apache.openjpa.jdbc.sql.Joins joins18 = pathExpState5.joins;
        org.apache.openjpa.jdbc.schema.Column[] columnArray19 = pathExpState5.cols;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer20, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertNotNull(columnArray19);
        org.junit.Assert.assertArrayEquals(columnArray19, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1073");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column column8 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] { column8 };
        pathExpState5.cols = columnArray9;
        boolean boolean11 = pathExpState5.joinedRel;
        pathExpState5.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.field = fieldMapping14;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = null;
        pathExpState5.field = fieldMapping16;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1074");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pathExpState5.cmpfield;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = pathExpState5.cols;
        boolean boolean10 = pathExpState5.isEmbedElementColl;
        org.apache.openjpa.jdbc.sql.Joins joins11 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState12 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins11);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = null;
        pathExpState12.field = fieldMapping13;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = null;
        pathExpState12.cols = columnArray15;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = null;
        pathExpState12.cmpfield = fieldMapping17;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping19 = null;
        pathExpState12.field = fieldMapping19;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping21 = null;
        pathExpState12.cmpfield = fieldMapping21;
        org.apache.openjpa.jdbc.schema.Column[] columnArray23 = pathExpState12.cols;
        pathExpState12.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins26 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState27 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins26);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping28 = null;
        pathExpState27.field = fieldMapping28;
        org.apache.openjpa.jdbc.schema.Column[] columnArray30 = null;
        pathExpState27.cols = columnArray30;
        org.apache.openjpa.jdbc.sql.Joins joins32 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState33 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins32);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping34 = null;
        pathExpState33.field = fieldMapping34;
        org.apache.openjpa.jdbc.schema.Column column36 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray37 = new org.apache.openjpa.jdbc.schema.Column[] { column36 };
        pathExpState33.cols = columnArray37;
        pathExpState27.cols = columnArray37;
        org.apache.openjpa.jdbc.schema.Column[] columnArray40 = pathExpState27.cols;
        pathExpState12.cols = columnArray40;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping42 = pathExpState12.field;
        org.apache.openjpa.jdbc.sql.Joins joins43 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState44 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins43);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping45 = null;
        pathExpState44.field = fieldMapping45;
        org.apache.openjpa.jdbc.schema.Column[] columnArray47 = null;
        pathExpState44.cols = columnArray47;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping49 = null;
        pathExpState44.cmpfield = fieldMapping49;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping51 = null;
        pathExpState44.field = fieldMapping51;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping53 = null;
        pathExpState44.cmpfield = fieldMapping53;
        org.apache.openjpa.jdbc.schema.Column[] columnArray55 = pathExpState44.cols;
        pathExpState44.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins58 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState59 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins58);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping60 = null;
        pathExpState59.field = fieldMapping60;
        org.apache.openjpa.jdbc.schema.Column[] columnArray62 = null;
        pathExpState59.cols = columnArray62;
        org.apache.openjpa.jdbc.sql.Joins joins64 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState65 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins64);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping66 = null;
        pathExpState65.field = fieldMapping66;
        org.apache.openjpa.jdbc.schema.Column column68 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray69 = new org.apache.openjpa.jdbc.schema.Column[] { column68 };
        pathExpState65.cols = columnArray69;
        pathExpState59.cols = columnArray69;
        org.apache.openjpa.jdbc.schema.Column[] columnArray72 = pathExpState59.cols;
        pathExpState44.cols = columnArray72;
        pathExpState12.cols = columnArray72;
        pathExpState5.cols = columnArray72;
        pathExpState5.joinedRel = true;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping78 = pathExpState5.cmpfield;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping8);
        org.junit.Assert.assertNull(columnArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(columnArray23);
        org.junit.Assert.assertNotNull(columnArray37);
        org.junit.Assert.assertArrayEquals(columnArray37, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray40);
        org.junit.Assert.assertArrayEquals(columnArray40, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping42);
        org.junit.Assert.assertNull(columnArray55);
        org.junit.Assert.assertNotNull(columnArray69);
        org.junit.Assert.assertArrayEquals(columnArray69, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray72);
        org.junit.Assert.assertArrayEquals(columnArray72, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping78);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1075");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.cmpfield = fieldMapping6;
        org.apache.openjpa.jdbc.sql.Joins joins8 = pathExpState5.joins;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = pathExpState5.cols;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = pathExpState5.field;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(joins8);
        org.junit.Assert.assertNull(columnArray9);
        org.junit.Assert.assertNull(fieldMapping10);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1076");
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1077");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column column8 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] { column8 };
        pathExpState5.cols = columnArray9;
        boolean boolean11 = pathExpState5.joinedRel;
        pathExpState5.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.schema.Column[] columnArray14 = pathExpState5.cols;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] {};
        pathExpState5.cols = columnArray15;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendType(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getMappedPCSuperclassMapping()\" because \"sup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(columnArray14);
        org.junit.Assert.assertArrayEquals(columnArray14, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] {});
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1078");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState11 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins10);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState11.field = fieldMapping12;
        org.apache.openjpa.jdbc.schema.Column column14 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] { column14 };
        pathExpState11.cols = columnArray15;
        pathExpState5.cols = columnArray15;
        pathExpState5.isEmbedElementColl = false;
        boolean boolean20 = pathExpState5.joinedRel;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIndex(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1079");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.field = fieldMapping12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = pathExpState5.cmpfield;
        pathExpState5.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.schema.Column[] columnArray19 = pathExpState5.cols;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping16);
        org.junit.Assert.assertNull(columnArray19);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1080");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState7 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins6);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState7.field = fieldMapping8;
        org.apache.openjpa.jdbc.schema.Column column10 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray11 = new org.apache.openjpa.jdbc.schema.Column[] { column10 };
        pathExpState7.cols = columnArray11;
        pathExpState1.cols = columnArray11;
        org.apache.openjpa.jdbc.schema.Column[] columnArray14 = pathExpState1.cols;
        boolean boolean15 = pathExpState1.isEmbedElementColl;
        boolean boolean16 = pathExpState1.isEmbedElementColl;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = pathExpState1.field;
        org.junit.Assert.assertNotNull(columnArray11);
        org.junit.Assert.assertArrayEquals(columnArray11, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray14);
        org.junit.Assert.assertArrayEquals(columnArray14, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(fieldMapping17);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1081");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.schema.Column column12 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray13 = new org.apache.openjpa.jdbc.schema.Column[] { column12 };
        pathExpState5.cols = columnArray13;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] {};
        pathExpState5.cols = columnArray15;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = pathExpState5.field;
        boolean boolean18 = pathExpState5.isEmbedElementColl;
        boolean boolean19 = pathExpState5.joinedRel;
        org.apache.openjpa.jdbc.schema.Column[] columnArray20 = pathExpState5.cols;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsEmpty(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray13);
        org.junit.Assert.assertArrayEquals(columnArray13, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertNull(fieldMapping17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(columnArray20);
        org.junit.Assert.assertArrayEquals(columnArray20, new org.apache.openjpa.jdbc.schema.Column[] {});
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1082");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState1.joins = joins6;
        pathExpState1.isEmbedElementColl = true;
        pathExpState1.joinedRel = false;
        java.lang.Class<?> wildcardClass12 = pathExpState1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1083");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = pathExpState1.cmpfield;
        boolean boolean5 = pathExpState1.joinedRel;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState7 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins6);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState7.field = fieldMapping8;
        org.apache.openjpa.jdbc.schema.Column[] columnArray10 = null;
        pathExpState7.cols = columnArray10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        pathExpState7.joins = joins12;
        org.apache.openjpa.jdbc.schema.Column column14 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] { column14 };
        pathExpState7.cols = columnArray15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState18 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins17);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping19 = null;
        pathExpState18.field = fieldMapping19;
        org.apache.openjpa.jdbc.schema.Column column21 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray22 = new org.apache.openjpa.jdbc.schema.Column[] { column21 };
        pathExpState18.cols = columnArray22;
        pathExpState7.cols = columnArray22;
        pathExpState1.cols = columnArray22;
        pathExpState1.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping28 = null;
        pathExpState1.cmpfield = fieldMapping28;
        org.apache.openjpa.jdbc.sql.Joins joins30 = pathExpState1.joins;
        org.junit.Assert.assertNull(fieldMapping4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray22);
        org.junit.Assert.assertArrayEquals(columnArray22, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(joins30);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1084");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pathExpState5.cmpfield;
        boolean boolean9 = pathExpState5.joinedRel;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1085");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column column4 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray5 = new org.apache.openjpa.jdbc.schema.Column[] { column4 };
        pathExpState1.cols = columnArray5;
        boolean boolean7 = pathExpState1.joinedRel;
        pathExpState1.isEmbedElementColl = false;
        boolean boolean10 = pathExpState1.joinedRel;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = pathExpState1.cmpfield;
        pathExpState1.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.sql.Joins joins14 = pathExpState1.joins;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping15 = null;
        pathExpState1.cmpfield = fieldMapping15;
        boolean boolean17 = pathExpState1.isEmbedElementColl;
        org.junit.Assert.assertNotNull(columnArray5);
        org.junit.Assert.assertArrayEquals(columnArray5, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(fieldMapping11);
        org.junit.Assert.assertNull(joins14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1086");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState5.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        pathExpState5.field = fieldMapping12;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        pathExpState5.cmpfield = fieldMapping14;
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pathExpState5.cols;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = pathExpState5.cmpfield;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping18 = null;
        pathExpState5.field = fieldMapping18;
        boolean boolean20 = pathExpState5.joinedRel;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendSize(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray16);
        org.junit.Assert.assertNull(fieldMapping17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1087");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pathExpState5.cmpfield;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = pathExpState5.cols;
        boolean boolean10 = pathExpState5.isEmbedElementColl;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = pathExpState5.field;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        pathExpState5.joins = joins12;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.groupBy(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.outer(org.apache.openjpa.jdbc.sql.Joins)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping8);
        org.junit.Assert.assertNull(columnArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(fieldMapping11);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1088");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.sql.Joins joins3 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState4 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins3);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        pathExpState4.field = fieldMapping5;
        org.apache.openjpa.jdbc.schema.Column[] columnArray7 = null;
        pathExpState4.cols = columnArray7;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = null;
        pathExpState4.cmpfield = fieldMapping9;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = null;
        pathExpState4.field = fieldMapping11;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = null;
        pathExpState4.cmpfield = fieldMapping13;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = pathExpState4.cols;
        pathExpState4.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.sql.Joins joins18 = pathExpState4.joins;
        pathExpState4.joinedRel = true;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping21 = null;
        pathExpState4.cmpfield = fieldMapping21;
        org.apache.openjpa.jdbc.sql.Joins joins23 = null;
        pathExpState4.joins = joins23;
        boolean boolean25 = pathExpState4.joinedRel;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping26 = pathExpState4.field;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer27 = null;
        org.apache.openjpa.jdbc.schema.Column column28 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState4, sQLBuffer27, column28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getIdentifier()\" because \"col\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(columnArray15);
        org.junit.Assert.assertNull(joins18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(fieldMapping26);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1089");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = pathExpState1.cmpfield;
        boolean boolean5 = pathExpState1.joinedRel;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState7 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins6);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState7.field = fieldMapping8;
        org.apache.openjpa.jdbc.schema.Column[] columnArray10 = null;
        pathExpState7.cols = columnArray10;
        org.apache.openjpa.jdbc.sql.Joins joins12 = null;
        pathExpState7.joins = joins12;
        org.apache.openjpa.jdbc.schema.Column column14 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] { column14 };
        pathExpState7.cols = columnArray15;
        org.apache.openjpa.jdbc.sql.Joins joins17 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState18 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins17);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping19 = null;
        pathExpState18.field = fieldMapping19;
        org.apache.openjpa.jdbc.schema.Column column21 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray22 = new org.apache.openjpa.jdbc.schema.Column[] { column21 };
        pathExpState18.cols = columnArray22;
        pathExpState7.cols = columnArray22;
        pathExpState1.cols = columnArray22;
        pathExpState1.isEmbedElementColl = true;
        pathExpState1.joinedRel = false;
        org.junit.Assert.assertNull(fieldMapping4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray22);
        org.junit.Assert.assertArrayEquals(columnArray22, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1090");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.cmpfield = fieldMapping6;
        pathExpState5.joinedRel = false;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.select(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1091");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = pathExpState5.cmpfield;
        boolean boolean9 = pathExpState5.joinedRel;
        boolean boolean10 = pathExpState5.joinedRel;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = null;
        pathExpState5.cmpfield = fieldMapping11;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendTo(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer13, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 21 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1092");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        pathExpState1.joins = joins6;
        pathExpState1.joinedRel = false;
        pathExpState1.isEmbedElementColl = true;
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1093");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.sql.Joins joins6 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState7 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins6);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState7.field = fieldMapping8;
        org.apache.openjpa.jdbc.schema.Column column10 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray11 = new org.apache.openjpa.jdbc.schema.Column[] { column10 };
        pathExpState7.cols = columnArray11;
        pathExpState1.cols = columnArray11;
        pathExpState1.isEmbedElementColl = false;
        pathExpState1.joinedRel = false;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        pathExpState1.joins = joins18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState21 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins20);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping22 = null;
        pathExpState21.field = fieldMapping22;
        org.apache.openjpa.jdbc.schema.Column[] columnArray24 = null;
        pathExpState21.cols = columnArray24;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping26 = null;
        pathExpState21.cmpfield = fieldMapping26;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping28 = null;
        pathExpState21.field = fieldMapping28;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping30 = null;
        pathExpState21.cmpfield = fieldMapping30;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping32 = pathExpState21.cmpfield;
        pathExpState21.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.schema.Column[] columnArray35 = pathExpState21.cols;
        org.apache.openjpa.jdbc.sql.Joins joins36 = null;
        pathExpState21.joins = joins36;
        org.apache.openjpa.jdbc.sql.Joins joins38 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState39 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins38);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping40 = null;
        pathExpState39.field = fieldMapping40;
        org.apache.openjpa.jdbc.schema.Column column42 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray43 = new org.apache.openjpa.jdbc.schema.Column[] { column42 };
        pathExpState39.cols = columnArray43;
        boolean boolean45 = pathExpState39.joinedRel;
        pathExpState39.isEmbedElementColl = false;
        boolean boolean48 = pathExpState39.joinedRel;
        org.apache.openjpa.jdbc.schema.Column[] columnArray49 = pathExpState39.cols;
        org.apache.openjpa.jdbc.schema.Column[] columnArray50 = pathExpState39.cols;
        pathExpState21.cols = columnArray50;
        pathExpState1.cols = columnArray50;
        pathExpState1.joinedRel = true;
        org.junit.Assert.assertNotNull(columnArray11);
        org.junit.Assert.assertArrayEquals(columnArray11, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping32);
        org.junit.Assert.assertNull(columnArray35);
        org.junit.Assert.assertNotNull(columnArray43);
        org.junit.Assert.assertArrayEquals(columnArray43, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(columnArray49);
        org.junit.Assert.assertArrayEquals(columnArray49, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray50);
        org.junit.Assert.assertArrayEquals(columnArray50, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1094");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        pathExpState1.joinedRel = true;
        pathExpState1.joinedRel = false;
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1095");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState1.cmpfield = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState1.field = fieldMapping8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState1.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = pathExpState1.cmpfield;
        pathExpState1.isEmbedElementColl = true;
        pathExpState1.isEmbedElementColl = false;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping17 = null;
        pathExpState1.field = fieldMapping17;
        org.junit.Assert.assertNull(fieldMapping12);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1096");
        org.apache.openjpa.jdbc.sql.Joins joins0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        pathExpState1.field = fieldMapping2;
        org.apache.openjpa.jdbc.schema.Column[] columnArray4 = null;
        pathExpState1.cols = columnArray4;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState1.cmpfield = fieldMapping6;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        pathExpState1.field = fieldMapping8;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        pathExpState1.cmpfield = fieldMapping10;
        org.apache.openjpa.jdbc.schema.Column[] columnArray12 = pathExpState1.cols;
        org.apache.openjpa.jdbc.sql.Joins joins13 = pathExpState1.joins;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState15 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins14);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = null;
        pathExpState15.field = fieldMapping16;
        org.apache.openjpa.jdbc.schema.Column[] columnArray18 = null;
        pathExpState15.cols = columnArray18;
        org.apache.openjpa.jdbc.sql.Joins joins20 = null;
        pathExpState15.joins = joins20;
        org.apache.openjpa.jdbc.schema.Column column22 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray23 = new org.apache.openjpa.jdbc.schema.Column[] { column22 };
        pathExpState15.cols = columnArray23;
        pathExpState1.cols = columnArray23;
        java.lang.Class<?> wildcardClass26 = pathExpState1.getClass();
        org.junit.Assert.assertNull(columnArray12);
        org.junit.Assert.assertNull(joins13);
        org.junit.Assert.assertNotNull(columnArray23);
        org.junit.Assert.assertArrayEquals(columnArray23, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1097");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column[] columnArray8 = null;
        pathExpState5.cols = columnArray8;
        org.apache.openjpa.jdbc.sql.Joins joins10 = null;
        pathExpState5.joins = joins10;
        org.apache.openjpa.jdbc.schema.Column column12 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray13 = new org.apache.openjpa.jdbc.schema.Column[] { column12 };
        pathExpState5.cols = columnArray13;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] {};
        pathExpState5.cols = columnArray15;
        pathExpState5.isEmbedElementColl = false;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.selectColumns(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.Select.setSchemaAlias(String)\" because \"sel\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray13);
        org.junit.Assert.assertArrayEquals(columnArray13, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] {});
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1098");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpState expState4 = null;
        org.apache.openjpa.jdbc.sql.Joins joins5 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState6 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins5);
        pathExpState6.joinedRel = true;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = null;
        pathExpState6.field = fieldMapping9;
        pathExpState6.isEmbedElementColl = true;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = pathExpState6.cmpfield;
        org.apache.openjpa.jdbc.sql.Joins joins14 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState15 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins14);
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = pathExpState15.cols;
        boolean boolean17 = pathExpState15.joinedRel;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState19 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins18);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping20 = null;
        pathExpState19.field = fieldMapping20;
        org.apache.openjpa.jdbc.schema.Column[] columnArray22 = null;
        pathExpState19.cols = columnArray22;
        org.apache.openjpa.jdbc.sql.Joins joins24 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState25 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins24);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping26 = null;
        pathExpState25.field = fieldMapping26;
        org.apache.openjpa.jdbc.schema.Column column28 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray29 = new org.apache.openjpa.jdbc.schema.Column[] { column28 };
        pathExpState25.cols = columnArray29;
        pathExpState19.cols = columnArray29;
        pathExpState19.isEmbedElementColl = false;
        pathExpState19.joinedRel = false;
        pathExpState19.joinedRel = true;
        org.apache.openjpa.jdbc.schema.Column[] columnArray38 = pathExpState19.cols;
        pathExpState15.cols = columnArray38;
        pathExpState6.cols = columnArray38;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = pCPath1.toDataStoreValue(select2, expContext3, expState4, (java.lang.Object) columnArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"cmpfield\" because \"pstate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fieldMapping13);
        org.junit.Assert.assertNull(columnArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(columnArray29);
        org.junit.Assert.assertArrayEquals(columnArray29, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNotNull(columnArray38);
        org.junit.Assert.assertArrayEquals(columnArray38, new org.apache.openjpa.jdbc.schema.Column[] { null });
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1099");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column column8 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] { column8 };
        pathExpState5.cols = columnArray9;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = pathExpState5.field;
        boolean boolean12 = pathExpState5.isEmbedElementColl;
        org.apache.openjpa.jdbc.sql.SQLBuffer sQLBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pCPath1.appendIsNotNull(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, sQLBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.sql.SQLBuffer.append(String)\" because \"sql\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.openjpa.jdbc.kernel.exps.PCPathRandoopTest2.test1100");
        org.apache.openjpa.jdbc.meta.ClassMapping classMapping0 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath pCPath1 = new org.apache.openjpa.jdbc.kernel.exps.PCPath(classMapping0);
        org.apache.openjpa.jdbc.sql.Select select2 = null;
        org.apache.openjpa.jdbc.kernel.exps.ExpContext expContext3 = null;
        org.apache.openjpa.jdbc.sql.Joins joins4 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState5 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        pathExpState5.field = fieldMapping6;
        org.apache.openjpa.jdbc.schema.Column column8 = null;
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] { column8 };
        pathExpState5.cols = columnArray9;
        boolean boolean11 = pathExpState5.joinedRel;
        pathExpState5.isEmbedElementColl = false;
        boolean boolean14 = pathExpState5.joinedRel;
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = pathExpState5.cols;
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = pathExpState5.field;
        org.apache.openjpa.jdbc.sql.Joins joins17 = pathExpState5.joins;
        org.apache.openjpa.jdbc.sql.Joins joins18 = null;
        org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState pathExpState19 = new org.apache.openjpa.jdbc.kernel.exps.PCPath.PathExpState(joins18);
        boolean boolean20 = pathExpState19.isEmbedElementColl;
        org.apache.openjpa.jdbc.sql.Joins joins21 = null;
        pathExpState19.joins = joins21;
        java.lang.Class<?> wildcardClass23 = pathExpState19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = pCPath1.toDataStoreValue(select2, expContext3, (org.apache.openjpa.jdbc.kernel.exps.ExpState) pathExpState5, (java.lang.Object) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.ClassMapping.getPrimaryKeyColumns()\" because \"this._class\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] { null });
        org.junit.Assert.assertNull(fieldMapping16);
        org.junit.Assert.assertNull(joins17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }
}

