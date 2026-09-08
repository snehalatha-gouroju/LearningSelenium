package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicTable_2 {

   public static void main(String[] args){

       WebDriver driver =new ChromeDriver();



       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       driver.get("https://practice.expandtesting.com/dynamic-table");

       List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
       System.out.println(rows.size());

       for(int r=1;r<=rows.size();r++)
       {
           WebElement names=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+r+"]/child::td[1]"));
           //System.out.println(res.getText());
           if(names.getText().equals("Chrome"))
           {
              //driver.findElement(By.xpath("//td[normalize-space( )='Chrome']"));

             String CPULoad=driver.findElement(By.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(), '%')]")).getText();

             String value=driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
             if(value.contains(CPULoad))
             {
                 System.out.println("the CPU load of Chrome is equal:" +CPULoad);
             }
             else
             {
                 System.out.println("the CPU load of Chrome not equal." +CPULoad);
             }
             break;

           }

       }
       
   }
   //table[@class='table table-striped']/tbody/tr/child::td[1]
}
