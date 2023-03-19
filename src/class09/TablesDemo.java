package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesDemo {
    public static void main(String[] args) {


//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
//        Go to syntax HRMS APP AND LOGIN AND GO TO THE PIM OPTION
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();

//        ------------------------

//        get the employee id 52396A  and click on the checkbox associated with it


        boolean idFound = false;
        while (!idFound) {

//in order to find the desired id, I have to place list with loop so, it does not discarded when DOM is refreshes
// as DOM is refreshed after the click on next page, so we find elements in the loop
            List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for (int i = 0; i < ids.size(); i++) { // look for first page
                String id = ids.get(i).getText();

                if (id.equalsIgnoreCase("52097A")) {

                    System.out.println("id is on the row " + i);
//                to click on the particular checkbox

                    //if I want to click on a particular check box I have to go to DOM and observe and write down xpath that select all checkboxes then from there see which index is correct for my desired checkbox
                    //Remember List always starts from 0 but Table starts with 1 its index difference
                    // The difference between indexing and actual rows is +1 in this case when checking DOM.
                   // to click on the particular checkbox
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    idFound = true;
                    break; //  the inner loop will break
                }
            }


            //if I want to get my desired id I have to get the text first then if

            //if I want to click on a particular check box I have to go to DOM and observe and write down xpath that select all checkboxes then from there see which index is correct
            //Remember List always starts from 0 but Table starts with 1 its index difference
            // The difference between indexing and actual rows is +1 in this case when checking DOM.
            // the whole previous code is to check the first page
            // now I need to click on the next page

            //click on the next page

            if (!idFound) {   // this will check if the value is true if so it will not execute
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
                // now we want the same steps to be repeated for the second page as well
                //I have to go back to line 45


            }
        }
    }}

