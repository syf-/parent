package com.lasun.lambda;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by lasune40 on 2014/7/24 0024.
 */
public class Test20 {
    public static void main(String args[]){
        Person5 people[] = new Person5[]{
                new Person5("Ted", "Neward", 10),
                new Person5("Charlotte", "Neward", 41),
                new Person5("Michael", "Naward", 19),
                new Person5("Matthew", "Nmward", 13)
        };
        String json = Arrays.asList(people).stream().map(Person5::toJson).collect(Collectors.joining(", ", "[", "]"));
        System.out.println(json);
    }
}
