package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority
{
	@Test(priority=3,enabled=false)
	public void whatsappCall()
	{
		Reporter.log("hello, im here to help u with call",true);
	}
	
	@Test(priority=2)
	public void status()
	{
		Reporter.log("hello whatsapp status",true);
	}
	
	@Test(priority=1,invocationCount=5) 
	public void chat()
	{
		Reporter.log("hello, im here to help u with connecting people",true);
	}

}