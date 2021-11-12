package com.software.institute.finalproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Film {

///////// Attributes

    @Id
    @GeneratedValue
    private int film_id;
    private String title;
    private Integer length;
    private int language_id;

///////// Constructors

    public Film(int film_id, String title, int length, int language_id) {
        this.film_id = film_id;
        this.title = title;
        this.length = length;
        this.language_id  = language_id;
    }

/////////

    public Film() {
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

}