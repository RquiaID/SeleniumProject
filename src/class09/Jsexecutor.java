package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexecutor {
    public static void main(String[] args) {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to amazon.com
        driver.get("https://amazon.com");
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //find the webElement
        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        // using js Executor
        // declaring instance of javascript executor
        // it is a method to use whenever we need to type in or execute any script
        //1. declare instance
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //2. execute script
        // a script is just a code that is going to be in language called javascript
        //arguments[0].style.border='10px dotted pink'" draw box
        //arguments[0].style.border=5px solid blue'"
        // we can change it
       js.executeScript("arguments[0].style.border='5px dotted blue'",username);

       //find the WebElement to login
        WebElement loginBtn= driver.findElement(By.xpath("//input[@id='btnLogin']"));

       // click the login button
        js.executeScript("arguments[0]. click();",loginBtn);


    }
}
