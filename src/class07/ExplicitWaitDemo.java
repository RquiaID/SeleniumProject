package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to syntax projects.com
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        // click on the start button
        driver.findElement(By.xpath("//button[@id='startButton']")).click();
        // as the element that contains text becomes visible after some
        // time, so first we need to implement the Explicit wait and then get the text

        // after clicking we need to put wait to implement it we need to write
        // declaration of this wait 20 is the max wait
        // if 20 seconds has past it's going to say ElementNotFound
        WebDriverWait wait = new WebDriverWait(driver, 20);

        // this is to find a text webElement, ih here we are waiting for that particular element to be visible in the parameters we pass
        // the locator for the webElement we are putting a condition on which is the text we are looking for
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));

        // once the element is visible then get the text
        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String WelcomeText = text.getText();
        System.out.println(WelcomeText);


    }
}
