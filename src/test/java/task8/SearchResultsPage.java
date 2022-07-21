package task8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage{

    public SearchResultsPage (WebDriver driver){

        super(driver);
    }
    @FindBy (xpath = "(//a[contains(text(),\'ПОДРОБНЕЕ\')])[2]")
    WebElement moreDetailsButton;

    public void clickMoreDetailsButton() {
        moreDetailsButton.click();
    }
}
