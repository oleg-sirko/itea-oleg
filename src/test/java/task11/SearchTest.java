package task11;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class SearchTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement element;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "/Users/olegsirko/utils/browsers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void searchTest() throws InterruptedException {
        driver.get("https://itea.ua/uk/");
        try {
        element = driver.findElement(By.xpath("//button[@class = 'NotExistentButton']"));
        element.click(); }
        catch (NoSuchElementException e) {
            System.out.println("Button is not present on web page");
        }

    }
}
