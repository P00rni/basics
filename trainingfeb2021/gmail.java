package trainingfeb2021;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class gmail {
	

	public static void main(String[] args) {
		
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrsba\\OneDrive\\Desktop\\chromedriver.exe");
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.thenappylady.co.uk/");
		
	   driver.manage().window().setSize(new Dimension(1382, 744));
	    
	      WebElement element1 = driver.findElement(By.xpath("(//a[contains(@href, \'javascript:void(0);\')])[2]"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element1).perform();    
	    
	 
	      WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),\'ADVICE QUESTIONNAIRE\')]"));
	    //  Actions builder = new Actions(driver);
	      builder.moveToElement(element2).perform();
	    
	       
	      WebElement element3 = driver.findElement(By.tagName("body"));
	   //   Actions builder = new Actions(driver);
	      builder.moveToElement(element3, 0, 0).perform();
	    
	    
	      WebElement element4 = driver.findElement(By.cssSelector("#par2 > .navout"));
	    //  Actions builder = new Actions(driver);
	      builder.moveToElement(element4).perform();
	    
	          driver.findElement(By.cssSelector("#chi2 > .childcolumn:nth-child(2) > a:nth-child(3)")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(1) > .pl_prod > .first a")).click();
	   /*  js.executeScript("window.scrollTo(0,200)");
	    driver.findElement(By.id("add")).click();
	    driver.findElement(By.name("quantity")).sendKeys("2");
	    driver.findElement(By.cssSelector(".b_basket")).click();
	    driver.findElement(By.cssSelector(".ui-state-focus > .ui-button-text")).click(); */

}
}