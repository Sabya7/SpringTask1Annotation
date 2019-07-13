package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Bean
    public Actor actor()
    {
        Actor actor=new Actor();
        actor.setAge(21);
        actor.setGender("Male");
        actor.setName("Zafeer Agha");
        return actor;
    }
    @Bean
    public Actor actorMites()
    {
        Actor actor=new Actor("Mites","Male",21);
        return actor;
    }
    @Bean
    public Actor actorAbinash()
    {
        Actor actor=new Actor("Abinash","Male",21);
        return actor;
    }
    @Bean
    public Actor actorPaku()
    {
        Actor actor=new Actor("Paku","Male",21);
        return actor;
    }
    /*@Bean({"movieA","movieB"})
    @Scope("prototype")
    public Movie movie()
    {
        Movie movie =new Movie(actor());
        return movie;
    }*/
    @Bean
    public Movie movie1()
    {
        Movie movie =new Movie(actorPaku());
        return movie;
    }

}
