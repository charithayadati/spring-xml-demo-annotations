package com.stackroute;
import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[])
    {

        ApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie1=context.getBean("movie1",Movie.class);
        movie1.actorDetails();
        Movie movie2=context.getBean("movie2",Movie.class);
        movie2.actorDetails();
        Movie movie3=context.getBean("movie3",Movie.class);
        movie3.actorDetails();
        System.out.println("The equality of two beans is : "+(movie1==movie2));


    }
}