package practice_2021;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class directory_practice {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.mbda-systems.com/");
		
		driver.manage().window().maximize();
		
	//WebElement Services = driver.findElement(By.xpath("//li[@class='level-1 even has-children active']/a[1]"));
		
		WebElement Services = driver.findElement(By.xpath("//a[text()='SOLUTIONS AND SERVICES']"));
		
		Services.click();
		
	//FileHandler.createDir(new File("C:\\Users\\mrsba\\OneDrive\\Desktop\\training\\automation\\lessons\\screenshots\\currentscr"));
		
	//WebDriverWait wait = new WebDriverWait(driver,30);
	
	//wait.until(ExpectedConditions.visibilityOfAllElements(elements))
	
	//wait.until(ExpectedConditions.visibilityOf(Services));
	
	if (Services.isDisplayed())
	{
		System.out.println("Element FOund");
	} else
	{
		
		
	
		File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	
	
	
	FileHandler.copy(scr1 ,new File("C:\\Users\\mrsba\\OneDrive\\Desktop\\training\\automation\\lessons\\screenshots\\currentscr\\scrnew.png" ));
	System.out.println("screenshot taken");
	FileHandler.copy(new File("C:\\Users\\mrsba\\OneDrive\\Desktop\\training\\automation\\lessons\\screenshots\\currentscr\\"), new File("C:\\Users\\mrsba\\OneDrive\\Desktop\\training\\automation\\lessons\\screenshots\\repository"));
	System.out.println("copied to repository");
	// FileHandler.delete(new File("C:\\Users\\mrsba\\OneDrive\\Desktop\\training\\automation\\lessons\\screenshots"));
	}
	}

}
