package TNGG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enable 
{
	@Test(enabled=true)
	public void apple()
	{
		Reporter.log("hii", true);
	}
	@Test(enabled=false)
	public void lion()
	{
		Reporter.log("bye", true);
	}

}
