package session8.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import session8.pages.BasePage;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage (WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "div:nth-child(3) > .btn")
    public WebElement moreDetailsButton;
}
