package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDrop {
    public static void main(String[] args) {
        //  for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        // get the element which you want to drag
        WebElement draggable=driver.findElement(By.id("draggable"));

       // find element where I want to drop
        WebElement dropable = driver.findElement(By.id("droppable"));
        // action class first step is always going to be to declare the object
        Actions action =new Actions(driver);
        action.dragAndDrop(draggable,dropable).perform();


    }
}
