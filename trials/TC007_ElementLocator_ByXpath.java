package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC007_ElementLocator_ByXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver Driver = new ChromeDriver();

		Driver.get("https://www.autotrader.co.uk/");

		Thread.sleep(10000);

		Driver.switchTo().frame(Driver.findElement(By.id("sp_message_iframe_441126")));

		// Driver.switchTo().frame(Driver.findElement(By.partialLinkText("We use cookies
		// on our site")));

		String pagesource = Driver.getPageSource();

		if (pagesource.contains("We use cookies on our site"))

		{
			System.out.println("Match Found");
			
			Thread.sleep(10000);

			Driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[2]/button[2]")).click();

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

//explicitly wait until the element is up and click on it

		/*
		 * WebDriverWait wait = new WebDriverWait(Driver,10); WebElement popup =
		 * Driver.findElement(By.xpath("//button[@title = 'Accept All']"));
		 * wait.until(ExpectedConditions.visibilityOf(popup)); //popup.click();
		 * 
		 */

		/*
		 * Alert alrt = Driver.switchTo().alert();
		 * 
		 * alrt.accept();
		 */

		// Driver.findElement(By.xpath("//button[@title = 'Accept All']")).click();

		// IMPLICIT WAIT

		// WebElement distance =
		// Driver.findElement(By.xpath("//select[@name='distance']")); //WORKING

//WebElement distance = Driver.findElement(By.xpath("//*[contains(@name,'distance')]"));  //WORKING

		// img[starts-with(@src,"//cdn-fsly.yottaa.net/581cc04c2bb0ac43a7000001/www.screwfix.com/v~4b.2fa/assets/gfx/branding/screwfix-logo.svg?yocs=n_")]

	}
}