package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Web_Table {


    public static void main(String[] args) throws InterruptedException{

        WebDriver driver=new ChromeDriver();

        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://vinothqaacademy.com/webtable/");
        //Thread.sleep(3000);
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='myTable']/tbody/child::tr"));

         System.out.println(rows.size());

    }
}
