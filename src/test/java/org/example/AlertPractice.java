package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertPractice{
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();

        //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        //wait.until(ExpectedConditions.alertIsPresent());

        driver.get("https://demo.automationtesting.in/Alerts.html");
           Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();


    }
}
