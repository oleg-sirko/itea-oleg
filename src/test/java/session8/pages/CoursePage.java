package session8.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursePage extends BasePage {
    public CoursePage (WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//a[text()='Курси автоматизованого тестування в Києві | ITEA'] ")
    public String title;

    public String getTitle() {
        String title = driver.getTitle();
        return title;
    }

   }