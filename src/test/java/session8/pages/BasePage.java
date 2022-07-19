package session8.pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    public WebDriver driver;
    WebDriverWait wait;
    public String title;

    public BasePage () {
       // driver = WebDriverManager.chromedriver().create();
       //System.setProperty("webdriver.chrome.driver", "C:\\Users/evolv/chromedriver.exe");
         WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public void clickButton (WebElement button) {
        wait.until(ExpectedConditions.elementToBeClickable(button));
        {
            Actions builder = new Actions(driver);
            builder.moveToElement(button, 0, 0).perform();
        }
        button.click();
     }

    public void typeText (WebElement field, String text) {
        wait.until(ExpectedConditions.visibilityOf(field));
        {
            Actions builder = new Actions(driver);
            builder.moveToElement(field, 0, 0).perform();
        }
        field.sendKeys(text);
        wait.until(ExpectedConditions.textToBePresentInElementValue(field, text));
    }

}
