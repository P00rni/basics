
/**Author: PN
 * 
 */
/** Date: 18.2.20
 * 
 */


package practice_2021;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.matalan.co.uk/");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[5]/a")).click();
		
		WebElement address = driver.findElement(By.id("addressEntry"));
		
		address.sendKeys("LU7 4AX");
		
		driver.findElement(By.id("findStore")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
	
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		
	
		
		
		
		
	}

}
