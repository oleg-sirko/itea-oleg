package Task8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.WatchEvent;

public class SearchResultsPage extends BasePage {

    @FindBy (css = "div:nth-child(3) > .btn")
    WebElement moreDetailsButton;

    public SearchResultsPage(WebDriver driver) {
        super (driver);
    }

    public void clickMoreDetailsButton () {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(moreDetailsButton));
        {
            Actions builder = new Actions(driver);
            builder.moveToElement(moreDetailsButton, 0, 0).perform();
        }
        moreDetailsButton.click();


    }

}
