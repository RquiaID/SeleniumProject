package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to Amazon.com
        driver.get("https://www.amazon.com/");
        //get all the links which are all in the tag<a> which is also called anchor tag
        // lets use the locator By tagName for this purpose

        List<WebElement> tags=driver.findElements(By.tagName("a"));
        //in order to print we need to iterator it
        for(WebElement tag:tags){ // WebElement is a String
          String link =tag.getAttribute("href");
            System.out.println(link);
        }

    }

}
