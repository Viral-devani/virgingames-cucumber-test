package com.virgingames.cucumber.steps;

import com.virgingames.pages.FreeGamesPage;
import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FreeGamesStepDef {
    @Given("^User is on the homepage$")
    public void userIsOnTheHomepage() {
    }

    @When("^User click on free Games tab$")
    public void userClickOnFreeGamesTab() {
        new HomePage().acceptCookies();
        new HomePage().clickOnFreeGamesTab();
    }

    @And("^User can see \"([^\"]*)\" text on the page$")
    public void userCanSeeTextOnThePage(String text) {
        Assert.assertEquals("Text is not displyed", text, new FreeGamesPage().getTextMessage());

    }

    @Then("^User should navigate to free Games page successfully$")
    public void userShouldNavigateToFreeGamesPageSuccessfully() {
    }


}
