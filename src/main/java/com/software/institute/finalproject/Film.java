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

    public Film(String title, int length, int release_year) {
        this.title = title;
        this.length = length;
        this.release_year = release_year;
    }

/////////

    public Film() {
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

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }
}