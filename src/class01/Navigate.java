package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException { // this class is not connected to webDriver yet, we have to connect it, we have to use :
                                              // this is my own path
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // initiate the instance of Webdriver

        WebDriver driver=new ChromeDriver();
        // open google.com
        driver.get("https://www.google.com/");

        // If I want to slow it down
        Thread.sleep(2000);

        // now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");

        //slow down
        Thread.sleep(2000);

        // go back
        driver.navigate().back();

        //slow down
        Thread.sleep(2000);

        // go to facebook
        driver.navigate().forward();

        // slow down
        Thread.sleep(2000);

        // if I want to refresh my page
        driver.navigate().refresh();

        // close the browser

        driver.close();


    }
}
