package practice_2021;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TC002_ElementLocator_Wait   {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
WebDriver CDriver = new ChromeDriver();
		
		CDriver.get("https://www.thenappylady.co.uk/");  // open the website in chrome.
		
		//CDriver.findElement(By.name("for")).clear(); 
		
		
		CDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		CDriver.findElement(By.xpath("//*[@id=\"account\"]/a[1]")).click(); //finding create new account link by xpath
		
	/*	CDriver.findElement(By.id("email")).sendKeys("balakrishnan1980@gmail.com"); // enter Email values into Email textbox  - By id
		
		CDriver.findElement(By.name("passwordnew")).sendKeys("123456"); // enter password - By name
		
		CDriver.findElement(By.name("passwordagain")).sendKeys("123456"); //enter password again -  by name
		
		
		
		
		
		System.out.println(CDriver.findElement(By.xpath("//*[@id=\"cb_id_CONTENT\"]/table/tbody/tr/td/form/div[1]/div/table/tbody/tr[7]/td/div/img")).getText());
		
		WebElement Searchbox = CDriver.findElement(By.name("for"));
		Searchbox.click();
		
	
		
		Searchbox.sendKeys("test message");
		Searchbox.submit();

	
		/*CDriver.findElement(By.name("for")).sendKeys("booster"); // pass values to search bar
		
		CDriver.findElement(By.name("for")).clear();
		
	/*	CDriver.findElement(By.name("for")).sendKeys("booster");
		
		CDriver.findElement(By.name("for")).submit();*/
		
		
		
		
	}

}
