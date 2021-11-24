//package com.software.institute.finalproject;
//
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertSame;
//
//@SpringBootTest
//public class ActorTest {
//
//
//    @Test
//    void contextLoads() {
//    }
//    @Test
//    public void testGetActorIDMethod() {
//        Actor testActor = new Actor(1, "Jared", "Leto");
//        assertEquals(1, testActor.getActor_id(), "The Actor Id is correct" );
//    }
//    @Test
//    public void testSetFirstNameMethod() {
//        String first_name = "Jared";
//        Actor testActor = new Actor(1, "Jared", "Leto");
//        assertSame("Jared", testActor.setFirst_name());
//    }
//    @Test
//    public void testGetFirstNameMethod(){
//        Film testFilm = new Film (1, "Avatar", 128, 6);
//        assertEquals(128, testFilm.getLength(), "The film is 128 mins long");
//    }
//    @Test
//    public void testGetLastNameMethod() {
//        Film testFilm = new Film(1,"Avatar", 128, 1);
//        assertEquals(1,testFilm.getFilm_id(), "This Sounds about right");
//    }
//    @Test
//    public void testSetLastNameMethod() {
//        Film testFilm = new Film(1,"Avatar", 128, 1);
//        assertEquals(1,testFilm.getLanguage_id(), "This Sounds about right, again?");
//    }
//}
