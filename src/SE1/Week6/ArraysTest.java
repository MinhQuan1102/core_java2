package SE1.Week6;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysTest {

    @Test
    public void testCountNegative() {
        var array = new Arrays();
        int[][] testCountNegative1 = {{1, 2, 3, -4, 5},{1, 2, 3, 4, 5}, {0, 1, 2, 3, -4, 5}, {-2, -1, 0, 1, 2}, {}};
        int [] expectedResult = {1, 0 , 1, 2, 0};
        for(int i = 0; i < testCountNegative1.length;i++) {
            assertEquals(expectedResult[i], array.countNegative(testCountNegative1[i]));
        }
    }

    @Test
    public void testMin() {
        var array = new Arrays();
        int[] testMin1 = {1, 2, 3, -4, 5};
        int[] testMin2 = {1, 2, 3, 4, 5};
        int[] testMin3 = {0, 1, 2, 3, 4, -5};
        int[] testMin4 = {-2, -1, 0, 1, 2};
        int[] testMin5 = {};
        assertEquals(-4, array.min(testMin1));
        assertEquals(1, array.min(testMin2));
        assertEquals(-5, array.min(testMin3));
        assertEquals(-2, array.min(testMin4));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            array.min(testMin5);
        });

    }

    @Test
    public void testIsAscSorted() {
        var array = new Arrays();
        int[] testIsAscSorted1 = {1, 2, 3, -4, 5};
        int[] testIsAscSorted2 = {1, 2, 3, 4, 5};
        int[] testIsAscSorted3 = {0, 1, 2, 3, 4, -5};
        int[] testIsAscSorted4 = {-2, -1, 0, 1, 2};
        int[] testIsAscSorted5 = {5, 4, 3, 2, 1};
        int[] testIsAscSorted6 = {};
        assertEquals(false, array.isAscSorted(testIsAscSorted1));
        assertEquals(true, array.isAscSorted(testIsAscSorted2));
        assertEquals(false, array.isAscSorted(testIsAscSorted3));
        assertEquals(true, array.isAscSorted(testIsAscSorted4));
        assertEquals(false, array.isAscSorted(testIsAscSorted5));
        assertEquals(false, array.isAscSorted(testIsAscSorted6));
    }

    @Test
    public void length() {
        var array = new Arrays();
        char[] testLength1 = {};
        char[] testLength2 = {'a', 'b', 'c'};
        char[] testLength3 = {'a', '\u0000' ,'c'};
        assertEquals(0, array.length(testLength1));
        assertEquals(3, array.length(testLength2));
        assertEquals(1, array.length(testLength3));
    }

    @Test
    public void testMedian() {
        var array = new Arrays();
        double[] testMedian1 = {};
        double[] testMedian2 = {1.0, 1.0, 2.0, 3.0, 4.0, 5.0};
        double[] testMedian3 = {1.2, 2.4, 3.6, 4.8, 5.5};
        double[] testMedian4 = {1.5, 2.3, 3.7, 4.1, 5.9, 6.0};
        double[] testMedian5 = {-1.0, 2.4, -3.2, 4.6, -5.7};
        assertEquals(0.0, array.median(testMedian1), 0.0);
//        assertThrows(Exception.class, () -> {
//            array.median(testMedian2);
//        });
        assertEquals(3.6, array.median(testMedian3), 0.0);
        assertEquals(3.7, array.median(testMedian4), 0.0);
        assertEquals(-1.0, array.median(testMedian5), 0.0);
    }

    @Test
    public void testCompare() {
        var array = new Arrays();
        double[] emptyArray = {};
        double[] array123 = {1, 2, 3};
        double[] array456 = {4, 5, 6};
        double[] array12 = {1, 2};
        double[] array12345 = {1, 2, 3, 4, 5};
        double[] array234 = {2, 3, 4};
        assertEquals(0, array.compare(emptyArray, emptyArray));
        assertEquals(-2, array.compare(array123, array456));
        assertEquals(-1, array.compare(array12, array12345));
        assertEquals(0, array.compare(array123, array123));
        assertEquals(1, array.compare(array12345, array123));
        assertEquals(2, array.compare(array123, array234));
    }

    @Test
    public void freq() {
    }

}