package Testng_programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngDemo2 {
	@Test
	public void TC1() {
		System.out.println("Hello TestNG Test Case-1");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Beforemethod");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Aftermethod");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Beforeclass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Afterclass");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Beforesuite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Aftersuite");
	}

}
