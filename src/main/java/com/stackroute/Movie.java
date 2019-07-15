package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    private Actor actor;

    public void movieDisplay(){
        actor.actorDisplay();
    }

}
