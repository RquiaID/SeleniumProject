package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {

        // connect it to webDriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        // go to google.com
        driver.get("https://www.google.com/");

        //maximize the window
        driver.manage().window().maximize();

        // full screen
        driver.manage().window().fullscreen();

        //close
        driver.close();
    }
}
