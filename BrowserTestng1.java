package Testng_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserTestng1 {
   public WebDriver driver=null;
   
   /*
   @BeforeClass //supporting annotations at class level
   public void invokeBrowser() {
	   driver=new ChromeDriver();
   }
   */
   
   @BeforeMethod //supporting annotations at the class level
   public void invokeBrowser() {
	   driver=new ChromeDriver();
   }
   @Test
   public void googleSearch()throws InterruptedException{
	   driver.get("https://www.google.com");
	   Thread.sleep(3000);
   }
   @Test
   public void amazon() throws InterruptedException{
	   driver.get("https://www.amazon.in");
	   Thread.sleep(3000);
   }
   /*
   @AfterClass //supporting annotations at the class level
   public void closeBrowser() {
	   driver.close();
   }
   */
   @AfterMethod //supporting annotations at the class level
   public void closeBrowser() {
	   driver.close();
   }
   
}
