package com.stackroute;

public class Actor {

    private String name;
    private String gender;
    private int age;

    public Actor() {
        System.out.println("actor object created");
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

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
