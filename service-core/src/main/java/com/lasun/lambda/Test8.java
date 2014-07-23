package com.lasun.lambda;

/**
 * Created by lasune40 on 2014/7/23 0023.
 */
public class Test8 {
    public static void main(String[] args) {
        String message = "Howdy, world!";
        Runnable r = () -> System.out.println(message);
        r.run();
    }
}
