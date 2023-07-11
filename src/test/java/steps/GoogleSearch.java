package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.MessageFormat;
import java.time.Duration;

public class GoogleSearch {
    public ChromeDriver start() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        return new ChromeDriver(options);
    }
    ChromeDriver driver = start();

    @Given("I am on the Google homepage")
    public void iAmOnTheGoogleHomepage() {
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void searchFor(String query) {
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(query);
        element.submit();
    }

    @And("I click on the {string} link")
    public void iClickOnTheLink(String query) {
        String link = MessageFormat.format("//cite[contains(text(), \"{0}\")]", query.toLowerCase());
        driver.findElement(By.xpath(link)).click();
    }

    @Then("I should be redirected to the {string} page")
    public void iShouldBeRedirectedToThePage(String query) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedCondition<Boolean>) d -> {
            assert d != null;
            return d.getTitle().contentEquals(query);
        });
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }
}