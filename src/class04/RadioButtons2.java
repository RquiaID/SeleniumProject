package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();

        // go to syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        // find all the age group radio buttonS
        // the xpath here is common to all the webElement that have age group
        List<WebElement> radioBtns=driver.findElements(By.xpath("//input[@name='ageGroup']"));
        //iterate over the list to see your desired one
        for(WebElement radioBtn:radioBtns){
            String age=(radioBtn.getAttribute("value"));// I have to find the attribute that help me to differentiate between them

            //if the value of the webElement is 5-10 click on
            if(age.equalsIgnoreCase("0 - 5")){
                radioBtn.click();

            }
        }
    }
}
