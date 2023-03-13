package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1459578604%3A1678243041588103&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHcGqJT7T_3wPfiXCBZlSAlDUlH9ckSxzMUveBMYzGAtJ-wDcncnFy33K4O9L8lVsTO2aNAZRw%22");
        // click on help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();
       // find privacy button
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        //get the window handle of parent window

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);

//        get window handles of all the windows that have been opened up
        Set<String> windowHandles = driver.getWindowHandles();
//        print all the window handles
        for (String wh : windowHandles) {

            // switch the focus of the driver to help window
            driver.switchTo().window(wh);
            // check the title of the window to which our focus is right now
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")) { // to get title inspect the page and type title always under the title tag
                break;
            }
        }
        // to verify we switched to the right window;
        System.out.println(driver.getTitle());

    }
}







