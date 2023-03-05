package SeleniumTasksClass04;

/*Hw2:
        goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        1. u need to write down the code that can select  1 check box out of 4 mentioned,
        e.g option1 , option2 , option 3, option 4*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioBtnTask2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        List<WebElement> CheckOptions = driver.findElements(By.cssSelector("input.cb1-element"));
        for (WebElement option : CheckOptions) {
            String Op = (option.getAttribute("value"));
            if (Op.equalsIgnoreCase("Option-2")) {
                option.click();
                break;

            }

        }


    }
}


