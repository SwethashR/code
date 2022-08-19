package program;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2Webtable {
	public static void main(String[] args) throws ParseException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swethash\\eclipse-workspace\\shrir\\chromedriver.exe");
	    
	     WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
        String max;
        double m=0,r=0;
        
          //No. of Columns
           List  col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
           System.out.println("Total No of columns are : " +col.size());
           //No.of rows
           List  rows = driver.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
           System.out.println("Total No of rows are : " + rows.size());
           for (int i =1;i<rows.size();i++)
           {    
               max= driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
               NumberFormat f =NumberFormat.getNumberInstance();
               Number num = f.parse(max);
               max = num.toString();
               m = Double.parseDouble(max);
               if(m>r)
                {    
                   r=m;
                }
           }
           System.out.println("Maximum current price is : "+ r);
	}
}
// FOR MINIMUM CURRENT PRICE
//driver.get("http://demo.guru99.com/test/web-table-element.php");
//String min;
//double m=0,r=0;

  //No. of Columns
  // List<WebElement>  col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
  // System.out.println("Total No of columns are : " +col.size());
   //No.of rows
   //List<WebElement>  rows = driver.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
  // System.out.println("Total No of rows are : " + rows.size());
   //for (int i =1;i<rows.size();i++)
  // {    
      // min= driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
      // NumberFormat f =NumberFormat.getNumberInstance();
      // Number num = f.parse(min);
      // min = num.toString();
       //m = Double.parseDouble(min);
       //if(m<r)
      //  {    
         //  r=m;
       // }
   //}
   //System.out.println("min current price is : "+ r);\
