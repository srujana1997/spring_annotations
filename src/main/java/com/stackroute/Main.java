package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String args[]){
       AbstractApplicationContext applicationContext=new AnnotationConfigApplicationContext(configuration.class);
        Movie movieA=applicationContext.getBean(Movie.class);
        movieA.movieDisplay();
        Movie  movieB=applicationContext.getBean(Movie.class);
        movieB.movieDisplay();
        System.out.println(movieA == movieB);
        applicationContext.close();

    }
}
