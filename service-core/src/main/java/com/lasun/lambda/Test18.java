package com.lasun.lambda;

import java.util.Arrays;

/**
 * Created by lasune40 on 2014/7/24 0024.
 */
class Person5{
    public String firstName;
    public String lastName;
    public int age;
    public Person5(String firstName, String lastName, int age){
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
    public String toJson(){
        return "{"+
                "firstName:\""+firstName+"\","+
                "lastName:\""+lastName+"\","+
                "age:"+age +
                "}";
    }
}
public class Test18{
    public static void main(String args[]){
        Person5 people[] = new Person5[]{
                new Person5("Ted", "Neward", 10),
                new Person5("Charlotte", "Neward", 41),
                new Person5("Michael", "Naward", 19),
                new Person5("Matthew", "Nmward", 13)
        };
        String json = Arrays.asList(people).stream().map(Person5::toJson).reduce("[",(l,r)->l + (l.equals("[")?"":",") + r)+"]";
        System.out.println(json);
    }
}