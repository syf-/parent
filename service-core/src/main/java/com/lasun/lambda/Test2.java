package com.lasun.lambda;

/**
 * Created by lasune40 on 2014/7/23 0023.
 */
public class Test2 {

    public static void main(String[] args) {
        Runnable r = ()->System.out.println("hello,lambda");
        r.run();
    }
}
