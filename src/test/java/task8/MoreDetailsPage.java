//forget about this page, I made a new one
package task8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import javax.annotation.CheckReturnValue;

import static org.junit.Assert.assertEquals;

public class MoreDetailsPage {
    public WebDriver driver;

    public void MoreDetailsPage (WebDriver driver){
        this.driver = driver;
    }
    //@FindBy(xpath = "/html/head/title")
    //WebElement checkTheTitle;
    public void CheckTheTitle(String text){
        //String url = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();
        //checkTheTitle = driver.findElement(By.xpath("/html/head/title"));
        //String actualTitle = checkTheTitle.getAttribute("title");
        System.out.println(actualTitle+"text");
        assertEquals(actualTitle, text);
    }
}
