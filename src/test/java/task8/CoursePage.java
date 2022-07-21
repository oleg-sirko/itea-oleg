//This is that new right page
package task8;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class CoursePage extends BasePage{

    public CoursePage (WebDriver driver){
        super(driver);
    }
    public void CheckTheTitle(String text){
        String actualTitle = driver.getTitle();
        System.out.println("The title is: "+actualTitle);
        assertEquals(actualTitle, text);
   }
}
