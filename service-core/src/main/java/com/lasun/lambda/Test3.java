package com.lasun.lambda;

import java.util.Comparator;

/**
 * Created by lasune40 on 2014/7/23 0023.
 */
public class Test3{
    public static void main(String[] args) {
        Comparator<String> c = (String lhs, String rhs) -> lhs.compareTo(rhs);
        int result = c.compare("Hello", "World");
        System.out.println(result);
    }
}
