package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        Movie movie=context.getBean("movieB", Movie.class);
        Movie movie1=context.getBean("movieA", Movie.class);
        //Actor actor=context.getBean("actor", Actor.class);
        System.out.println(movie1==movie);
    }
}
