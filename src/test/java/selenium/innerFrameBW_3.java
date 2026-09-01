package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class innerFrameBW_3 {
    public static void main(String[] args) throws  InterruptedException{
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        driver.switchTo().frame("iframeResult");
        driver.switchTo().frame (0);

        WebElement text=driver.findElement(By.xpath("//h1[normalize-space()='This page is displayed in an iframe']"));
        String heading=text.getText();

        System.out.println("inner frame heading is:"+heading);


      //driver.switchTo().defaultContent();
      Thread.sleep(3000);

        driver.switchTo().parentFrame();

        // OR driver.switchTo().frame("iframeResult");
       WebElement text2=driver.findElement(By.xpath("//h2[normalize-space( )='HTML Iframes']"));

       String outerheading=text2.getText();
       System.out.println("outer frame heading is:"+outerheading);

       WebElement text3=driver.findElement(By.xpath("//p[text()='You can use the height and width attributes to specify the size of the iframe:']"));
       String paraHeading=text3.getText();
       System.out.println("outer frame paragraph:"+paraHeading);





    }
}
