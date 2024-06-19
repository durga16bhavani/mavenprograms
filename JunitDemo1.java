package mavenprojects_new.maven_programs;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class JunitDemo1 {

	
		String name="Hyderabad";
		
		@Test  //Annotation will act like a main method
		public void validateName(){
			Assert.assertEquals("Hyderabad",name); //if there is a fail then next stmtnt will not be executed
			System.out.println("Both the names are matching");
		}
		int num1=10;
		@Test  //Annotation will act like a main method
		public void validateNumber() {
			Assert.assertEquals(10,num1);
			System.out.println("Both the numbers are matching");
			add(2,10);
		}
		
		@Test
		public void assertTrueDemo()
		{
			Assert.assertTrue(num1>9);
			System.out.println("Num1 is greater than 9");
		}
		int sum;
        @Test
        public void assertfalseDemo() {
        	sum=add(10,20);
        	Assert.assertFalse(29>sum); //pass or fail
        	System.out.println("Pass");
        }
        //Becomes user defined method
        public static int add(int number1,int number2) {
        	return number1+number2;
        }
        

}

