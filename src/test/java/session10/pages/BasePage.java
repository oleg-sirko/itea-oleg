package session10.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.fail;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public String title;
    public int wait_timeout = 5;

    public BasePage () {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        driver = new ChromeDriver(options=options);
        driver.manage().timeouts().implicitlyWait(wait_timeout, TimeUnit.SECONDS);
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(wait_timeout));
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        //Close browser
        driver.quit();
    }

    public void clickButton (WebElement button) {
        try {
        wait.until(ExpectedConditions.elementToBeClickable(button));}
        catch (TimeoutException e) {
            fail("Button is not clickable after " + wait_timeout + ". Exception message is:\n" + e.getMessage());
        }
        {
            Actions builder = new Actions(driver);
            builder.moveToElement(button, 0, 0).perform();
        }
        try {
            button.click();
        }
        catch (ElementClickInterceptedException  e){
            fail("Button is available but there are conditions preventing it from being clicked. " +
                    "Exception message is:\n" + e.getMessage());
        }
    }

    public void typeText (WebElement field, String text) {
        try {
            wait.until(ExpectedConditions.visibilityOf(field));
        }
        catch (TimeoutException e) {
            fail("Field is not visible after " + wait_timeout);
        }
        {
            Actions builder = new Actions(driver);
            builder.moveToElement(field, 0, 0).perform();
        }
        try {
        field.sendKeys(text);}
        catch (Exception e) {
            fail("Failed to type in the element. Exception message is:\n" + e.getMessage());
        }

        wait.until(ExpectedConditions.textToBePresentInElementValue(field, text));
    }

    public boolean isElementAvailable (WebElement element) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            element.isDisplayed();
        }
        catch (NoSuchElementException e) {
            return false;
        }
        finally {
            driver.manage().timeouts().implicitlyWait(wait_timeout, TimeUnit.SECONDS);

        }
        return true;
    }
}
