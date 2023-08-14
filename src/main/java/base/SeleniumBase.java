package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.MessageFormat;
import java.time.Duration;

public class SeleniumBase {

    protected static RemoteWebDriver driver = null;

    public String getTitle(){
        return driver.getTitle();
    }

    protected void click(String data) {
        WebElement element = driver.findElement(By.xpath(data));
        element.click();
    }

    public void type(WebElement element, String data) {
        element.clear();
        element.sendKeys(data);
    }

    public void submit(WebElement element, String data) {
        type(element, data);
        element.submit();
    }

    public void get(String string) {
        driver.get(string);
    }

    public void verifyPageTitle(String query) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedCondition<Boolean>) driver -> {
            assert driver != null;
            return getTitle().contentEquals(query);
        });
    }

    public String findElementByText(String arg0) {
        return MessageFormat.format("//*[contains(text(), \"{0}\")]", arg0);
    }


    public void clickElementByText(String arg0) {
        String element = findElementByText(arg0);
        click(element);
    }

    public void scrollToElement(String arg0) {
        String elementText = findElementByText(arg0);
        WebElement element = driver.findElement(By.xpath(elementText));
        int deltaY = element.getRect().y-50;
        new Actions(driver)
                .scrollByAmount(0, deltaY)
                .perform();
    }
}
