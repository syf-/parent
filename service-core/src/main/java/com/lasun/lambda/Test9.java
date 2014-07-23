package com.lasun.lambda;

/**
 * Created by lasune40 on 2014/7/23 0023.
 */
public class Test9 {
    public static void main(String[] args) {
        String message = "Howdy, world!";
        Runnable r = () -> System.out.println(message);
        r.run();
//        message = "change it";

//        Error:(9, 47) java: 从lambda 表达式引用的本地变量必须是最终变量或实际上的最终变量
    }
}
