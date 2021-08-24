package trials;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Webdriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.Chromedriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebdriverWait;


public class trial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new Chromedriver();
		
		driver.get("https://www.autotrader.co.uk/");
		
driver.switchTo().frame(driver.findElement(By.id("sp_message_iframe_441126")));
		
		//driver.switchTo().frame(driver.findElement(By.partialLinkText("We use cookies on our site")));
	
		 
		String pagesource = driver.getPageSource();
			
		 	if(pagesource.contains("We use cookies on our site"))
				
			 {
		 		System.out.println("Match Found");
		 		
			 driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[2]/button[2]")).click();
			 
			 driver.findElement(By.xpath("//input[@class=\"atc-field__input\" and @id='postcode']")).sendKeys("LU7 4AX");
			 
			 WebElement distance = driver.findElement(By.xpath("//select[starts-with(@id,'distance')]")); //WORKING
				
				
				
				
				System.out.println(distance.getSize());
				System.out.println(distance.getText());
				
				distance.sendKeys("Within 100 miles"); //in site it takes as 1 mile?
			 } 
		 	
		 	
			else
				
			 {
				System.out.println("Match Not Found");
				}
	
		

	}

}
