package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        // open some website
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();

        // open smart bear
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        //find the username ==.here we are finding webElement it will return us a webElement
       // we learned methods in java  there is a possibility to return
        // this findElement is a method and xpath is a parameter that will have a return type which webElement
       WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]"));

       username.sendKeys("Tester");

       // find password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");

        // clear the username text box
        username.clear();

       // to get the text username which is beside
        WebElement usernameText=driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

      //get the text password which is beside the password text box
        WebElement passwordText = driver.findElement(By.xpath("//label[text()='Password:']"));
        String pasText = passwordText.getText();
        System.out.println(pasText);



    }
}
