package com.software.institute.finalproject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class filmReadSD {

    int film_id;
    String title;
    int length;
    int language_id;
    Film cucumberFilm;


    @Given("I have the correct identifiers")
    public void film_identifiers_film_id() {
        int film_id = 1;

    }

    @When("I search for a film title")
    public void i_search_for_a_film_title() {


//        actualAnswer = Film(int film_id, title, int length, int language_id);
//        this.film_id = film_id;

    }

    @Then("the film along with information about the film shall be retrieved")
    public void filmRetrieved() {
    }

    @Given("I have inputted invalid identifiers")
    public void filmNotThere() {
    }

    @Then("I will be told The film cannot be found")
    public void filmFound() {
    }



    /*@Then("the film shall not be retrieved and users will be told")
    public void theFilmShallNotBeRetrievedAndUsersWillBeTold(String excpectedAnswer) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals (excpectedAnswer, actualAnswer);*/

}
