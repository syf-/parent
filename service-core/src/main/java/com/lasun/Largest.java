package com.lasun;

/**
 * Created by lasune40 on 2014/7/17 0017.
 */
public class Largest {
    public static int largest(int[] list) {
        int index, max = Integer.MAX_VALUE;
        for (index = 0; index < list.length - 1; index++) {
            max = list[index];
        }
        return max;
    }
}
