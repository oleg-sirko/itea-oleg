/*package session5;


// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;



/*
public class SearchTest {
    private WebDriver driver;
    private WebDriverWait wait;
<<<<<<< HEAD
=======
    private WebElement element;
>>>>>>> 32d5d91bca722f0c22fc8e862cae9784769374bf

    @Before
    public void setUp() {
        //install latest ChromeDriver
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "/Users/olegsirko/utils/browsers/chromedriver");

        //Setup ChromeOptions so that pop-ups are not blocking access to elements
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));

        driver = new ChromeDriver(options=options);

        //set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,15);


        //initialize WebDriverWait object for explicit waits
        //wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }
    @After
    public void tearDown() {
        //Close browser
        driver.quit();
    }
    @Test
    public void searchTest() throws InterruptedException {
        // Open url
        driver.get("https://itea.ua/uk/");
<<<<<<< HEAD
        driver.manage().window().setSize(new Dimension(1440, 790));
        //driver.findElement(By.xpath("//button[contains(text(), 'Пошук')]")).click();
        driver.findElement(By.xpath("//button[contains(.,\'Пошук\')]")).click();
        //driver.findElement(By.cssSelector(".header-search #s")).sendKeys("qa automation");
        driver.findElement(By.xpath("(//form[@id=\'searchform\']/input)[3]")).sendKeys("qa automation");
        //driver.findElement(By.cssSelector(".header-search #s")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(//form[@id=\'searchform\']/input)[3]")).sendKeys(Keys.ENTER);
        //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(3) > btn")));
        //driver.findElement(By.cssSelector("div:nth-child(3) > .btn")).click();
        driver.findElement(By.xpath("(//a[contains(text(),\'ПОДРОБНЕЕ\')])[2]")).click();
=======

        //Click on Search field
        element = driver.findElement(By.xpath("//button[@class = 'show-search']"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        //Enter search term to Search field
        element = driver.findElement(By.cssSelector(".header-search #s"));
        element.sendKeys("qa automation");

        //Emulate pressing Enter button on kbrd
        Thread.sleep(2000);
        element.sendKeys(Keys.ENTER);

        //Click "Подробнее" for QA Automation
        element = driver.findElement(By.cssSelector("div:nth-child(3) > .btn"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        {
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        element.click();

        //Get page Title
>>>>>>> 32d5d91bca722f0c22fc8e862cae9784769374bf
        String actualTitle = driver.getTitle();

        //Verify Title is as expected
        String expectedTitle = "Курси автоматизованого тестування в Києві | ITEA";
        assertEquals(actualTitle, expectedTitle);
    }
}
*/