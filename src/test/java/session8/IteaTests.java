 package session8;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import session8.pages.BasePage;
import session8.pages.CoursePage;
import session8.pages.HomePage;
import session8.pages.SearchResultsPage;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class IteaTests extends BasePage {

    public IteaTests(){
        super();
    }


    @Test
    public void searchTest() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickButton(homePage.showSearchButton);
        homePage.typeSearchTerm("qa automation");


        SearchResultsPage searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
        searchResultsPage.clickButton(searchResultsPage.moreDetailsButton);

        String actualTitle = driver.getTitle();

        String expectedTitle = "Курси автоматизованого тестування в Києві | ITEA";
        assertEquals(actualTitle, expectedTitle);
        System.out.println(" Курси автоматизованого тестування в Києві | ITEA - Тайтл вірний");
    }

    @Test
    public void openChildrenCourses () {
        //click on Дитячі Курси link
        HomePage homePage = PageFactory. initElements(driver, HomePage.class);
        homePage.clickButton(homePage.childrenCoursesLink);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Комп'ютерні курси для дітей в Києві, курси програмування для дітей ITEAKiDS";
        assertEquals(actualTitle, expectedTitle);
        System.out.println(" Комп'ютерні курси для дітей в Києві, курси програмування для дітей ITEAKiDS - Тайтл вірний");
    }

    @Test
    public void Courses () {
    CoursePage coursePage = new CoursePage(driver);

    String title1 = driver.getTitle();
        assertEquals(" Курси програмування та веб-дизайну в Києві | ITEA ", title1); // (ex; act)
        System.out.println();
    }

}
