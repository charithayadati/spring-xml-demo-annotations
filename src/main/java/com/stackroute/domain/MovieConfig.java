package com.stackroute.domain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MovieConfig
{
    //Creating beans using annotations
    @Bean(name = "actor")
    public Actor getActor()
    {
        return new Actor("Abhay","Male",22);
    }

    @Bean(name="movie")
    public Movie getMovie()
    {
        return new Movie();
    }

}
