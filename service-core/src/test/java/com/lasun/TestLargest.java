package com.lasun;

import junit.framework.TestCase;

/**
 * Created by lasune40 on 2014/7/17 0017.
 */
public class TestLargest extends TestCase {

    public TestLargest(String name) {
        super(name);
    }

    public void testSimple() throws Exception {
        assertEquals(9, Largest.largest(new int[]{7, 8, 9}));
    }

    public void testOrder() throws Exception {
        assertEquals(9, Largest.largest(new int[]{9, 8, 7}));
    }

    public void testDups() throws Exception {
        assertEquals(9, Largest.largest(new int[]{9, 7, 9, 8}));
    }

    public void testOne() throws Exception {
        assertEquals(1, Largest.largest(new int[]{1}));
    }

    public void testNegative() throws Exception {
        int[] negList = new int[]{-9, -8, -7};
        assertEquals(-7, Largest.largest(negList));
    }

    public void testEmpty() throws Exception {
        try {
            Largest.largest(new int[]{});
            fail(" *Should have thrown an exception");
        }catch (RuntimeException e){
            assertTrue(true);
        }
    }
}
