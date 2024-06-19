package mavenprojects_new.maven_programs;

import org.junit.Assert;
import org.junit.Test;

public class JunitDemo3 {
    
	String string1="Junit";
	String string2=null;
	
	@Test
	public void notNullTC() {
		Assert.assertNotNull(string1);
		System.out.println("String 1 is Not null");
		
		Assert.assertNull(string2);
		System.out.println("String2 is null");
		
		//Assert.assertNotNull(string2);//false
		//System.out.println("String2 is null");
	}
}
