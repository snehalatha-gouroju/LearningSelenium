package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
   public static void main(String[] args) {


       WebDriver driver = new ChromeDriver();
       driver.get("https://orangehrm.com/contact-sales");
       WebElement name=driver.findElement(By.id("Form_getForm_FullName"));
       name.sendKeys("sneha");
       WebElement email= driver.findElement(By.id("Form_getForm_Email"));
       email.sendKeys("sneha123@gmail.com");
       WebElement phnum=driver.findElement(By.id("Form_getForm_Contact"));
       phnum.sendKeys("9398286646");
       WebElement var1=driver.findElement(By.id("Form_getForm_Country"));
       Select allOpt1=new Select(var1);
       allOpt1.selectByVisibleText("India");
       WebElement compyName=driver.findElement(By.id("Form_getForm_CompanyName"));
       compyName.sendKeys("IT");
       WebElement title=driver.findElement(By.id("Form_getForm_JobTitle"));
       title.sendKeys("Selenium Automation Testing");
       WebElement var2=driver.findElement(By.id("Form_getForm_NoOfEmployees"));
       Select allOpt2 =new Select(var2);
       List<WebElement> allOptions=allOpt2.getOptions();
       for(WebElement option:allOptions)
       {
           if(option.getText().equals("11 - 50"))
           {
               option.click();
               break;
           }
       }
       driver.findElement(By.id("Form_getForm_Comment")).sendKeys("good Website");


   }
}
