package com.stackroute;

import org.springframework.beans.factory.annotation.Value;

public class Actor {
    @Value("${actor.name}")
        private String name;
    @Value("${actor.gender}")
        private String gender;
    @Value("${actor.age}")
        private String age;
    //display actor details
    public void actorDisplay(){
        System.out.println("name: "+name+"\ngender: "+gender+"\nage: "+age);
    }
}
