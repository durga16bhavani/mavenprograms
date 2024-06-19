package selenium_programs;
import selenium_programs.BrowserOperations;

import java.io.IOException;
import java.util.Scanner;

public class OperationsExecute   {

	public static void main(String[] args) throws InterruptedException, IOException{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Browser name:");
		String browser=sc.nextLine();
		BrowserOperations.selectBrowser(browser);
	
		
		BrowserOperations.closeBrowser();
		

	}

}
