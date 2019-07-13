package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
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
        context.scan("com.stackroute");
        //Movie movie=context.getBean("movieB", Movie.class);
        Movie movie1=context.getBean("movie", Movie.class);
        //Actor actor=context.getBean("actor", Actor.class);
        //System.out.println(movie1==movie);
        System.out.println(movie1);
        BeanLifecycleDemoBean beanLifecycleDemoBean=context.getBean(BeanLifecycleDemoBean.class);
        context.registerShutdownHook();
        BeanPostProcessorDemoBean beanPostProcessorDemoBean=context.getBean(BeanPostProcessorDemoBean.class);
        beanPostProcessorDemoBean.postProcessAfterInitialization(movie1,"movie");
        beanPostProcessorDemoBean.postProcessBeforeInitialization(movie1,"movie");
    }
}
