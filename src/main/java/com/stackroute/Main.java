package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(configuration.class);
        Movie movieA=applicationContext.getBean(Movie.class);
        movieA.movieDisplay();
    }
}
