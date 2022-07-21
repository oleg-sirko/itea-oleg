package task9;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import task9.BasePage;

import java.time.Duration;

public class HomePage extends BasePage {

    @FindBy (xpath = "//button[@class = 'show-search']")
    WebElement showSearchButton;

    @FindBy (css = ".header-search #s")
    WebElement searchField;

    @FindBy (xpath = "//a[text()='Дитячі курси']")
    WebElement childrenCoursesLink;

    WebDriverWait wait;



    public HomePage(WebDriver driver) {
        super (driver);
        driver.get("https://itea.ua/uk/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void typeSearchTerm (String text) {
        typeText(searchField, text);
        searchField.sendKeys(Keys.ENTER);
    }

}
