package com.lasun.lambda;

/**
 * Created by lasune40 on 2014/7/23 0023.
 */
public class Test7 {
    public static void main(String[] args) {
        Hello1 h = new Hello1();
        h.r.run();
    }
}

class Hello1{
    public Runnable r = () -> {
        System.out.println(this);
        System.out.println(toString());
    };

    public String toString(){
        return "Hello's custom toString()";
    }
}