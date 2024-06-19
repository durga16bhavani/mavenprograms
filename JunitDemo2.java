package mavenprojects_new.maven_programs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class JunitDemo2 {
	private ArrayList<String>list;
	
	@BeforeClass  //executed before the class
	public static void m1() {
		System.out.println("Using @BeforeClass,executed before all test cases");
	}
	
	@Before //executed before each test cases
	public void m2() {
		list=new ArrayList<String>();
		System.out.println("Using @Before annotations,executed before each test cases");	
	}
	
	@AfterClass //executed after all the test cases are executed
	public static void m3() {
		System.out.println("Using @AfterClass,executed after all test cases");
	}
	
	@After //executed after each test cases
	public void m4() {
		list.clear();
		System.out.println("Using @After,executed after each test cases");
	}
	
	@Test //Actual test case
	public void m5() {
		list.add("test");
		assertFalse(list.isEmpty());//true
		assertEquals(1,list.size());//1
		System.out.println("M5 TC:We see the list of array:"+list.size());
	}
	
	@Ignore //Ignore the test case
	
	public void m6() {
		System.out.println("Using @Ignore,this execution is ignored");
	}
	
	@Test(timeout=10)
	public void m7() {
		System.out.println("M7:Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");
	}
	
	@Test//(expected=NoSuchMethodException.class)
	public void m8() {
		System.out.println("M8:TC executed");
		System.out.println("M8:Using @Test(expected),it will check for specified exception during it execution");
	}
	
	
}
