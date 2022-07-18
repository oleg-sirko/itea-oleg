package pageObject;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.fail;

public class BasePage {
    public WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    public void clickOnElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        catch (TimeoutException e){
            fail(element.toString() + " is not clickable" );
        }
        element.click();
    }

    public boolean isElementVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        }
        catch (TimeoutException e){
            return false;
        }
        return true;
    }
}

