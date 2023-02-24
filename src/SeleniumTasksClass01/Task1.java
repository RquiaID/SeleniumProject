package SeleniumTasksClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /**
     * 1. launch the browser
     * 2. navigate to amazon web site
     * 3. print out the title and the url in the console
     * 4. close the browser
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //get the current url that is there in the browser.
        String URL = driver.getCurrentUrl();
        // print out the url.
        System.out.println(URL);
        String title=driver.getTitle();
        System.out.println("The title of the page is " + title);
        driver.close();
    }
}
