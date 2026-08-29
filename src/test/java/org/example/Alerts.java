package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        //alert with OK button..
        Thread.sleep(3000);
        //driver.switchTo().alert().accept();  //close the button by using ok button


        /*
        // alert window with OK and Cancel button

        driver.findElement(By.xpath("//button[normalize-space( )='Click for JS Confirm']")).click();

        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();

         */
        //ALERT WITH INPUT BOX ,CAPTURE THE TXT IN THE ALERT

        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(3000);
        Alert alertWindow=driver.switchTo().alert();
        System.out.println("the msg displayed on alert:" +alertWindow.getText());

        alertWindow.sendKeys("welcome");


        //Thread.sleep(3000);
        alertWindow.accept();

        //Thread.sleep(3000);





    }
}
