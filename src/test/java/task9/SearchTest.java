package task9;


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
        System.setProperty("webdriver.chrome.driver", "D:\\Soft\\chromedriver.exe");

        //Setup ChromeOptions so that pop-ups are not blocking access to elements
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));

        //start browser (initialize WebDriver object)
        driver = new ChromeDriver(options=options);

        //set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //initialize WebDriverWait object for explicit waits
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));

    }
    @After
    public void tearDown() {
        //Close browser
        driver.quit();
    }
    @Test
    public void searchTest() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickButton(homePage.showSearchButton);
        homePage.typeSearchTerm( "qa automation");


        SearchResultsPage searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
        searchResultsPage.clickButton(searchResultsPage.moreDetailsButton);

        //Get page Title
        String actualTitle = driver.getTitle();

        //Verify Title is as expected
        String expectedTitle = "Курси автоматизованого тестування в Києві | ITEA";
        assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void openChildrenCourses() {
        //click on Дитячі Курси link
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickButton(homePage.childrenCoursesLink);

        //Verify Title is Комп'ютерні курси для дітей в Києві, курси програмування для дітей ITEAKiDS
        String actualTitle = driver.getTitle();
        String expectedTitle = "Комп'ютерні курси для дітей в Києві, курси програмування для дітей ITEAKiDS";
        assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void openCoursePage() {

        CoursePage coursePage = PageFactory.initElements(driver, CoursePage.class);

        //Get page Title
        String actualTitle = coursePage.getPageTitle();

        //return Title Курси автоматизованого тестування в Києві | ITEA
        String expectedTitle = "Курси автоматизованого тестування в Києві | ITEA";
        assertEquals(actualTitle, expectedTitle);
    }
}
