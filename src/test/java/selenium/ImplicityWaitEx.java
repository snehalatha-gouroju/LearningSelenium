package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicityWaitEx {

    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.youtube.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("selenium");


        driver.findElement(By.xpath("//span[text()=' tutorial for beginners']")).click();



    }
}
