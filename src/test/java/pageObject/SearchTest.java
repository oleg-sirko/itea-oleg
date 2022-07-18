package pageObject;


// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class SearchTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement element;

    @Before
    public void setUp() {
        //install latest ChromeDriver
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "/Users/olegsirko/utils/browsers/chromedriver");

        //Setup ChromeOptions so that pop-ups are not blocking access to elements
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        //start browser (initialize WebDriver object)
        driver = new ChromeDriver(capabilities=capabilities);

        //set implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //initialize WebDriverWait object for explicit waits
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }
    @After
    public void tearDown() {
        //Close browser
        driver.quit();
    }
    @Test
    public void searchTest() throws InterruptedException {
        //initialize page object and elements
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        wait.until(ExpectedConditions.elementToBeClickable(homePage.showSearchButton));
        homePage.showSearchButton.click();


        //Enter search term to Search field
        homePage.typeSearchTerm("qa automation");


        //Click "Подробнее" for QA Automation
        SearchResultsPage searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
        searchResultsPage.clickMoreDetailsLink();

        //Get page Title
        String actualTitle = driver.getTitle();

        //Verify Title is as expected
        String expectedTitle = "Курси автоматизованого тестування в Києві | ITEA";
        assertEquals(actualTitle, expectedTitle);
    }
}
