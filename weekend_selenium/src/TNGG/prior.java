package TNGG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class prior 
{
	@Test(priority=0)
	public void lion()
	{
		Reporter.log("hi", true);
	}
	@Test(priority=1)
	public void apple()
	{
		Reporter.log("bye", true);
	}

}
