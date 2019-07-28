package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Getting Movie bean Using ApplicationContext
//        creating container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        getting bean of Movie class by two different names
        Movie movie1 = (Movie) context.getBean("movie1");
        System.out.println(movie1.getActor());
        Movie movie2 = (Movie) context.getBean("movie2");
        System.out.println(movie2.getActor());
//        checking if both the beans are true or not
        System.out.println(movie1 == movie2);
    }
}
