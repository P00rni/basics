/** Author: PN
 * Date: 23.2.21
 * Purpose: HTML files testing. Drag and drop/ draggable + droppable, right click, sortable.
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class htmltests_keypress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		WebDriver driver = new ChromeDriver();
		
		
		//1.html
		driver.get("file:\\C:\\Users\\mrsba\\OneDrive\\Desktop\\training\\automation\\lessons\\HTML_rightclick_doubleclick_drag+drop\\html files\\HTML\\1.html");
		
		driver.findElement(By.name("1")).sendKeys("HEllo");
		
		
		
		//2.html - opens in new tab
		
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		
		jsc.executeScript("window.open('file:\\\\C:\\\\Users\\\\mrsba\\\\OneDrive\\\\Desktop\\\\training\\\\automation\\\\lessons\\\\HTML_rightclick_doubleclick_drag+drop\\\\html files\\\\HTML\\\\2.html');");
				
	     ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			
		
			
			driver.switchTo().window(tabs.get(1));
		
		
		WebElement txt = driver.findElement(By.name("2"));
		txt.sendKeys("1234");
		
	
		//context click - right click?
		
		jsc.executeScript("window.open('file:\\\\C:\\\\Users\\\\mrsba\\\\OneDrive\\\\Desktop\\\\training\\\\automation\\\\lessons\\\\HTML_rightclick_doubleclick_drag+drop\\\\html files\\\\HTML\\\\ContextClick.html');");
		
		driver.switchTo().window(tabs.get(2));
		
		Actions actions = new Actions(driver);
		

		
		WebElement contxt = driver.findElement(By.xpath("//*[@id=\"div-context\"]"));  
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		 
		 
		 
		// Wait till the element is not visible
		 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu\"]")));
		 
		
		
		System.out.println(contxt.getText());
		
		actions.contextClick(contxt).perform();
		
	//	driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]")).click();
	}

}
