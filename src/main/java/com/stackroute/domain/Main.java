package com.stackroute.domain;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
//        Getting Movie bean Using ApplicationContext
//        creating container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        getting bean of Movie class
        Movie movie1 = (Movie) context.getBean("movie1");
        System.out.println(movie1.getActor());

//        getting movie bean using xml Bean factory
//        creating container
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        getting bean of movie class
        Movie movie2 = (Movie) context.getBean("movie1");
        System.out.println(movie2.getActor());
//        getting bean of Actor class
        Actor actor1 = (Actor) context.getBean("actor1");
        System.out.println("age of actor 1= " + actor1.getAge());
    }
}
