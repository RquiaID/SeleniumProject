package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendar {
    public static void main(String[] args) {


//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        //go to the website
        driver.get("https://www.delta.com/");

        // Click on the calendar
        WebElement calender = driver.findElement(By.xpath("//span[text()='Depart']"));
        calender.click();

        //1st - Get the month from the calendar.
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        //2nd - Get the next button.
        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

        //3rd - Click on next button until we find the right month.
        //The code then enters a while loop, which will repeat until the correct month is found.
        // The isFound variable is initially set to false to start the loop.
        boolean isFound = false;
        while (!isFound) {

            //Inside the loop, the code retrieves the text of the month web element using the getText() method
            // and stores it in the month variable.

            String monthText = month.getText();
            if (monthText.equalsIgnoreCase("January")) {
                //4th - Select the day.
                //  The code selects the day by finding all the web elements representing days in the calendar
                //  using an XPath expression that finds a elements inside table elements with a class of dl-datepicker-calendar.
              List<WebElement> days= driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']"));

                //  It then iterates over each day element using a for loop and checks if the text of the day matches "20".

                for(WebElement day:days){
                    String dayText=day.getText();

                    //  If a match is found, the code clicks the day element using the click() method,
                    //  sets the isFound variable to true, and breaks out of the loop.
                    if(dayText.equalsIgnoreCase("20")){
                        day.click();
                        isFound=true;
                        break;
                    }
                }
            }
            else {
                // Else block of code is for if it did not find the right month.
                next.click();
            }
        }
    }
}
/*
In summary, this code automates the process of selecting a date on the Delta Airlines website by clicking on the calendar,
navigating to the correct month, and selecting the desired day. The code is written using
the Selenium WebDriver API and uses XPath expressions to locate web elements on the page.
 */
