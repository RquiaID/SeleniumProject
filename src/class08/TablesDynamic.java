package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesDynamic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
//        enter the username in the text box
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
//        enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

//        click on login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        //task:check the checkbox containing the product screensaver
        List<WebElement> column =  driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

        //iterate through each to see if it contains screensaver
        for(int i=0;i<column.size();i++){

//            extract the text
            String text = column.get(i).getText();
            if(text.equalsIgnoreCase("ScreenSaver")){
                System.out.println(text);
                System.out.println("check the check box");
                // I have built up dynamic path using this



            }


        }

    }
}
