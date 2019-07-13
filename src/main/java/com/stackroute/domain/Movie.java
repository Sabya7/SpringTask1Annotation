package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    private Actor actor;

    public Movie() {
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
