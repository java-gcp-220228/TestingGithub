package com.revature.model;

public class Person {


    public String firstName;
    public String lastName;
    public int age;

    public Person() {}
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public void speak(){
        System.out.print(firstName + " Says Hi, His last Name is " + lastName + " His age is " + age);

    }
}
