package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleDropdown {
    static WebDriver driver;
    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://orangehrm.com/contact-sales");
        WebElement countrydrp = driver.findElement(By.id("Form_getForm_Country"));
        Alloptionsdrp(countrydrp,"Armenia");

        WebElement emloyeedrp = driver.findElement(By.name("NoOfEmployees"));
        Alloptionsdrp(emloyeedrp,"200 - 1,000");
    }
        public static void Alloptionsdrp(WebElement element,String value){

        Select sldrp=new Select(element);
        List<WebElement> options=sldrp.getOptions();
        for(WebElement getOptions:options)
        {
            if(getOptions.getText().equals(value)){
                getOptions.click();
                break;
            }
        }





    }

}
