package com.lasun.lambda;

import java.util.Arrays;

/**
 * Created by lasune40 on 2014/7/24 0024.
 */
class Person3{
    public String firstName;
    public String lastName;
    public int age;
    public Person3(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String toString(){
        return firstName+","+lastName+","+age;
    }
    public static int compareFirstName(Person3 lhs, Person3 rhs){
        return lhs.firstName.compareTo(rhs.firstName);
    }
    public static int compareLastName(Person3 lhs, Person3 rhs){
        return lhs.lastName.compareTo(rhs.lastName);
    }
}
public class Test12{
    public static void main(String args[]){
        Person3 people[] = new Person3[]{
                new Person3("Ted", "Neward", 41),
                new Person3("Charlotte", "Neward", 41),
                new Person3("Michael", "Neward", 19),
                new Person3("Matthew", "Neward", 13)
        };
        Arrays.sort(people, Person3::compareFirstName);
        for(Person3 p : people){
            System.out.println(p);
        }
    }
}