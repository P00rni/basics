/**Module: to initiate chrome driver
 * 
 */
/**author: NP
 * 
 */
/**date: 09 2 21
 * 
 */




package practice_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TC01_Keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//method1
		WebDriver CDriver = new ChromeDriver();
		
		CDriver.get("https://www.google.com/");  
		CDriver.findElement(By.name("q")).sendKeys("avengers");
		
		CDriver.findElement(By.name("btnK")).sendKeys(Keys.RETURN); // sendKeys(Keys.RETURN) - enter key on keyboard-instead of submit
		
		//keys.  - keyboard keys
		
		

		
	}

}
