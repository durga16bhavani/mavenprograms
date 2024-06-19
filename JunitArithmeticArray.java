package mavenprojects_new.maven_programs;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class JunitArithmeticArray {
	
	int[] array1= {1,2,3,4,5};
	int[] array2= {1,2,3,4,5};
	
	@Test
	public void testArithmetiArray() {
		assertArrayEquals(array1,array2);
		System.out.println("Both are same");
	}
 
}
