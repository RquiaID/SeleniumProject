package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        // First thing you need to tell your project where the webDriver is located.
        // for Mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        // open up fb.com
        driver.get("https://www.facebook.com/");

        // send in the username( I have to find the code that is associated with that webElement with the help of locator id)
        driver.findElement(By.id("email")).sendKeys("Rquia");

        //send the password(I have to find the code associated with webElement with the help of operator name and values remember it is case-sensitive)

        driver.findElement(By.name("pass")).sendKeys("abracadabra");
        //click on the button create New account

      //  driver.findElement(By.linkText("Create new account")).click();  ===> we comment this ,so we can practice forgot password

     //click on forgotten password
       driver.findElement(By.partialLinkText("password?")).click();
        driver.quit();
    }
}
