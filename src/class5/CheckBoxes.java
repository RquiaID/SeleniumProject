package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();

        // got to syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        //get all the checkboxes
        driver.findElements(By.xpath("//input[@class=cb1-element]"));

 // ChechitHub


        }


    }

