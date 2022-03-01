package com.revature.main;

import com.revature.model.Person;
import com.revature.testinggit.TestGit;

public class Driver {


    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Hello World");
        methodB("Facts");
        person.lastName = "Bob";
        person.firstName = "yeahboy";
        person.age = 21;
        person.speak();

        Person p2 = new Person("yea", "Bobby", 15);
        p2.speak();


        TestGit testGit = new TestGit();;
        TestGit git = new TestGit("LOL what?", 300000);

        git.gitSpeak();

    }



    public static void methodB(String myString){
        System.out.println("Yeah boy " + myString);
    }
}
