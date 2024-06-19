package Testng_programs;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertsDemo1 {
   private int num;
   @BeforeClass
   public void setvar() {
	   num=5;
   }
   @Test//(enabled=false)
   public void testNumberPositive() {
	   Assert.assertTrue(num>0);
	   System.out.println("Number:"+num+"is greater than 0");
   }
   @Test
   public void compare() {
	   SoftAssert sa=new SoftAssert();
	   sa.assertEquals("Test", "hi");
	   //sa.assertAll();
	   System.out.println("Testing soft assert");
   }
}
