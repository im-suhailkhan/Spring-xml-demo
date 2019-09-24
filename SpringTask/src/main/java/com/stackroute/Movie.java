package com.stackroute;

public class Movie {

    private Actor actor;

    public Movie(Actor actor){
        System.out.println("movie object created");
        this.actor=actor;
    }

    public Actor getActor() {
        return actor;
    }
}
