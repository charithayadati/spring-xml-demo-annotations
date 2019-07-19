package com.stackroute.domain;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware
{
    @Autowired
    public Actor actor;


    public Movie()
    {
    }

    public Actor getActor()
    {
        return actor;
    }

    @Autowired
    public void setActor(Actor actor)
    {
        this.actor = actor;
    }

    public Movie(Actor actor)
    {
        this.actor = actor;
    }

    public void actorDetails()
    {
        System.out.println(actor.getName()+" is " +actor.getGender()+" of age " +actor.getAge());
    }
    //Overriding the methods of interfaces
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException
    {

    }

    @Override
    public void setBeanName(String s)
    {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {

    }
}
