package com.lasun.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by lasune40 on 2014/7/24 0024.
 */
class Person4{
    public String firstName;
    public String lastName;
    public int age;
    public Person4(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public String toString(){
        return firstName+","+lastName+","+age;
    }
}

public class Test13 {
    public static void main(String[] args) {
        Person4[] people = new Person4[]{
                new Person4("Ted", "Neward", 41),
                new Person4("Charlotte", "Neward", 41),
                new Person4("Michael", "Neward", 19),
                new Person4("Matthew", "Neward", 13)
        };
        Arrays.sort(people, Comparator.comparing(Person4::getFirstName));
        for (Person4 p : people)
            System.out.println(p);
    }
}
