package practice_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class TC04_initiateGecko3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
				System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\drivers\\geckodriver.exe");
				WebDriver GDriver = new FirefoxDriver();
				
				GDriver.get("https://www.thenappylady.co.uk/");
				
				
		/*		String GDriverPath = "C:\Selenium\drivers\geckodriver.exe";
				
				System.setProperty("webdriver.gecko.driver", GDriverPath);
				WebDriver GDriver = new FirefoxDriver();
				GDriver.get("https://www.thenappylady.co.uk/");
		*/
	}

}


