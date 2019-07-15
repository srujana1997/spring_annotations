package com.stackroute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:values.properties")
public class configuration {
    @Bean
    public Actor actor(){
        Actor actor=new Actor();
        return actor;
    }
    @Bean
    @Scope("prototype")
    public Movie movie(){
        Movie movie=new Movie(actor());
        //movie.setActor(actor());
        return movie;
    }

}
