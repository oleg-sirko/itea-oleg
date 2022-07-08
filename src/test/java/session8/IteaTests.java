package session8;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;



public class IteaTests extends BasePage{

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

        //Get page Title
        String actualTitle = driver.getTitle();

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
