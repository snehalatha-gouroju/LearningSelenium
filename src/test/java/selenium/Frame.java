package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.id("name")).sendKeys("text1");


        driver.switchTo().frame("frm1");

        WebElement course=driver.findElement(By.id("course"));
        Select option=new Select(course);
        option.selectByVisibleText("Java");
        Thread.sleep(3000);

        driver.switchTo().defaultContent();
        Thread.sleep(3000);

        driver.switchTo().frame("frm2");

        WebElement namefield=driver.findElement(By.id("firstName"));

        namefield.sendKeys("sneha");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frm1");

        option.selectByVisibleText("Dot Net");
        Thread.sleep(3000);

        driver.switchTo().defaultContent();
        Thread.sleep(3000);

        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("text2");
        Thread.sleep(3000);













    }
}
