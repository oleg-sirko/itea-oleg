package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage extends BasePage {

    @FindBy(css = "div:nth-child(3) > .btn")
    public WebElement moreDetailsLink;

    public SearchResultsPage(WebDriver driver)  {
        super(driver);
    }

    public void clickMoreDetailsLink(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(moreDetailsLink));
        {
            Actions builder = new Actions(driver);
            builder.moveToElement(moreDetailsLink, 0, 0).perform();
        }
        moreDetailsLink.click();
    }

}
