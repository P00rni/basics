package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrsba\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		driver.manage().window().maximize();
		

		WebElement checkbox = driver.findElement(By.id("isAgeSelected"));
		
		checkbox.click();
		
		System.out.println(checkbox.isSelected());
		
		
//WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input"));
		
		//checkbox2.click();
		
		//System.out.println(checkbox.isSelected());
		
WebElement checkbox2 = driver.findElement(By.id("check1"));
		
		checkbox2.click();
		System.out.println(checkbox2.isSelected());
		
		
		
	}

}
