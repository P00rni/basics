package trials;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeTest;

public class metoffice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver Driver = new ChromeDriver();
		
//open the website
		Driver.get("https://www.metoffice.gov.uk/");

		Driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//wait until the cookie frame appears and accept all
		 
		WebDriverWait wait = new WebDriverWait(Driver,10);
		
		WebElement element = Driver.findElement(By.xpath("//*[@id=\"ccc-recommended-settings\"]"));
		    		
		wait.until(ExpectedConditions.visibilityOf(element));
		   
	    element.click();
	
	//Enter location in search bar
	
	WebElement search = Driver.findElement(By.id("location-search-input"));
	
	search.sendKeys("Luton");
	
	search.submit();
	
	//select the first option on search result
	
	/*List<WebElement> links = Driver.findElements(new ByAll(By.tagName("a"), By.className("location-results-box")) );
	
	//System.out.println(links);
	
	 for (WebElement webElement : links) {
         String name = webElement.getText();
         System.out.println(name);}*/
	
	//selecting location from available results
	Driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/ul/li[1]/a")).click();
	
	
	
	Driver.findElement(By.xpath("//*[@id=\"tabDay1\"]")).click();
	
String a= 	Driver.findElement(By.xpath("//*[@id=\"2021-03-05\"]/table/tbody/tr[5]/td[10]/div")).getAttribute("data-value");


	

Driver.findElement(By.xpath("//*[@id=\"dayLink2021-03-07\"]")).click();

String b = Driver.findElement(By.xpath("//*[@id=\"2021-03-07\"]/table/tbody/tr[5]/td[4]/div")).getAttribute("data-value");
	

float f = Float.parseFloat(a);
float g = Float.parseFloat(b);

System.out.println("Friday Weather at 9.00a.m. is :" + a + "Sunday Weather at 9.00a.m. is:" + b);
	
	if(f>g)
		
	{System.out.println("Friday is hotter");
	}
	else
	{
		System.out.println("Sunday is hotter");
		}
	
	}

}
