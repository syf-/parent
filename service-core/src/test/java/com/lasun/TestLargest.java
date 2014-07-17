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
}
