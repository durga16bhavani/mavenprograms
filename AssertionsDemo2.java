package Testng_programs;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AssertionsDemo2 {
   @Test
   public void eqlComp() {
	  Assert.assertEquals("Hello", "Hi"); 
   }
   @Test
   public void add() {
	   Assert.assertTrue(5>3,"Is true");
   }
   @Test//(enabled=false)
   public void mul() {
	   System.out.println("Implementation is still pending");
	   throw new SkipException("Skipping this");
   }
   
}
