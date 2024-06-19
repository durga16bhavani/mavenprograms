package selenium_programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo2 {

	public static void main(String[] args) throws InterruptedException {
		//Invoke browser
		//WebDriver driver=new ChromeDriver();//open the chrome browser
	//	WebDriver driver=new FirefoxDriver();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String aTitle=driver.getTitle();
		System.out.println(aTitle);
		String eTitle="google";
		//Title validation TC-Google(Expected)-->Google(Actual)-->PASS
		//Title validation
		if(eTitle.equalsIgnoreCase(aTitle)) {
			System.out.println("Titles are matching-TC PASS");
		}else {
			System.out.println("Titles are not matching-TC Fail");
		}
			Thread.sleep(2000);//1000 milli seconds is 1sec
			
			driver.navigate().to("https://www.amazon.in/");
			
			Thread.sleep(1000);
			
			System.out.println(driver.getTitle());
			
			driver.navigate().back();
			
			driver.navigate().forward();
			
			driver.navigate().refresh();
			
			//driver.close();//close current browser

	}

}
