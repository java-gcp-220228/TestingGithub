package com.revature.testinggit;

public class TestGit {


    public String gitName;
    public double testingDouble;

    public TestGit(){}

    public TestGit(String gitName, double testingDouble){
        this.gitName = gitName;
        this.testingDouble = testingDouble;
    }

    public void gitSpeak(){
        System.out.println("My GitName is: " + gitName + " literally just testing lol the double is: " + testingDouble);

    }
}
