package com.stackroute.domain;


public class Movie
{
    public Actor actor;

    public Movie(Actor actor)
    {
        this.actor = actor;
    }
    //Creating methods to display details
    public void actorDetails()
    {
        System.out.println(actor.getName()+" is " +actor.getGender()+" of age " +actor.getAge());
    }

}
