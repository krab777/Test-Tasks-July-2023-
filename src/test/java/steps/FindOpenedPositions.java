package steps;

import base.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.optimove.CareersPage;

public class FindOpenedPositions extends Common {
    CareersPage careersPage =  new CareersPage();

    @Given("I am on the {string} Career page with title {string}")
    public void iAmOnTheCareerPageWithTitle(String arg0, String arg1) {
        careersPage.iAmOnTheCareerPageWithTitle(arg0, arg1);
    }

    @When("I scroll to element {string}")
    public void iScrollToElement(String arg0) {
        scrollToElement(arg0);
    }

    @And("I click on the {string} button")
    public void iClickOnTheButton(String arg0) {
        careersPage.iClickOnTheButton(arg0);
    }

    @Then("I should select {string} country in dropdown")
    public void iShouldSelectCountryInDropdown(String arg0) {
        careersPage.iShouldSelectCountryInDropdown(arg0);
    }

    @And("I verify that there is position for QA Automation Engineer")
    public void iVerifyThatThereIsPositionForQAAutomationEngineer() {
    }

    @And("I verify that there is position for {string}")
    public void iVerifyThatThereIsPositionFor(String arg0) {
        careersPage.verifyPosition(arg0);
    }
}