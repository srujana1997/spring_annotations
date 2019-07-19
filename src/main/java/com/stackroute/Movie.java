package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
//indication to create object for this class
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    @Autowired
    //automatic dependency injection
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    private Actor actor;

    public void movieDisplay(){
        actor.actorDisplay();
    }

    //@Override annotation informs the compiler that the element is meant to override
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory"+beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanName "+s);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext");

    }
}
