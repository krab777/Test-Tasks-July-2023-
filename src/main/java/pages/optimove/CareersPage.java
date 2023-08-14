package pages.optimove;

import base.Common;
import base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CareersPage extends SeleniumBase {
    public CareersPage() {
        SeleniumBase.driver = Common.start();
    }

    public void iAmOnTheCareerPageWithTitle(String arg0, String arg1) {
        get(arg0);
        verifyPageTitle(arg1);
    }

    public void iClickOnTheButton(String arg0) {
        clickElementByText(arg0);
    }

    public void iShouldSelectCountryInDropdown(String arg0) {
        String dropdown = "//div[contains(@class, 'select--job-locations')]/../div//select";
        click(dropdown);
        scrollToElement(arg0);
        String element = findElementByText(arg0);
        click(element);
    }

    public void verifyPosition(String arg0) {
        String xpath = findElementByText(arg0);
        WebElement element = driver.findElement(By.xpath(xpath));
        Assert.assertTrue(element.isDisplayed());
    }
}
