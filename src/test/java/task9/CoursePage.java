package task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CoursePage extends BasePage {

    WebDriverWait wait;

    public CoursePage(WebDriver driver) {
        super(driver);
        driver.get("https://itea.ua/uk/courses_itea/qa_roadmap/qa_auto/");
        wait = new WebDriverWait(driver, 10);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
