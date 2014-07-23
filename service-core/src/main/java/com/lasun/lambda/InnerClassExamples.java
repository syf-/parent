package com.lasun.lambda;

/**
 * Created by lasune40 on 2014/7/23 0023.
 */
class Hello {
    public Runnable r = new Runnable() {
        public void run() {
            System.out.println(this);
            System.out.println(toString());
            System.out.println(Hello.this);
            System.out.println(Hello.this.toString());
        }
    };

    public String toString() {
        return "Hello's custom toString()";
    }
}

public class InnerClassExamples {
    public static void main(String... args) {
        Hello h = new Hello();
        h.r.run();
    }
}
