package Testng_programs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebpageTestProperties {
   WebDriver driver;
   PropertiesUtility prop;
   
   @BeforeClass
   public void setUp() {
	   prop=new PropertiesUtility();
	   String browser=prop.getProperty("browser");
	   if(browser.equalsIgnoreCase("chrome")) {
		  driver=new ChromeDriver();
		
	   }else if(browser.equalsIgnoreCase("firefox")) {
			  driver=new FirefoxDriver();
	     	  
	   }else {
		   driver=new EdgeDriver();
		  
	   }
	  // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().window().maximize();
   }
   @Test
   public void testLogin() {
	  driver.get(prop.getProperty("url"));
	  
	  WebElement uname=driver.findElement(By.id("username"));
	  WebElement pwd=driver.findElement(By.name("pw"));
	  WebElement login=driver.findElement(By.xpath("//input[@name='Login']"));
	  
	  uname.sendKeys(prop.getProperty("username"));
	  pwd.sendKeys(prop.getProperty("password"));
	  login.click();
	  
   }
   @AfterClass
   public void tearDown() {
	   if (driver!=null) {
		   driver.quit();
	   }
   }
}
