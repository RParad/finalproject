package com.software.institute.finalproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Actor {

    /////////////////attributes\\\\\\\\\\\\\\\\\\\\
    @Id
    @GeneratedValue
    private int actor_id;
    private String first_name;
    private String last_name;


    ///////////////////////Constructors\\\\\\\\\\\\\\\\\
    public Actor(){
    }

    public Actor(int actor_id, String first_name, String last_name) {
        this.actor_id = actor_id;
        this.first_name = first_name;
        this.last_name = last_name;
    }



    //////////////////////////////Methods\\\\\\\\\\\\\\\\\\


    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}