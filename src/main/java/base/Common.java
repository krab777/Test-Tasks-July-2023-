package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class Common extends SeleniumBase {

    /**
     * This function will execute before each Test tag in testng.xml
     * @param browser
     * @throws Exception
     */
    @BeforeTest
    @Parameters("browser")
    public void setBrowser(String browser) throws Exception {
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else{
            throw new Exception("Incorrect Browser");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

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