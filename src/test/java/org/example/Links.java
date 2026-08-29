package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.time.Duration;
import java.util.List;

public class Links {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_6j7dxt8smw_e&adgrpid=155259814793&hvpone=&hvptwo=&hvadid=815461303100&hvpos=&hvnetw=g&hvrand=16025823195663727839&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9147007&hvtargid=kwd-12692811&hydadcr=5624_2502632&mcid=2eddf1671aed3e48b3f2a2fd21f6c06d&hvocijid=16025823195663727839--&hvexpln=nav&gad_source=1");

        //driver.findElement(By.linkText("Today's Deals")).click();

        driver.findElement(By.partialLinkText("Today's")).click();


        //how to capture the all the links

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System .out.println("no of links present:" +links.size());


        //normal for loop


       /* for(int i=0;i<=links.size();i++)
        {
           System.out.println(links.get(i).getText());
            System.out.println(links.get(i).getAttribute("href"));
        }

        */


        //by using for each loop


        for (WebElement link : links) {
            System.out.println(link.getText());
            System.out.println(link.getDomAttribute("href"));

        }

        //by using for each loop




    }
}
