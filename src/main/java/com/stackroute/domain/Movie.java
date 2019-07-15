package com.stackroute.domain;


public class Movie
{
    public Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void actorDetails()
    {
        System.out.println(actor.getName()+"  is " +actor.getGender()+" of age is " +actor.getAge());
    }

}
