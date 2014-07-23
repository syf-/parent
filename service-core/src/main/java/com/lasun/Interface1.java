package com.lasun;

/**
 * Created by lasune40 on 2014/7/23 0023.
 */
public interface Interface1 {
    double calculate(int a);
    default double sqrt(int a){
        return Math.sqrt(a);
    }
    default double sqrt1(int a){
        return Math.sqrt(a);
    }
}
