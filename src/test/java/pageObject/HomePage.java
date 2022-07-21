package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.fail;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@class = 'show-search']")
    public WebElement showSearchButton;

    @FindBy(css = ".header-search #s")
    public WebElement searchField;

    public HomePage(WebDriver driver)  {
        super(driver);
        driver.get("https://itea.ua/uk/");
    }


    public void typeSearchTerm (String text) {

        searchField.sendKeys(text);
        searchField.sendKeys(Keys.ENTER);

    }

}
