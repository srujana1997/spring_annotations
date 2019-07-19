package com.stackroute;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
     //Assinging attrinute values from property file using @value
    @Value("${actor.name}")
        private String name;
    @Value("${actor.gender}")
        private String gender;
    @Value("${actor.age}")
        private String age;
    public Actor(){}
    public Actor(String name, String gender, String age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //display actor details
    public void actorDisplay(){
        System.out.println("name: "+name+"\ngender: "+gender+"\nage: "+age);
    }
}
