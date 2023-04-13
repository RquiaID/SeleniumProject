package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesDynamicPracticeM {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        // enter the username in the text box
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        //enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        //  click on login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        //task:check the checkbox containing the product screensaver
        //This line finds all the cells in the third column of a table with a class name of "SamplteTable".
        // The cells are represented as a list of WebElement objects and stored in the column variable.
        List<WebElement> column = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

        //iterate through each to see if it contains screensaver
        //This line starts a loop that iterates over each cell in the column list.

        for (int i = 0; i < column.size(); i++) {


           //  I have to extract the text first before if condition
            //This line extracts the text content of the current cell in the loop and stores it in the text variable.
            String text = column.get(i).getText();
            //This line checks if the text variable is equal to "ScreenSaver",
            // ignoring case. If it is, the code inside the block is executed.
            if (text.equalsIgnoreCase("ScreenSaver")) {
                //This line prints the text variable to the console.
                System.out.println(text);
                //This line prints a message to the console indicating that the checkbox will be checked
                System.out.println("the row that contains ScreenSaver is "+i); //this will help us find the correct index location of the row or column cuz loop index starts from 0 while  table starts from 1
                System.out.println("the row that contains ScreenSaver is "+(i+2));
                System.out.println("check the check box");
                // to select the specific checkbox , was found on 0 according to loop, but I added 2 cuz table starts with 1
                // So far I have built up a dynamic xpath using this
                WebElement checkbox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i + 2) + "]/td[1]"));
                checkbox.click();



            }
        }
    }
}
