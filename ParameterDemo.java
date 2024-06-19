package Testng_programs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
   int a=10,b=20,result,sum;
   @Test(enabled=true)
   public void sum() {
	   result=a+b;
	   System.out.println(result);
   }
   @Test(enabled=true)
   public void addTC() {
	   add(20,30);
   }
   
   //user defined method
   public void add(int num1,int num2) {
	   sum=num1+num2;
	   System.out.println(sum);
   }
   @Test
   @Parameters({"val1","val2"})
   public void subtract(int a,int b) {
	   int subRes=a-b;
	   System.out.println(subRes);
   }
   
}
