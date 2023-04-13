package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) {

/*      public static ChromeOptions options;
      public static WebDriver driver;

      options =new chromeOptions();
      options.addArgument("--start-maximized");
      options.addArgument("--remote-allow-origins=*");*//**//*
       driver = new ChromeDriver(options);*//*
      driver.get  */




//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to amazon
        driver.get("https://www.amazon.com/");
        WebElement en =driver.findElement(By.xpath("//div[text()='EN']"));

        //is a statement in Selenium that creates an instance of the Actions class
        // and assigns it to a variable called action.
        Actions action=new Actions(driver);

        //is a method in Selenium's Actions class used to move the mouse pointer
        // to a specified web element en and perform a click on it.
        action.moveToElement(en).perform();
    }
}
