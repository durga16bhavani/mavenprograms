package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ResourceLocatorDemo{

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to("https://login.salesforce.com");
		
				
		WebElement uName=driver.findElement(By.id("username"));
		
		uName.sendKeys("Admin");
		By password=RelativeLocator.with(By.tagName("input")).above(By.id("Login"));
		driver.findElement(password).sendKeys("admin123");
		By LgnBtn=RelativeLocator.with(By.tagName("input")).below(By.id("password"));
		driver.findElement(LgnBtn).click();
		
		Thread.sleep(5000);
	    driver.close();
	}

}
