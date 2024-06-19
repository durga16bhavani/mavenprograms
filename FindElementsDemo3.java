package selenium_programs;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class FindElementsDemo3 {
    public static void main(String[] args) throws InterruptedException {
    	EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio1=driver.findElement(By.name("radioButton"));
		System.out.println("Displayed"+radio1.isDisplayed());
		System.out.println("Selected"+radio1.isSelected());
		System.out.println("Enlabed"+radio1.isEnabled());
		radio1.click();
		
		System.out.println("Selected"+radio1.isSelected());
		List<WebElement> radioBtns=driver.findElements(By.xpath("//input[@name='radioButton']"));
		
		System.out.println("Total no of radio buttons:"+radioBtns.size());
		
		//print radio buttons names
		for(int i=0;i<radioBtns.size();i++) {
			System.out.println(radioBtns.get(i).getAttribute("value"));
		}
		
		//identify the dropdown
		
		WebElement sel1=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropdown=new Select(sel1);
		
		dropdown.selectByIndex(1);
		Thread.sleep(2000);
		
		dropdown.selectByValue("option2");
		Thread.sleep(2000);
		
		dropdown.selectByVisibleText("Option3");
		
		
		//link identification and click
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		//Alert handling
		
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);//alert popup to wait
		driver.switchTo().alert().accept();
		System.out.println("Alert handled successfully");
			
		//Key arrows event
		WebElement auto=driver.findElement(By.id("autocomplete"));
		auto.click();
		auto.sendKeys("India");
		Thread.sleep(2000);
		auto.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		/*hyperlinks
		List<WebElement> dummylinks=driver.findElements(By.cssSelector("//"))
		
		//Thread.sleep(4000);
		//driver.close();*/
    }
}


