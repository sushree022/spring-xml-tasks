package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
//        creating container
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = (Movie) context.getBean("movie1");
        System.out.println(movie1.getActor());
    }
}
