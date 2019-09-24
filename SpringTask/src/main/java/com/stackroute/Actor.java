package com.stackroute;

public class Actor {

    private String name;
    private String gender;
    private int age;

    public Actor(String name,String gender,int age) {
        System.out.println("actor object created");
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
