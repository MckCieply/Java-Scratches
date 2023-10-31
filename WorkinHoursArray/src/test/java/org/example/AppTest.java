package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     */
    public void testSolution1()
    {
        int[] hours = {0,1,2,3,4};
        int target = 2;
        int expected = 3;
        Solution solution = new Solution();
        int actual = solution.numberOfEmployeesWhoMetTarget(hours, target);
        assertEquals(expected, actual);

    }

    public void testSolution2()
    {
        int[] hours = {5,1,2,3,4};
        int target = 6;
        int expected = 0;
        Solution solution = new Solution();
        int actual = solution.numberOfEmployeesWhoMetTarget(hours, target);
        assertEquals(expected, actual);

    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
