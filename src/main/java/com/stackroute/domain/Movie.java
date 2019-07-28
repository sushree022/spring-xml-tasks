package com.stackroute.domain;

import java.util.List;

public class Movie {
    //    instance of Actor class created
    List<Actor> actor;

    //    constructor
    public Movie(List<Actor> actor) {
        this.actor = actor;
    }

    //    getters and setters
    public List<Actor> getActor() {
        return actor;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    //    toString method is over-ridden
    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
