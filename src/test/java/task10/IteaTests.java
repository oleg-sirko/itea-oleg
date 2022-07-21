package task10;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import task10.pages.BasePage;
import task10.pages.CoursePage;
import task10.pages.HomePage;
import task10.pages.SearchResultsPage;

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

        CoursePage coursePage = PageFactory.initElements(driver, CoursePage.class);
        String actualTitle = coursePage.getTitle();

        //Verify Title is as expected
        String expectedTitle = "Курси автоматизованого тестування в Києві | ITEA";
        assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void openChildrenCourses () {
        //click on Дитячі Курси link
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickButton(homePage.childrenCoursesLink);

        // Verify Title is Комп'ютерні курси для дітей в Києві, курси програмування для дітей ITEAKiDS
        String actualTitle = driver.getTitle();
        String expectedTitle = "Комп'ютерні курси для дітей в Києві, курси програмування для дітей ITEAKiDS";
        assertEquals(actualTitle, expectedTitle);
    }
}
