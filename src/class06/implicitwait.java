package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitwait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // it is suggested to put it after maximize before you start locating any other element
        // go to fb
        driver.get("https://www.facebook.com");
        //click on the create new account
        driver.findElement(By.linkText("Create new account")).click();
        // send your first name
        driver.findElement(By.name("firstname")).sendKeys("abracadabra");
    }
}
