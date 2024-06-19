package selenium_programs;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeTakenBrowser extends BrowserOperations {

	public static void main(String[] args) {
		//invoke browser
		selectBrowser("Chrome");
		//implicit wait
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//maximum waiting period -10 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://chatgpt.com/");//2 secs

		

	}

}
