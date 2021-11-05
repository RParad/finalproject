package com.software.institute.finalproject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class filmReadSD {




    @Given("a film is present in the database")
    public void a_film_is_present_in_the_database() {
    }
    @When("they search for a film title")
    public void they_search_for_a_film_title() {
    }
    @Then("the film along with information about the film shall be retrieved")
    public void filmRetrieved() {
    }

    @Given("a film is not present in the database")
    public void aFilmIsNotPresentInTheDatabase() {

    }

    /*@Then("the film shall not be retrieved and users will be told")
    public void theFilmShallNotBeRetrievedAndUsersWillBeTold(String excpectedAnswer) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals (excpectedAnswer, actualAnswer);*/

    }

