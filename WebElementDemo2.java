package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo2{

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		
		
		
		WebElement uName=driver.findElement(By.id("inputUsername"));
	
		
		//Action
		uName.sendKeys("Admin");
		driver.findElement(By.name("inputPassword")).sendKeys("Admin123");
		
		//Login btn click
		//xpath->tagName[@attribute='value']
        WebElement signInBtn	=driver.findElement(By.xpath("//button[@type='submit']"));
        signInBtn.click();
        
        //Capture the error message
       
        WebElement errMsg=driver.findElement(By.xpath("//p[@class='error']"));
        
        String error=errMsg.getText();
        
        System.out.println(error);
        
        
        Thread.sleep(5000);
        driver.close();
	}

}

