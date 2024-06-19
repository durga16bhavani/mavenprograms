package selenium_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.random;


public class FindElementsDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to("https://www.Google.com");
		
				//Identify the text area
		WebElement searchArea=driver.findElement(By.name("q"));
		
		//Enter the value
		searchArea.sendKeys("selenium");
		Thread.sleep(1000);
		
		List<WebElement> suggest=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(suggest.size());
		
		
		for(WebElement opt:suggest) {
			System.out.println(opt.getText());
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		//Click on the 5th suggestion
		if(!suggest.isEmpty()) {
			suggest.get(4).click();
		}*/
		
		//click on wanted option
		WebElement select=null;
		for(WebElement opt:suggest) {
			if(opt.getText().equalsIgnoreCase("selenium tutorial")) {
				select=opt;
				select.click();
				break;
			}
		}
		
		//click on random option
		
		
		
		Thread.sleep(5000);
		
		driver.close();   
	}

}
