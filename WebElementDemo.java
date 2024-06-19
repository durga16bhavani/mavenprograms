package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.Google.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://login.salesForce.com/");
		
		//System.out.println(driver.getPageSource());
		
		WebElement uName=driver.findElement(By.id("username"));
		WebElement uPwd=driver.findElement(By.name("pw"));
		
		//Action
		uName.sendKeys("Admin");
		driver.findElement(By.name("pw")).sendKeys("Admin123");
		
		//Login btn click
		//xpath->tagName[@attribute='value']
        WebElement loginBtn	=driver.findElement(By.xpath("//input[@name='Login']"));
        loginBtn.click();
        
        //Capture the error message
        
        WebElement errMsg=driver.findElement(By.id("error"));
        
        String error=errMsg.getText();
        
        System.out.println(error);
        
        //validation-> Invalid Credentials
        if(error.contains("If you still can't log in")) {
        	System.out.println("Test case Pass");
        }else {
        	System.out.println("fail");
        }
	}

}
