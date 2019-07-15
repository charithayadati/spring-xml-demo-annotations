package com.stackroute.domain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MovieConfig {
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