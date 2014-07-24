package com.lasun.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by lasune40 on 2014/7/24 0024.
 */
class Person1 {
    public String firstName;
    public String lastName;
    public int age;

    Person1(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + "," + lastName + "," + age;
    }

    public final static Comparator<Person1> compareFirstName = (lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName);

    public final static Comparator<Person1> compareLastName = (lhs, rhs) -> lhs.lastName.compareTo(rhs.lastName);

    public final static Comparator<Person1> compareAge = (lhs, rhs) -> lhs.age - rhs.age;
}

public class Test11 {

    public static void main(String[] args) {
        Person1[] people = new Person1[]{
                new Person1("Ted", "Neward", 41),
                new Person1("Charlotte", "Neward", 42),
                new Person1("Michael", "Neward", 19),
                new Person1("Matthew", "Neward", 13)
        };

        Arrays.sort(people, Person1.compareFirstName);// 直接引用lambda

        for (Person1 p : people){
            System.out.println(p);
        }

    }
}
