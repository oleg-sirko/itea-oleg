package session8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage extends BasePage{

    public SearchResultsPage (WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "div:nth-child(3) > .btn")
    WebElement moreDetailsButton;
}
