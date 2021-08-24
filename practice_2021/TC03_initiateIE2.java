//Module: to initiate IE driver
//author: NP
//date: 09 2 21



package practice_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;


public class TC03_initiateIE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//method1
		WebDriver IEDriver = new InternetExplorerDriver();
		
		IEDriver.get("https://www.thenappylady.co.uk/");  //NOT WORKING WHY?
		
		
		
/*	//method2
		
		System.setProperty("webdriver.ie.driver","C:\\Selenium\\drivers\\IEDriverServer.exe");
		WebDriver IEDriver = new InternetExplorerDriver();
		IEDriver.get("https://www.thenappylady.co.uk/");
		
		
		
		
		
		//method3
		
		String ChromeDriverPath = "C:\\Selenium\\drivers\\IEDriverServer.exe";
		
		System.setProperty("webdriver.ie.driver", ChromeDriverPath);
		WebDriver IEDriver = new InternetExplorerDriver();
		IEDriver.get("https://www.thenappylady.co.uk/");
		*/
	}

}
