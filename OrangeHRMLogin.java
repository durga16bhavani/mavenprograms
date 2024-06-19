package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMLogin {
     WebDriver driver;
     @Given("Browser open")
     public void browser_open() {
    	 driver=new EdgeDriver();
    	 driver.manage().window().maximize();
     	 System.out.println("Browser Opened");
     }
     @And("user is on OrangeHRM login page")
     public void user_is_on_OrangeHRM_login_page() {
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	 System.out.println("User is on Login page");
     }
     @And("user enters username and password")
     public void user_enters_username_and_password() {
    	 WebElement uname=driver.findElement(By.name("username"));
    	 uname.sendKeys("Admin");
    	 WebElement pwd=driver.findElement(By.name("password"));
    	 pwd.sendKeys("admin123"); 
     }
     @Then("click login button")
     public void click_login_button() throws InterruptedException{
    	 WebElement logbtn=driver.findElement(By.xpath("//button[@type='submit']"));
    	 Thread.sleep(2000);
    	 logbtn.click();
    	 System.out.println("Clicked login");
     }
     @Then("user is navigated to dashboard")
     public void user_navigated() {
    	 System.out.println("User navigated to dashboard");
     }
     @When("user Logout from the dashboard")
     public void user_Logout() throws InterruptedException {
        
        WebElement dropDown=driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
        WebElement logOut=driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
    	dropDown.click();
 		
 		Thread.sleep(2000);
 		logOut.click();
 		System.out.println("LogOut successfully");
     }
     @Then ("close browser")
     public void close_browser() throws InterruptedException {
     	Thread.sleep(2000);
     	driver.close();
     	System.out.println("Browser closed");
     } 
}
