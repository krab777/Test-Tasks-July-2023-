package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Common extends SeleniumBase {
    @BeforeTest
    public static ChromeDriver start() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        return new ChromeDriver(options);
    }

    @AfterTest
    public static void quit() {
        driver.quit();
    }
}