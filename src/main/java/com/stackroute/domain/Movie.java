package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;


public class Movie
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

}