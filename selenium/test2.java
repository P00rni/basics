package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrsba\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		driver.manage().window().maximize();
		
		WebElement textbox = driver.findElement(By.id("user-message"));
		
		textbox.sendKeys("text");
		
		WebElement popup = driver.findElement(By.id("at-cv-lightbox-close"));
		
		popup.click();
		
		WebElement button1 = driver.findElement(By.cssSelector("#get-input > button")) ;
		button1.click();
		
		
		WebElement sum1 = driver.findElement(By.id("sum1"));
		
		sum1.sendKeys("1");
		
		
		
		
WebElement sum2 = driver.findElement(By.id("sum2"));
		
		sum2.sendKeys("2");
		
		WebElement totalbtn = driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button"));
		
		totalbtn.click();
		
		Thread.sleep(1000);
		
		sum1.clear();
		sum2.clear();
		totalbtn.click();
		
		

	}

}
