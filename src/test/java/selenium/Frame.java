package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.id("name")).sendKeys("text1");


        driver.switchTo().frame("frm1");

        WebElement course=driver.findElement(By.id("course"));
        Select option=new Select(course);
        option.selectByVisibleText("Java");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frm2");

        WebElement namefield=driver.findElement(By.id("//input(@id='firstName']"));

        namefield.sendKeys("sneha");
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frm1");

        option.selectByVisibleText("Dot Net");

        driver.switchTo().defaultContent();

        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("text2");












    }
}
