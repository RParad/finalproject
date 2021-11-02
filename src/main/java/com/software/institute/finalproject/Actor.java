package com.software.institute.finalproject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="actor")
public class Actor {

    /////////////////attributes\\\\\\\\\\\\\\\\\\\\
    private String FirstName;
    private String LastName;

    @Id
    private int actor_id;


        public Actor(int actor_id){
            this.actor_id = actor_id;
        }

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }
    }



