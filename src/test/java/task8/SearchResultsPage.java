package task8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage {
    public WebDriver driver;

    public void SearchResultsPage (WebDriver driver){
        this.driver = driver;
    }
    @FindBy (xpath = "(//a[contains(text(),\'ПОДРОБНЕЕ\')])[2]")
    WebElement moreDetailsButton;

    public void clickMoreDetailsButton(){
        moreDetailsButton.click();
    }
}
