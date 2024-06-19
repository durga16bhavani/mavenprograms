package selenium_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableElements extends BrowserOperations {
	
	public static void main(String[] args) throws InterruptedException{
		selectBrowser("chrome");
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		//Total no.of columns
		List<WebElement> columns=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println(columns.size());
		
		//column heading
		for(WebElement e:columns) {
			System.out.println(e.getText());
		}
		
		//No.of rows(except header)
		
		List<WebElement> records=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		 for(WebElement e:records) {
			 System.out.println(e.getText());
		 }
		 
		 //value of specific cell
		 WebElement cell=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[25]/td[1]"));
		 
		 System.out.println(cell.getText());
		 
		 Thread.sleep(2000);
		 closeBrowser();
	}

}
