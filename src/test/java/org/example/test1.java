package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    public static void main(String[] args){

       WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        WebElement var = driver.findElement(By.xpath("//input[@name='search_query']"));
        var.sendKeys("Selenium Tutorial");

    }
}
