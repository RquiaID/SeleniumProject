package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

            // create an instance of WebDriver
            WebDriver driver = new ChromeDriver();
            // max the window
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
            // click on the button create account using Css selector
        // I can also same it in a variable we can call it createNewBtn return element will be WebElement
        WebElement createNewBtn=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        // click on the button
        createNewBtn.click();

        //sleep
        Thread.sleep(2000); // if we don't write this the username will not be there.
        // fill in the first name
      WebElement firstname = driver.findElement(By.cssSelector("input[name='firstname']"));
      // Sending keys to a text box
      firstname.sendKeys("Rquia");
    }
}
