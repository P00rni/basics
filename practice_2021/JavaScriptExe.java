/** Author: PN
 * Purpose: JSE.
 * Date: 23.2.21
 */







package practice_2021;

import java.awt.Window;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     
     driver.manage().window().maximize();
     
     JavascriptExecutor jse = (JavascriptExecutor)driver;
     
     String google, fb;
     
   
     
     driver.navigate().to("https://www.google.com/");
     
   driver.switchTo().frame(0);
   driver.findElement( By.xpath("//*[@id=\"introAgreeButton\"]/span/span")).click();
     
     google = driver.getCurrentUrl();
     
     
     //google 
     
     System.out.println("Google URL"+ "   " + google);
     
  Thread.sleep(5000);
     
     //fb
     
     jse.executeScript("window.open('http://www.facebook.com');");
    
     fb = driver.getCurrentUrl();
     
     System.out.println("facebook URL"+ "   " + fb);
     
     ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
     driver.switchTo().window(tabs.get(1));
     
   //  String facebook = driver.getWindowHandle();
		
  // driver.switchTo().frame(0);
   
   
 driver.findElement(By.xpath("//button[@data-cookiebanner = 'accept_button']")).click();
     

     
    // driver.findElement( By.xpath(" //*[@id=\"u_0_j_A3\"]")).click(); //frame not working
  /*
     
     fb = driver.getCurrentUrl();
     
     System.out.println("Facebook URL"+ "   " + fb);
     
     
    
		
		
	
  
     
     
   /*  driver.navigate().to("https://www.moneysupermarket.com/shop/home-insurance/questionset/#?step=highimpactquestions");

     
      
     
     
     
     
driver.findElement(By.xpath("//*[@id=\"houseNumber\"]")).sendKeys("51");

driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("LU7 4AX");


driver.findElement(By.xpath("//*[@id=\"property.ownershipStatusId\"]/div[2]/div[2]/div")).click();



*/



 


	}

}
