package steps;

import base.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;
import pages.YouTubePage;

public class GoogleSearch extends Common {
    GooglePage googlePage =  new GooglePage();
    YouTubePage youTubePage =  new YouTubePage();

    @Given("I am on the {string} homepage")
    public void iAmOnTheGoogleHomepage(String query) {
        googlePage.iAmOnTheGoogleHomepage(query);
    }

    @When("I search for {string}")
    public void searchFor(String query) {
        googlePage.searchFor(query);
    }

    @And("I click on the {string} link")
    public void iClickOnTheLink(String query) {
        googlePage.iClickOnTheLink(query);
    }

    @Then("I should be redirected to the {string} page")
    public void iShouldBeRedirectedToThePage(String query) {
        youTubePage.iShouldBeRedirectedToThePage(query);
    }
}