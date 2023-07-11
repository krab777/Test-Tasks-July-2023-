package pages;

import base.Common;
import base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.MessageFormat;
import java.time.Duration;

public class GooglePage extends SeleniumBase {
    public GooglePage() {
        SeleniumBase.driver = Common.start();
    }

    public void iAmOnTheGoogleHomepage(String query) {
        get("https://www.google.com");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedCondition<Boolean>) driver -> {
            assert driver != null;
            return getTitle().contentEquals(query);
        });
    }

    public void searchFor(String query) {
        WebElement element = driver.findElement(By.name("q"));
        submit(element, query);
    }

    public void iClickOnTheLink(String query) {
        String link = MessageFormat.format("//cite[contains(text(), \"{0}\")]", query.toLowerCase());
        click(link);
    }
}
