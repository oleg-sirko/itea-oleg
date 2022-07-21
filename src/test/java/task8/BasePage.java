package task8;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButton(WebElement element){
        element.click();
    }
    public void typeText(WebElement element, String text) {
        element.sendKeys(text);
    }
}
