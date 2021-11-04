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
    
}
