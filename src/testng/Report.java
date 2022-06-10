package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report 
{
	@Test
	public void demo()
	{
		System.out.println("hello testng");
		Reporter.log("hello reporter",true);
		Reporter.log("hello reporter,  welcome to testng",false); 
		// created class and run the program and refresh the project,the test output folder will be created
		//in that the emailable- report.html,right click on that and open with web browser.
		//false SOP will not print in console
		
		
	}

}
