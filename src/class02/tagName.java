package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {

            // First thing you need to tell your project where the webDriver is located.
            // for Mac user please do not use .exe with chromedriver
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

            // create an instance of WebDriver
            WebDriver driver = new ChromeDriver();
            //maximize
            driver.manage().window().maximize();
            //go to amazon

            driver.get("https://www.amazon.com/");

            //print all the links in the amazon.com

            driver.findElements(By.tagName("a"));
        }
    }

