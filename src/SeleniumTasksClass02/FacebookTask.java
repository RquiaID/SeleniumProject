package SeleniumTasksClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask {
    public static void main(String[] args) throws InterruptedException {
        /*
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser

         */

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Angel");
        driver.findElement(By.name("lastname")).sendKeys("Wisher");
        driver.findElement(By.name("reg_email__")).sendKeys("Angelwisher@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Angelwisher@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("123456");
        driver.findElement(By.name("birthday_month")).sendKeys("01");
        driver.findElement(By.id("day")).sendKeys("01");
        driver.findElement(By.id("year")).sendKeys("1996");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.linkText("Sign Up")).click();
        driver.quit();


    }
}
