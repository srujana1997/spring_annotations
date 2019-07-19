package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]){
        //intializing applicationcontext object with classpath file
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(configuration.class);
        //getBean() returns instance
        Movie movieA=applicationContext.getBean(Movie.class);
        movieA.movieDisplay();
    }
}
