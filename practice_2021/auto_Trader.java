package practice_2021;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class auto_Trader {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver Driver = new ChromeDriver();
		
		
		Driver.get("https://www.autotrader.co.uk/");
		
		Thread.sleep(5000);
		
		Driver.findElement(By.xpath("//input[@class=\"atc-field__input\" and @id='postcode']")).sendKeys("LU7 4AX");
		
		
		
		// WebElement distance = Driver.findElement(By.xpath("//select[@name='distance']")); //WORKING
		
//WebElement distance = Driver.findElement(By.xpath("//*[contains(@name,'distance')]"));  //WORKING
		
	//	WebElement distance = Driver.findElement(By.xpath("//select[starts-with(@id,'distance')]")); //WORKING(donot use for list)
		
		WebElement distance = Driver.findElement(By.id("distance")); //WORKING
		
	//	System.out.println(distance.Size());
	//	System.out.println(distance.getText());
		
		
		Select DIST = new Select(distance);
		
		DIST.selectByVisibleText("Within 100 miles");
		
	List<WebElement> options = DIST.getOptions();
		System.out.println(options.size());
		
		int size = options.size();
		
		for(int i=0; i<size; i++)
		{
			
			System.out.println(options.get(i).getText());
			
						
		}
		
		
	
		
}
}