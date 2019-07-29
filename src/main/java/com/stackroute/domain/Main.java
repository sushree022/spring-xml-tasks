package com.stackroute.domain;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
//        Getting Movie bean Using ApplicationContext
//        creating container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = (Movie) context.getBean("movie1");
        System.out.println(movie1.getActor());
//        beanlife cycle demo bean
        ConfigurableApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean bean = (BeanLifecycleDemoBean) context2.getBean("life-cycle-bean");
//        BeanPostProcessorDemoBean
        BeanPostProcessor postProcessorBean= (BeanPostProcessor) context2.getBean("post-processor-bean");
    }
}
