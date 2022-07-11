package Task8;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends  BasePage{

    @FindBy (xpath = "//button[@class = 'show-search']")
    WebElement showSearchButton;

    @FindBy (css = ".header-search #s")
    WebElement searchField;

    @FindBy (xpath = "//a[text()='Дитячі курси']")
    WebElement childrenCoursesLink;

    WebDriverWait wait;

    public HomePage (WebDriver driver) {
        super (driver);
        driver.get("https://itea.ua/uk/");
        wait = new WebDriverWait(driver, 5);
    }

    public void typeSearchTerm (String text) {
        typeText(searchField, text);
        searchField.sendKeys(Keys.ENTER);
    }
}

