package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class innerFrameBW_3 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
                driver.switchTo().frame("iframeResult");




    }
}
