package selenium_programs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebElementGoogle extends BrowserOperations {

	public static void main(String[] args) throws InterruptedException, IOException {
		selectBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to("https://www.Google.com");
		
				//Identify the text area
		WebElement searchArea=driver.findElement(By.name("q"));
		
		//Enter the value
		searchArea.sendKeys("Selenium");
		searchArea.sendKeys(Keys.ENTER);//click enter from keyword
		
		Thread.sleep(5000);
		
		
		 // String s=driver.getPageSource();
		  //System.out.println(driver.getPageSource());
		   //System.out.println(s);
	    
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
		
	    takeScreenShot();
		Thread.sleep(2000);
		closeBrowser();
	}

}
