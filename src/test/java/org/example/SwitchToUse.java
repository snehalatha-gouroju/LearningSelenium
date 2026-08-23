package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SwitchToUse {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        String windowID=driver.getWindowHandle();
        System.out.println(windowID);

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set<String> windowsIDs=driver.getWindowHandles();
        //System.out.println(windowsIDs);



        //1.iterator():
        /*
        Iterator<String> var=windowsIDs.iterator();
        String parentID=var.next();
        String childID =var.next();
        System.out.println("parent window id is:"+parentID);
        System.out.println("Child window ID is:"+childID);

         */


        //2. By using the List/ArrayList method..

        /*
        List<String> windowsIDList=new ArrayList<>(windowsIDs);

        String parentWindowID=windowsIDList.get(0);

        String childWindowID=windowsIDList.get(1);


        System.out.println("parent window id is:" +parentWindowID);

        System.out.println("child window id is :" +childWindowID);

     */

     //SHORT METHOD USING FOR LOOP

        for(String winID:windowsIDs)
        {
           // System.out.println(winID);  PRINTING

            String title=driver.switchTo().window(winID).getTitle();

            System.out.println(title);

        }

       






    }
}
