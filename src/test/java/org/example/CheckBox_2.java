package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox_2 {

    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        //driver.findElement(By.xpath("//input[@id='sunday']")).click();
        List<WebElement> allOptions=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        for(WebElement res:allOptions)
        {
            res.click();
        }
    }
}
