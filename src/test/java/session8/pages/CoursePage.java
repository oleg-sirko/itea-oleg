package session8.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoursePage extends BasePage{

    public CoursePage (WebDriver driver) {
        super (driver);
    }
    public String title1 = driver.getTitle();

    public WebDriverWait wait;
}
