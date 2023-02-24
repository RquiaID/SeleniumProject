package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        // First thing you need to tell your project where the webDriver is located.
       // for Mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

     // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

    // open the website facebook.com
        driver.get("https://www.facebook.com/");

        //get the current url that is there in the browser.
        String URL = driver.getCurrentUrl();
        // print out the url.
        System.out.println(URL);

        // get the title of the webpage.
        String title=driver.getTitle();
        System.out.println("The title of the page is " + title);
        Thread.sleep(3000);

        // close the browser.
        driver.quit();





    }
}