/** Author: PN 
 * 
 */
/** MOdule: testing screw fix ain oage
 * 
 */
/** date: 14.02.2021
 * 
 */



package trials;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class screwfix_create_new_account {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver CDriver = new ChromeDriver();
		
		CDriver.get("https://www.screwfix.com/");
		
		Thread.sleep(2000);
		
CDriver.findElement(By.xpath("//a[@id='header_branch_locator_link']")).click();	



	//	CDriver.findElement(By.xpath("//*[@id=\"header_branch_locator_link\"]")).click();
		


	/*	WebElement Logo = 	CDriver.findElement(By.xpath("//img[starts-with(@src,\"//cdn-fsly.yottaa.net/581cc04c2bb0ac43a7000001/www.screwfix.com/v~4b.2fa/assets/gfx/branding/screwfix-logo.svg?yocs=n_\")]"));
				
		
	Logo.click();*/
		
	}

}
