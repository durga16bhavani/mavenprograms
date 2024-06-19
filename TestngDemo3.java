package Testng_programs;

import org.testng.annotations.Test;

public class TestngDemo3 {
    @Test(groups= {"smoke"})
    public void TC1() {
    	System.out.println("My first test case in TestNG");
    }
    @Test(groups= {"sanity"})
    public void TC2() {
    	System.out.println("My second test case in TestNG");
    }
    @Test(groups= {"regression"})
    public void TC3() {
    	System.out.println("My third test case in TestNG");
    }
}
