package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Web_Table {


    public static void main(String[] args) throws InterruptedException{

        WebDriver driver=new ChromeDriver();

        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://vinothqaacademy.com/webtable/");
        //Thread.sleep(3000);
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='myTable']/tbody/child::tr"));

         System.out.println("no of rows are:" +rows.size());

        List<WebElement> headings=driver.findElements(By.xpath("//table[@id='myTable']/thead/tr/child::th"));

        System.out.println("no of colunms are:" +headings.size());


        //get the table data based on row and column number
        String cell=driver.findElement(By.xpath("//table[@id='myTable']/tbody/child::tr[2]/td[2]")).getText();
         System.out.println(cell);
        //System.out.println("name of cell is:" +cell.getText());



       //get the entire table data

        //for row iteration

        //for col iteration

        for(int row=1;row<=rows.size();row++){

            for(int col=1;col<=headings.size();col++)
            {
               String callDate=driver.findElement(By.xpath("//table[@id='myTable']/tbody/child::tr["+row+"]/td["+col+"]")).getText();
                System.out.println(callDate);

            }

        }










    }
}
