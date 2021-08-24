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



public class listpractice {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub

		
		
		
//System.setProperty("Webdriver.Chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
		
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.matalan.co.uk/");
		
	//	driver.get("https://www.google.com");
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		
		int i = li.size();
		
		System.out.print(i);
		
		for (int j=0; j<i;j++)
			
		{
			System.out.println(li.get(j).getText());
			
			
		}
		System.out.println(li.size());
	}

}
