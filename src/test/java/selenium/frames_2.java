package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_2 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

        Thread.sleep(30000);
         WebElement outerFrame=driver.findElement(By.xpath("//div[@class='container iframes-page-container']"));
        driver.switchTo().frame(outerFrame);

        Thread.sleep(30000);

        WebElement innerFrame=driver.findElement(By.xpath("//div[@class='iframe-container']"));
        driver.switchTo().frame(innerFrame);
        Thread.sleep(30000);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");






    }
}
