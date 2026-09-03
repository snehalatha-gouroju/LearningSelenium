package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicityWait {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");

        driver.findElement(By.xpath("//button[normalize-space( )='Dropdown']")).click();

       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement clickable=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));
        clickable.click();
        //driver.findElement(By.xpath("//a[text()='Flipkart']")).click();

    }
}
