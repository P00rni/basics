//Module: to initiate chrome driver
//author: NP
//date: 09 2 21



package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class initiatechrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*		//method1
		WebDriver CDriver = new ChromeDriver();
		
		CDriver.get("https://www.thenappylady.co.uk/");  */
		
/*		//method2
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mrsba\\\\OneDrive\\\\Desktop\\\\chromedriver.exe");
		WebDriver CDriver = new ChromeDriver();
		CDriver.get("https://www.thenappylady.co.uk/");
		*/
		//method3
		
		String ChromeDriverPath = "C:\\\\\\\\Users\\\\\\\\mrsba\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
		WebDriver CDriver = new ChromeDriver();
		CDriver.get("https://www.thenappylady.co.uk/");
		
	}

}
