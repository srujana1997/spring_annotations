package com.stackroute;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:values.properties")
@ComponentScan("com.stackroute")
public class configuration {
   /* @Bean
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
    }*/

}
