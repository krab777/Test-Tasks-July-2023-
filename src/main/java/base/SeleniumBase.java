package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

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
}
