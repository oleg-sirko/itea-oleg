package task8;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    public WebDriver driver;

    @FindBy (xpath = "//button[contains(.,\'Пошук\')]" )
    WebElement showSearchButton;
    @FindBy(xpath = "(//form[@id=\'searchform\']/input)[3]")
    WebElement searchField;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://itea.ua/uk/");
        driver.manage().window().setSize(new Dimension(1440, 790));
    }
    public void clickShowSearchButton(){
        showSearchButton.click();
    }
    public void typeSearchTerms(String text){
        searchField.sendKeys(text);
        searchField.sendKeys(Keys.ENTER);

    }
}
