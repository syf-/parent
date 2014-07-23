package com.lasun;

/**
 * Created by lasune40 on 2014/7/23 0023.
 */
public class Test1 {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello,lambda!");
            }
        };
        r.run();
    }
}
