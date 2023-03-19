package class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws IOException, IOException {
// **
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
// **
                // Username Text Box
                WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");
        // Password field
        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test");
        // Take screenshot.
        TakesScreenshot ss = (TakesScreenshot) driver;// declaration
        // Take the screenshot as a file.
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);// in this step I am calling the screenshot method(getScreenshotAs), I have to specify what kind of screenShot format, it should be File for now! and I can save it in a variable I call it File sourceFile
        //this sourceFile shouldn't print it but save it by
        System.out.println(sourceFile);
        // Save the file in computer.
        FileUtils.copyFile(sourceFile, new File("/Users/rquiaidbella/IdeaProjects/SeleniumTest/screen/iou.png"));

    }
}
