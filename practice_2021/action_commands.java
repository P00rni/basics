/** Author: PN
 * 
 */
/**Date: 20 .2 20
 * 
 */
/** if else statements anf command statements 
 * 
 */

package practice_2021;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class action_commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.matalan.co.uk/");
		
		WebElement acct = Driver.findElement(By.linkText("My Account"));
		
		acct.click(); //create new acct
		
		Driver.findElement(By.xpath("//input[@placeholder=\"Enter email address\" and @id=\"account_form_email\"]")).sendKeys("p.nagesh.work@gmail.com");
		
		String clickenter = Keys.chord(Keys.CONTROL, Keys.ENTER); // OPens in new tab
		
		
		//String clickenter = Keys.chord( Keys.ENTER); // opens in same tab
		
		
		Driver.findElement(By.xpath("//*[@id=\"new_account_form\"]/button")).sendKeys(clickenter);
		
	
		ArrayList<String> tabs = new ArrayList<String> (Driver.getWindowHandles());
		
		System.out.println(tabs);
		
		Driver.switchTo().window(tabs.get(1));
		
		String Email = Driver.findElement(By.id("account_form_email")).getText();
		
		System.out.println("the mail value is " + Email);
/*	
		if(Email="p.nagesh.work@gmail.com" )
		{
			System.out.print("Email matches");
		}
		else
		{System.out.print("Email does not match the one provided");
		
		}*/
	//	WebDriverWait wait = new WebDriverWait(Driver,30);
		
		//wait.until(element.is)
	}

}
