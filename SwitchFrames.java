package selenium_programs;

import org.openqa.selenium.By;

public class SwitchFrames extends BrowserOperations {

	public static void main(String[] args) throws InterruptedException {
		selectBrowser("edge");
		

		driver.get("file:///C:/Users/Administrator/Documents/iframe2.html");	
		
		//Identify and enter value on f1 field
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("Hello");
		
		//Switch frame
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("Automation");
		Thread.sleep(2000);
		driver.findElement(By.id("t3")).sendKeys("Selenium");
		Thread.sleep(1000);
		//Switch back to main frame
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).clear();
		
				
		driver.findElement(By.id("t1")).sendKeys("Learning");
		Thread.sleep(3000);
		driver.quit();	
	}
	
}