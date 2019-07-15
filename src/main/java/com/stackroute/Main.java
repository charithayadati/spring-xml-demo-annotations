package com.stackroute;
import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
;

public class Main {
    public static void main(String args[])
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie=context.getBean("movie",Movie.class);
        System.out.println("Using ApplicationContext Aware");
        movie.actorDetails();

        BeanFactory beanFactory=new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie1=beanFactory.getBean("movie",Movie.class);
        movie1.setBeanFactory(beanFactory);
        System.out.println("\nUsing BeanFactory Aware");
        movie1.actorDetails();


        Movie movie2=context.getBean("movie",Movie.class);
        movie2.setBeanName("movie");
        System.out.println("\nUsing BeanNameAware");
        movie2.actorDetails();


    }
}
