package com.mckcieply;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testArrayListFlipperInteger() {
        ArrayFlipper arrayFlipper = new ArrayFlipper();
        ArrayList<Integer> testArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(6, 5, 4, 3, 2, 1));
        assertEquals(expected, arrayFlipper.flipArrayList(testArray));

    }

    public void testArrayListFlipperString() {
        ArrayFlipper arrayFlipper = new ArrayFlipper();
        ArrayList<String> testArray = new ArrayList<>(Arrays.asList("Tom", "John", "Bob", "Alice", "Kate", "Mary"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Mary", "Kate", "Alice", "Bob", "John", "Tom"));
        assertEquals(expected, arrayFlipper.flipArrayList(testArray));
    }

    public void testArrayListFlipperDouble() {
        ArrayFlipper arrayFlipper = new ArrayFlipper();
        ArrayList<Double> testArray = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5, 6.6));
        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(6.6, 5.5, 4.4, 3.3, 2.2, 1.1));
        assertEquals(expected, arrayFlipper.flipArrayList(testArray));
    }

    public void testArrayFlipperInteger(){
        ArrayFlipper arrayFlipper = new ArrayFlipper();
        int[] testArray = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 5, 4, 3, 2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(arrayFlipper.flipArrayInteger(testArray)));
    }
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
