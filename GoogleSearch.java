package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleSearch {
    WebDriver driver;
    WebElement txtBox;
    @Given("Browser is open")
    public void browser_is_open() {
    	driver=new EdgeDriver();
    	System.out.println("Browser Opened");
    }
    @And("user is on google search page")
    public void user_is_on_google_search_page(){
    	 driver.navigate().to("https://www.google.com");
    	 driver.manage().window().maximize();
    	 System.out.println("User is on google search page");
    }
    @And("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
    	txtBox=driver.findElement(By.name("q"));
    	txtBox.sendKeys("Cucumber BDD");
    }
    @Then("hits enter")
    public void hits_enter()throws InterruptedException{
    	Thread.sleep(2000);
    	txtBox.sendKeys(Keys.ENTER);
    	System.out.println("Hits enter");
    }
    @Then("user is navigated to search results page")
    public void user_is_navigated_to_search_results_page() {
    	System.out.println("User is navigated to search results_page");
    }
    @Then("close the browser")
    public void close_the_browser() throws InterruptedException{
    	Thread.sleep(2000);
    	driver.close();
    	System.out.println("Browser closed");
    	
    }
}
