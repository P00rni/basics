package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class formsubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrsba\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();//chromw - child and webdr - parent
		
driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

//WebElement username = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/legend"));

//String UN = username.getText();
//;

//System.out.println(UN.contains("!"));




//dropdown

WebElement DD = driver.findElement(By.id("select-demo"));

Select sel = new Select(DD); // select class

//sel.selectByVisibleText("Sunday");
sel.selectByIndex(3);


	}

}
