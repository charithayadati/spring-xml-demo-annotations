package com.stackroute.domain;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MovieConfig {
    @Bean(name={"movie1","movie2"})
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Movie movie()
    {
        Movie movie=new Movie(actor());
        return movie;
    }
    @Bean(name={"movie3"})
    public Movie movie1()
    {
        Movie movie=new Movie(actor2());
        return movie;
    }
    @Bean
    public Actor actor()
    {
        return new Actor("Rahul","Male",23);
    }
    @Bean
    public Actor actor2()
    {
        return new Actor("Abhay","Male",20);
    }
}
