package com.lasun;

/**
 * Created by lasune40 on 2014/7/17 0017.
 */
public class Largest {
    public static int largest(int[] list) {
        int index, max = Integer.MIN_VALUE;
        for (index = 0; index <= list.length - 1; index++) {
            if(list[index] > max){
                max = list[index];
            }
        }
//        System.out.println(max);
        return max;
    }
}
