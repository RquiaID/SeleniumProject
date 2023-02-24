package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) {
        // First thing you need to tell your project where the webDriver is located.
        // for Mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

       // open up the website
       driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
       driver.manage().window().maximize();


       // send the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        // send the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        // click on the login button
        driver.findElement(By.className("button")).click();
    }
}
