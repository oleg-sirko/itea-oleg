package task8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    WebDriverWait wait;
    public String title;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void clickButton(WebElement button) {
        wait.until(ExpectedConditions.elementToBeClickable(button));
        {
            Actions builder = new Actions(driver);
            builder.moveToElement(button, 0, 0).perform();
        }
        button.click();
    }

    public void typeText(WebElement field, String text) {
        wait.until(ExpectedConditions.visibilityOf(field));
        {
            Actions builder = new Actions(driver);
            builder.moveToElement(field, 0, 0).perform();
        }
        field.sendKeys(text);
        wait.until(ExpectedConditions.textToBePresentInElementValue(field, text));
    }
}
