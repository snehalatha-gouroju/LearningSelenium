package selenium;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.NoSuchElementException;


public class FluentWait {

    public static void main(String[] args){
        /*
        WebDriver driver=new ChromeDriver(); myWait=new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);


*/

       // driver.get("https://www.youtube.com");

        //driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("selenium");
/*
        WebElement Element=myWait.until(new Function<WebDriver,WebElement>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement driver.findElement(By.xpath("//span[text()=' tutorial for beginners']"));
            }
        });

        Element.click();
*/






    }
}
