package session8;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import session8.pages.BasePage;
import session8.pages.CoursePage;
import session8.pages.HomePage;
import session8.pages.SearchResultsPage;

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

        //String actualTitle = driver.getTitle();
            CoursePage coursePage = PageFactory.initElements(driver, CoursePage.class);

            //Verify Title is as expected
            String actualTitle = coursePage.getTitle();
            String expectedTitle = "Курси автоматизованого тестування в Києві | ITEA";
            assertEquals(actualTitle, expectedTitle);
    }

  /* @Test
    public void openChildrenCourses () {
        //click on Дитячі Курси link
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickButton(homePage.childrenCoursesLink);

        // Verify Title is Комп'ютерні курси для дітей в Києві, курси програмування для дітей ITEAKiDS
        String actualTitle = driver.getTitle();
        String expectedTitle = "Комп'ютерні курси для дітей в Києві, курси програмування для дітей ITEAKiDS";
        assertEquals(actualTitle, expectedTitle);
    } */
}
