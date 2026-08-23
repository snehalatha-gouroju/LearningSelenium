package org.example;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class JQueryDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.manage().window().maximize();
        driver.findElement(By.id("justAnInputBox")).click();



        //selectChoiceValues(driver, "all");

        selectChoiceValues(driver, "choice 2", "choice 2 3", "choice 6", "choice 6 2 1", "choice 6 2");

    }

    public static void selectChoiceValues(WebDriver driver,String... value)
    {
        List<WebElement> choiceList=driver.findElements(By.xpath("//input[@type='checkbox']"));

         if(!value[0].equalsIgnoreCase("all"))
         {
             for(WebElement item:choiceList)
             {
                 String text=item.getText();
                 for(String val:value)
                 {
                     if(text.equals(val))
                     {
                         item.click();
                         break;
                     }
                 }
             }
         }
         else
         {
             for(WebElement item:choiceList)
             {
                 item.click();
             }
         }


    }

}


