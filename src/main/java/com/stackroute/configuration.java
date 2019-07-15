package com.stackroute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:values.properties")
public class configuration {
    @Bean
    public Actor actor(){
        Actor actor=new Actor();
        return actor;
    }
    @Bean
    public Movie movie(){
        Movie movie=new Movie();
        movie.setActor(actor());
        return movie;
    }

}
