package com.stackroute.domain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MovieConfig
{
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
