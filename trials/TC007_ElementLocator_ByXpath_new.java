package trials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC007_ElementLocator_ByXpath_new {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		Driver.get("https://www.autotrader.co.uk/");

		Thread.sleep(10000);

		Driver.switchTo().frame(Driver.findElement(By.id("sp_message_iframe_441126")));

		String pagesource = Driver.getPageSource();

		if (pagesource.contains("We use cookies on our site"))

		{
			System.out.println("Match Found");
			
			Thread.sleep(10000);

			Driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[2]/button[2]")).click();
			System.out.println("Match Found");
			
			Driver.switchTo().defaultContent();
		
			Driver.findElement(By.xpath("//input[@class=\"atc-field__input\" and @id='postcode']")).sendKeys("LU7 4AX");

			WebElement distance = Driver.findElement(By.xpath("//select[starts-with(@id,'distance')]")); // WORKING

			System.out.println(distance.getSize());
			System.out.println(distance.getText());

			distance.sendKeys("Within 100 miles"); // in site it takes as 1 mile?
		}

		else

		{
			System.out.println("Match Not Found");
		}

	}
}