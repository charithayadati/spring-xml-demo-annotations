package com.stackroute;
import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[])
    {

        ApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie1=context.getBean(Movie.class);
        movie1.actorDetails();


        BeanFactory factory=new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie2=factory.getBean(Movie.class);
        movie2.actorDetails();

    }
}