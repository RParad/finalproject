package com.software.institute.finalproject;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FilmTest {

    @Test
    void contextLoads() {
    }
    @Test
    public void testGetTitleMethod() {
        Film testFilm = new Film(1, "Avatar" , 134, 6);
        assertEquals("Avatar", testFilm.getTitle(), "The film Title is correct" );
    }
    @Test
    public void testSetTitleMethod() {
        String Title = "Avatar";
        Film testFilm = new Film(1, "Avatar", 134, 6);
        assertEquals("Avatar", testFilm.getTitle(), Title);
    }
    @Test
    public void testGetFilmLengthMethod(){
        Film testFilm = new Film (1, "Avatar", 128, 6);
        assertEquals(128, testFilm.getLength(), "The film is 128 mins long");
    }
    @Test
    public void testGetFilmIDMethod() {
        Film testFilm = new Film(1,"Avatar", 128, 1);
        assertEquals(1,testFilm.getFilm_id(), "This Sounds about right");
    }
    @Test
    public void testGetlanguageIDMethod() {
        Film testFilm = new Film(1,"Avatar", 128, 1);
        assertEquals(1,testFilm.getLanguage_id(), "This Sounds about right, again?");
    }
}
