package TNGG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class methods 
{
	@Test
	public void apple()
	{
		//create a account
		Reporter.log("Account created", true);
	}
	@Test(dependsOnMethods="apple")
	public void lion()
	{
		//login in
		Reporter.log("Logged in", true);
		Assert.fail();
	}
	@Test(dependsOnMethods="lion")
	public void run()
	{
		//send request
		Reporter.log("sent request", true);
	}
}
