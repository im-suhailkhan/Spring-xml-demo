package com.stackroute;

public class Movie {

    private Actor actor1;

    public Movie(Actor actor){
        System.out.println("movie object created");
        this.actor1=actor;
    }


    public void setActor1(Actor actor) {
        this.actor1 = actor;
    }

    public Actor getActor() {
        return actor1;
    }
}
