package com.stackroute.domain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MovieConfig {
    //Creating beans using annotations
    @Bean
    public Movie movieBean()
    {
        Movie movie=new Movie();
        movie.setActor(actor());
        return movie;
    }
    @Bean
    public Actor actor()
    {
        return new Actor();

    }

}
