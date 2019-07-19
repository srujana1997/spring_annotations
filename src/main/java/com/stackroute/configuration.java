package com.stackroute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@Configuration indicates that the class has @Bean definition methods.
@PropertySource("classpath:values.properties")
public class configuration {
    @Bean
    //To declare a bean
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
