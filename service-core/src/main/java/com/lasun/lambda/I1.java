package com.lasun.lambda;

/**
 * Created by lasune40 on 2014/7/24 0024.
 */
public interface I1 {
    public default void print() {
        System.out.println("I1");
    }

    public void hello();
}
