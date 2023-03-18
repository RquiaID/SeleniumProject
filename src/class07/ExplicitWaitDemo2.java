package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to syntax projects.com
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        // after the url we have to locate the webElement which is click on alert button
        driver.findElement(By.xpath("//button[@id='alert']")).click();

//        wait until the alert is present
//        1.
        WebDriverWait wait = new WebDriverWait(driver, 20);

        //This statement instructs the WebDriver to wait for
        // an alert to be present on the web page before proceeding with the next step in the test script.

        wait.until(ExpectedConditions.alertIsPresent());

        //is a statement in Selenium WebDriver that accepts the alert present on the web page.

        driver.switchTo().alert().accept();
    }
}
