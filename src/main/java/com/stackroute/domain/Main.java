package com.stackroute.domain;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Getting Movie bean Using ApplicationContext
//        creating container
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = (Movie) context.getBean("movie1");
        System.out.println(movie1.getActor());
        context.close();
    }
}
