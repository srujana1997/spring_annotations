package com.stackroute;

import org.springframework.context.annotation.*;

@Configuration
//@Configuration annotation indicates that the class has @Bean definition methods.
@PropertySource("classpath:values.properties")
@ComponentScan("com.stackroute")
//@ComponentScan annotation to tell Spring the packages to scan for annotated components. 
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
