package selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends BrowserOperations {

	public static void main(String[] args) throws InterruptedException {
		selectBrowser("edge");
		driver.get("https://demoqa.com/droppable/");
		Thread.sleep(2000);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		//Drag and Drop Actions class
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		
		driver.navigate().to("https://demoqa.com/menu");
		WebElement mItem2=driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		Thread.sleep(2000);
		Actions act2=new Actions(driver);
		act2.moveToElement(mItem2).perform();
		
		Thread.sleep(2000);
		driver.close();
		}

}
