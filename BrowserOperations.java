package selenium_programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;


public class BrowserOperations {
	protected static WebDriver driver;
	public static void selectBrowser(String browserName) {
	 
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			
		
	    }else {
	    	System.out.println("Sorry! Browser not found.");
	    }
	}

        public static void closeBrowser() throws InterruptedException{
        	Thread.sleep(2000);
    	    driver.close();
        }
        /*
        public static void takeScreenShot1() throws IOException {
        	File src=null;
        	src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	Files.copy(src, new File("C:\\Users\\Administrator\\Pictures\\Selenium\\pic1.png"));
        }
        */
        public static void takeScreenShot() throws IOException{
        	File src=null;
    	  	src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	  	Files.copy(src, new File("./screenshots/"+"Page2-"+".png"));
        }
}
