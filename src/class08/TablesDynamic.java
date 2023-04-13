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
            if(text.equalsIgnoreCase("FamilyAlbum")){
                System.out.println(text);
                // "i" is the entety that show me which row number ScreenSaver is
               System.out.println("the row that contains FamilyAlbum is "+i); //this will help us find the correct index location of the row or column cuz loop index starts from 0 while  table starts from 1
                System.out.println("the row that contains FamilyAlbum is "+(i+2));
                System.out.println("check the check box");

                WebElement checkbox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i + 2) + "]/td[1]"));
                checkbox.click();

                // //table[@class='SampleTable']/tbody/tr[" + (i + 2) + "]/td[1] this xpath will check all checkboxes



            }


        }

    }
}
