package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
//    instance of Actor class created
    private List<Actor> actor;

    public Movie() {
    }

    public Movie(List<Actor> actor) {
        this.actor = actor;
    }

    public List<Actor>getActor() {
        return actor;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("bean factory implemented");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("bean name set" +s);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application context implemented");

    }
}