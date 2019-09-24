package com.stackroute;

public class Movie {

    private Actor actor;

    public Movie(){
        System.out.println("movie object created");
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }
}
