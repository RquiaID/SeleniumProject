package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSimplePracticeM {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to syntax projects.com
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //task :1 access-level1 --table based access
        // is get the whole table accessed and print it on the console
        // To do so, I have to inspect by writing //table then the xpath on the DOM
        // Better to save it in a variable

        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));

        //The code then retrieves the text content of the table using the getText() method of the WebElement object.
        // This method returns the visible text of the element, including all the text within the table cells.
        String table_data = table.getText();
        // the code prints the table data to the console using the System.out.println() method.
        // This will display the table content as a string in the console.

        System.out.println(table_data);

        //task2:row level access
        // print the row that contains Company google
        // First I need to get the rows in the table then iterate
        //This section retrieves the rows of the table and prints them.
        // It first uses an XPath expression to locate all the rows in the table. It then loops through each row, extracts the text from each row, and prints it to the console.
        // It also checks if the row contains the text "Google" and prints it if it does.
        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        // print the rows
        for (WebElement row : Rows) {
            // extract text from each row
            String row_text = row.getText();
            if (row_text.contains("Google")) {
                System.out.println(row_text);

            }
        }
        // task3: column level access
        //This section retrieves the columns of the table and prints them.
        // It first uses an XPath expression to locate all the cells in the table. It then loops through each cell,
        // extracts the text from each cell, and prints it to the console.
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement column : columns) {
            System.out.println(column.getText());


        }
        // task3: column level access
        //This section retrieves the columns of the table and prints them.
        //This section prints the first column of every row in the table.
        // It uses an XPath expression to locate the first cell in every row of the table. It then loops through each cell and prints its text content to the console.
       List<WebElement>firstColumn= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for(WebElement firstCol:firstColumn){
            System.out.println(firstCol.getText());


        }

    }
}
