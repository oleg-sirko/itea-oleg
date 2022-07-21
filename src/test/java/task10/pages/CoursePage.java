package task10.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CoursePage extends BasePage {

    @FindBy(xpath = "//title")
    public WebElement title;

    public CoursePage (WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
