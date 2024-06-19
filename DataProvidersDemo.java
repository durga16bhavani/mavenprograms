package Testng_programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersDemo {
   @DataProvider(name="loginData")
   public Object[][] provideData(){
	   return new Object[][] {
		   {"user4","password4"},
		   {"user3","password3"},
		   {"user2","password2"},
		   {"user1","password1"}
	   };
   }
   
   @Test(dataProvider="loginData")
   public void testLogin(String username,String password) {
	   System.out.println("UserName:"+username);
	   
	   System.out.println("Password:"+password);
   }
    
}
