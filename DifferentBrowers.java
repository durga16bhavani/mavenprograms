package selenium_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DifferentBrowers {
	
	public static WebDriver openChrome() {
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	
	public static WebDriver openFirefox() {
		
		WebDriver driver=new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver openEdge() {
		WebDriver driver=new EdgeDriver();
		return driver;
	}

	public static void main(String[] args) {
		WebDriver chromeDriver=openChrome();
		chromeDriver.get("https://www.Google.com");
		chromeDriver.quit();
		
		WebDriver firefoxDriver=openFirefox();
		firefoxDriver.get("https://www.Google.com");
		firefoxDriver.quit();
		
		WebDriver edgeDriver=openEdge();
		edgeDriver.get("https://www.Google.com");
		edgeDriver.quit();
	}

}
