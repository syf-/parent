package com.lasun.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by lasune40 on 2014/7/24 0024.
 */
public class Test16 {

    public static void main(String args[]) {
        Person4[] people = new Person4[]{
                new Person4("Ted", "Neward", 10),
                new Person4("Charlotte", "Neward", 41),
                new Person4("Michael", "Naward", 19),
                new Person4("Matthew", "Nmward", 13)
        };
        Collections.sort(Arrays.asList(people), Comparator.comparing(Person4::getLastName));
        for (Person4 p : people) {
            System.out.println(p);
        }
    }
}
