package com.lasun;

import junit.framework.TestCase;

/**
 * Created by lasune40 on 2014/7/18 0018.
 */
public class TestClassOne extends TestCase {

    public TestClassOne(String method){
        super(method);
    }

    public void testAddition(){
        assertEquals(4, 2+2);
    }

    public void testSubtraction(){
        assertEquals(0, 2-2);
    }
}
