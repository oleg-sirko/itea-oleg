package task8;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy (xpath = "//button[contains(.,\'Пошук\')]" )
    WebElement showSearchButton;
    @FindBy(xpath = "(//form[@id=\'searchform\']/input)[3]")
    WebElement searchField;
    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://itea.ua/uk/");
        driver.manage().window().setSize(new Dimension(1440, 790));
    }
    public void typeSearchTerm (String text) {

        searchField.sendKeys(text);
        searchField.sendKeys(Keys.ENTER);

    }

    public void clickShowSearchButton() {

        showSearchButton.click();
    }
}
