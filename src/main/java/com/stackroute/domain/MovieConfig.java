package com.stackroute.domain;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MovieConfig
{
    @Bean(name = "actor")
    public Actor getActor()
    {
        return new Actor("Abhay","Male",23);
    }
    @Bean(name="movie")
    public Movie getMovie()
    {
        return new Movie();
    }

}
