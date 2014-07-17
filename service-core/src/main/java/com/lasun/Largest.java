package com.lasun;

/**
 * Created by lasune40 on 2014/7/17 0017.
 */
public class Largest {
    public static int largest(int[] list) {
        int index, max = 0;
        for (index = 0; index <= list.length - 1; index++) {
            max = list[index];
        }
        System.out.println(max);
        return max;
    }
}
