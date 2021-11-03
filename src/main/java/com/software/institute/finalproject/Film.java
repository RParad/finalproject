package com.software.institute.finalproject;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name ="film")
public class Film {

///////// Attributes

    @Id
    private int film_id;
    private String title;
    private int length;
    private int release_year;

///////// Constructors

    public Film(int film_id, String title, int length, int release_year) {
        this.film_id = film_id;
        this.title = title;
        this.length = length;
        this.release_year = release_year;
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

    public void setLength(int length) {
        this.length = length;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }
}