package practice_2021;


import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.asprise.ocr.Ocr;


public class TC002_ElementLocator_ByName extends TC002_ElementLocator_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver CDriver = new ChromeDriver();

TC002_ElementLocator_Wait obj = new TC002_ElementLocator_Wait();

//obj.getClass();
		
		CDriver.get("https://www.thenappylady.co.uk/");  // open the website in chrome.
		
		//CDriver.findElement(By.name("for")).clear(); 
		
		CDriver.findElement(By.xpath("//*[@id=\"account\"]/a[1]")).click(); //finding create new account link by xpath
		
		CDriver.findElement(By.id("email")).sendKeys("balakrishnan1980@gmail.com"); // enter Email values into Email textbox  - By id
		
		CDriver.findElement(By.name("passwordnew")).sendKeys("123456"); // enter password - By name
		
		CDriver.findElement(By.name("passwordagain")).sendKeys("123456"); //enter password again -  by name
		
		
		/*   BufferedImage image = ImageIO.read(new File());
	          
		   String imageText = new Ocr().recognize(files, recognizeType, outputFormat, propSpec)
	         
		   System.out.println("Text From Image : \n"+ imageText);
	         
		   System.out.println("Length of total text : \n"+ imageText.length());   */
		
		
		/*   Ocr ocr = new Ocr(); // create a new OCR engine
	        ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English

	        String s = ocr.recognize(new File[] { new File("C:\\Users\\mrsba\\OneDrive\\Desktop\\training\\automation\\love.jpg") },
	                Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
	        
	       ocr.RECOGNIZE_TYPE_TEXT
	        System.out.println(s);
	        ocr.stopEngine();
		*/
		
	/*	System.out.println(CDriver.findElement(By.xpath("//*[@id=\"cb_id_CONTENT\"]/table/tbody/tr/td/form/div[1]/div/table/tbody/tr[7]/td/div/img")).getText());
		
		WebElement Searchbox = CDriver.findElement(By.name("for"));
		Searchbox.click();
		Searchbox.sendKeys("test message");
		Searchbox.submit();

	
		/*CDriver.findElement(By.name("for")).sendKeys("booster"); // pass values to search bar
		
		CDriver.findElement(By.name("for")).clear();
		
	/*	CDriver.findElement(By.name("for")).sendKeys("booster");
		
		CDriver.findElement(By.name("for")).submit();*/
		
		
		
		
	}

}
