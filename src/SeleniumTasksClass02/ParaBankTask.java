package SeleniumTasksClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankTask {
    public static void main(String[] args) throws InterruptedException {
        /*
HW1:
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser

         */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Rquia");
        driver.findElement(By.id("customer.lastName")).sendKeys("ID");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.street")).sendKeys("1000 Fairfax Boulevard");
        driver.findElement(By.name("customer.address.city")).sendKeys(("Falls Church"));
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("21234");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("customer.phoneNumber");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-45-6791");
        driver.findElement(By.name("customer.username")).sendKeys("Ms.RID");
        driver.findElement(By.name("customer.password")).sendKeys("Blanche@@$$%%neige");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Blanche@@$$%%neige");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.close();




    }
}
