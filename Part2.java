package program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Part2{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swethash\\eclipse-workspace\\shrir\\chromedriver.exe");
	    
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
    
     Actions acc = new Actions(driver);
     WebElement txtUsername = driver.findElement(By.name("q"));
     org.openqa.selenium.interactions.Action seriesOfActions = acc
         .moveToElement(txtUsername)
         .click()
         .keyDown(txtUsername, Keys.SHIFT)
         .sendKeys(txtUsername, "hello")
         .keyUp(txtUsername, Keys.SHIFT)
         .doubleClick(txtUsername)
         .contextClick()
         .build();
         
     seriesOfActions.perform();
	}
}

