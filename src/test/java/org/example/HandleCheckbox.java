package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckbox {

    public static void main(String[] args){
       WebDriver driver=new ChromeDriver();
        driver.get("https://www.qa-practice.com/elements/checkbox/mult_checkbox");
        List<WebElement> allOptions=driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(allOptions.size());


        //using for loop

      //  for(int i=0;i<allOptions.size();i++)
        //{

          //  allOptions.get(i).click();
        //}

        //using for each loop

        for(WebElement opt:allOptions) ///individual read the each and every value so dont use the index
        {
            opt.click();
        }

    }
}
