package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.chrono.ChronoPeriod;
import java.util.ArrayList;
import java.util.List;

public class SortedDropdown {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://orangehrm.com/contact-sales");
        driver.findElement(By.name("Country")).click();
        WebElement alloptions = driver.findElement(By.id("//div[@id='Form_getForm_Country_Holder']"));
        Select drpselect = new Select(alloptions);
        List<WebElement> opt = drpselect.getOptions();
        //System.out.println(alloptions.size());
        ArrayList ol = new ArrayList();
        ArrayList tl = new ArrayList();


        for(WebElement all:opt)
        {
            ol.add(all.getText());
            tl.add(all.getText());
        }

        System.out.println("ol is:"+ol);
        System.out.println("tl is:"+tl);


    }
}
