package com.lasun.lambda;

/**
 * Created by lasune40 on 2014/7/24 0024.
 */
interface I1 {
    public default void print() {
        System.out.println("I1");
    }

    public void hello();
}

interface I2 {
    public default void print() {
        System.out.println("I1");
    }

    public void world();
}

public class Impl implements I1, I2 {
    public void print() {
        I1.super.print();
    }

    public void hello() {
    }


    public void world() {
    }
}