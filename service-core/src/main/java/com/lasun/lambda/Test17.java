package com.lasun.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lasune40 on 2014/7/24 0024.
 */
public class Test17 {
    public static void main(String args[]) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
        int sum = values.stream().reduce(0, (l, r) -> l + r);
        System.out.println(sum);

//        reduce(0, (l,r)->l+r)的工作原理是：第一个参数0作为后面lambda表达式的左操作数，然后从stream中取出一个元素作为右操作数，
//        二者运算的结果作为下一次运算的左操作数，依次循环。
    }
}
