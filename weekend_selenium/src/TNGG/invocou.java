package TNGG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocou 
{
	@Test(invocationCount=3)
	public void test()
	{
		Reporter.log("hii", true);
	}

}
