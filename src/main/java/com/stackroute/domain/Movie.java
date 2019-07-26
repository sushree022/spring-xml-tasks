package com.stackroute.domain;

import java.util.List;

public class Movie {
    //    instance of Actor class created
    List<Actor> actor;

    //    setters and getters
    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    public List<Actor> getActor() {
        return actor;
    }

    //    toString method over ridden
    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
