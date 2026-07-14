package org.apache.openjpa.jdbc.kernel.exps;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.openjpa.jdbc.meta.ClassMapping;
import org.apache.openjpa.meta.FieldMetaData;
import org.apache.openjpa.meta.JavaTypes;
import org.apache.openjpa.meta.ValueMetaData;
import org.junit.Before;
import org.junit.Test;

public class PCPathWBTest {

    private PCPath path;
    private ClassMapping rootClassMapping;

    @Before
    public void setUp() {
        rootClassMapping = mock(ClassMapping.class);
        path = new PCPath(rootClassMapping);
    }

    @Test
    public void testGetType_WB1() {
        FieldMetaData collectionField = mock(FieldMetaData.class);
        when(collectionField.getDeclaringMetaData()).thenReturn(rootClassMapping);
        // Diciamo allo switch che questo campo è una COLLECTION
        when(collectionField.getDeclaredTypeCode()).thenReturn(JavaTypes.COLLECTION);

        ValueMetaData elementMeta = mock(ValueMetaData.class);
        when(collectionField.getElement()).thenReturn(elementMeta);
        when(elementMeta.getDeclaredType()).thenReturn((Class) String.class);

        path.get(collectionField, true);
        assertEquals("Per le collezioni, il SUT deve restituire il tipo dell'elemento", String.class, path.getType());
    }

    @Test
    public void testGetType_WB2() {
        FieldMetaData mapField = mock(FieldMetaData.class);
        when(mapField.getDeclaringMetaData()).thenReturn(rootClassMapping);
        // Diciamo allo switch che questo campo è una MAP
        when(mapField.getDeclaredTypeCode()).thenReturn(JavaTypes.MAP);

        ValueMetaData valueMeta = mock(ValueMetaData.class);
        when(mapField.getElement()).thenReturn(valueMeta);
        when(valueMeta.getDeclaredType()).thenReturn((Class) Double.class);

        path.get(mapField, true);
        assertEquals("Per le mappe, deve restituire il tipo del valore", Double.class, path.getType());
    }

    @Test
    public void testGetType_WB3() {
        FieldMetaData arrayField = mock(FieldMetaData.class);
        when(arrayField.getDeclaringMetaData()).thenReturn(rootClassMapping);
        // Diciamo allo switch che questo campo è un ARRAY
        when(arrayField.getDeclaredTypeCode()).thenReturn(JavaTypes.ARRAY);
        when(arrayField.getDeclaredType()).thenReturn((Class) byte[].class);

        path.get(arrayField, true);
        assertEquals("Per array primitivi (byte[]), deve restituire il tipo dell'array", byte[].class, path.getType());
    }

    @Test
    public void testGetType_WB4() {
        FieldMetaData arrayField = mock(FieldMetaData.class);
        when(arrayField.getDeclaringMetaData()).thenReturn(rootClassMapping);
        when(arrayField.getDeclaredTypeCode()).thenReturn(JavaTypes.ARRAY);
        when(arrayField.getDeclaredType()).thenReturn((Class) String[].class);

        ValueMetaData elementMeta = mock(ValueMetaData.class);
        when(arrayField.getElement()).thenReturn(elementMeta);
        when(elementMeta.getDeclaredType()).thenReturn((Class) String.class);

        path.get(arrayField, true);
        assertEquals("Per array di oggetti (String[]), deve restituire il tipo dell'elemento base", String.class, path.getType());
    }
}
