package com.lasun.lambda;

import java.util.Arrays;

/**
 * Created by lasune40 on 2014/7/23 0023.
 */
 class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName +","+lastName+","+age;
    }
}

public class Test10{
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("Ted", "Neward", 41),
                new Person("Charlotte", "Neward", 42),
                new Person("Michael", "Neward", 19),
                new Person("Matthew", "Neward", 13)
        };

        //sort by firstName
        Arrays.sort(people, (lhs,rhs) -> lhs.firstName.compareTo(rhs.firstName));
        for(Person p : people){
            System.out.println(p);
        }
    }
}