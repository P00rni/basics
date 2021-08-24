package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrsba\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();//chromw - child and webdr - parent
		
driver.get("https://www.amazon.com/ref=nav_logo");
driver.manage().window().maximize();
driver.navigate().back();

driver.navigate().forward();

System.out.println(driver.getTitle());

String url =driver.getCurrentUrl();

System.out.println(url);

WebElement textfield = driver.findElement(By.id("twotabsearchtextbox"));

textfield.sendKeys("phone");

WebElement searchbtn =driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div"));

searchbtn.click();



Thread.sleep(2000);

//textfield.clear();



//driver.quit();//closes the browser

//driver.close(); //closes window or tab





	}

}
