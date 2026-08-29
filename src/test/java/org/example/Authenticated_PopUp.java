package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Authenticated_PopUp {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       // driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        WebElement infoAlert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));

        infoAlert.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert=driver.switchTo().alert();
        String textOnAlert=alert.getText();  //alert gettext command
        System.out.println(textOnAlert);
        //Thread.sleep(3000);
        alert.accept();

        driver.switchTo().defaultContent(); //command
        WebElement textRes=driver.findElement(By.id("result"));

        String msg=textRes.getText();  //webelement gettext command

        Thread.sleep(3000);

        System.out.println(msg);

        driver.quit();

















    }
}
