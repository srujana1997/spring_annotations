package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String args[]){
        //intializing applicationcontext object with classpath file
       AbstractApplicationContext applicationContext=new AnnotationConfigApplicationContext(configuration.class);
        //getBean() returns the instance of a class
        Movie movieA=applicationContext.getBean(Movie.class);
        movieA.movieDisplay();
        Movie  movieB=applicationContext.getBean(Movie.class);
        movieB.movieDisplay();
        System.out.println(movieA == movieB);
        //close the application context object
        applicationContext.close();

    }
}
