package com.stackroute;

public class Movie {
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    private Actor actor;

    public void movieDisplay(){
        actor.actorDisplay();
    }

}
