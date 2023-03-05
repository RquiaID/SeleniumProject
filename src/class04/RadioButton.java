package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // Not exe for Mac

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();

       // go to syntax.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

     // click on the radio button
        WebElement femaleBtn =driver.findElement(By.cssSelector("input[value='Female']"));

        //check if the radio button is enabled
       boolean isEnableFemale= femaleBtn.isEnabled();
        System.out.println("the radio button female is enabled "+isEnableFemale);

        // check if the radio button is Displayed
       boolean isDisplayed=femaleBtn.isDisplayed();
        System.out.println("the radio button female is displayed "+isDisplayed);

        // check if the radio button is Selected

                // declaring variable//
        boolean isSelectedFemale=femaleBtn.isSelected();
        System.out.println("the female button is selected "+ isSelectedFemale); //false because we have not clicked on it

        // if the radio button is not selected click on it
          if(!isSelectedFemale){
              femaleBtn.click();
          }

        // check if the radio button is selected after the click
        isSelectedFemale=femaleBtn.isSelected();
        System.out.println("the status of selection is "+ isSelectedFemale);


        femaleBtn.click();


    }
}
