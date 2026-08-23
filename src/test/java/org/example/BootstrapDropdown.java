package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.io.InterruptedIOException;
import java.time.Duration;
import java.util.List;

public class BootstrapDropdown {

    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hdfc.bank.in/");
       //Thread.sleep(5000);
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.findElement(By.xpath("//div[contains(text(),'Select Product Type')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Select Product Type')]")).click();
        List<WebElement> productType= driver.findElements(By.xpath("//div[@class='selector-wraplist productType option-box active']//li"));
        System.out.println("num of options:" +productType.size());
        for(WebElement options:productType)
        {
            if(options.getText().equals("Accounts"))
            {
                options.click();
                break;
            }
        }

        driver.findElement(By.xpath("//div[@class='selector-wraplist products option-box']")).click();
        List<WebElement> second=driver.findElements(By.xpath("div[@class='selector-wraplist products option-box active']//li"));
        //List<WebElement> second=driver.findElements(By.xpath("div[@class='selector-wraplist products option-box active']//li"));


        System.out.println("no of second options:"+second.size());

       for(WebElement secDrp:second)
       {
           if(secDrp.getText().equals("Current Accounts"))
           {
               secDrp.click();
                break;
            }
        }
    }
}


