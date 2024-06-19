package selenium_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class MultipleWindows extends BrowserOperations {

	public static void main(String[] args) throws InterruptedException {
		selectBrowser("firefox");
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/&ddm=0&dsh=S-250888388:1717064072554800&ec=asw-gmail-globalnav-create&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&TL=AC3PFD4jyE_ItLztjpv8I5MjlGgK2bJ6B9cxAvPqUcWIdoKOcUOos6FnbUEHIKYC");
        // click on Help,privacy
		driver.findElement(By.linkText("Help")).click();
		//driver.findElement(By.linkText("Privacy")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		
		String Parent=it.next();//parent window
		String help=it.next();//child window-help
		Thread.sleep(2000);
		driver.switchTo().window(help);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.switchTo().window(Parent);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}
}