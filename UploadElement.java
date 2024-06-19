package selenium_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadElement extends BrowserOperations {
	
	public static void main(String[] args) throws InterruptedException{
		selectBrowser("chrome");
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		
		//identify the btn and click
		
		WebElement upload=driver.findElement(By.id("filelist"));
		Thread.sleep(2000);
		upload.click();
		/*
		List<WebElement> upload=driver.findElements(By.xpath("//input[@id='uploadfile_0']"));
		Thread.sleep(2000);
		for(WebElement e:upload) {
			e.click();
		}
		
		WebElement upload=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		Thread.sleep(2000);
		upload.click();*/
		
		Thread.sleep(2000);
		upload.sendKeys("C:\\Users\\Administrator\\Pictures\\Selenium\\pic1.png");
		
		driver.findElement(By.id("submitbutton")).click();
		
		// Thread.sleep(2000);
		//closeBrowser();
	}

}

