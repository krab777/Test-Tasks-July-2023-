package pages;

import base.SeleniumBase;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YouTubePage extends SeleniumBase {
    public void iShouldBeRedirectedToThePage(String query) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedCondition<Boolean>) d -> {
            assert d != null;
            return getTitle().contentEquals(query);
        });
    }
}
