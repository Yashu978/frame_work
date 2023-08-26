package reppts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extrpt 
{
	@Test
	public void ruyn()
	{
		ExtentReports report=new ExtentReports("./Reports/extentreport.html");
		ExtentTest test=report.startTest("test1");
		test.log(LogStatus.PASS, "pass");
		test.log(LogStatus.FAIL, "fail");
		test.log(LogStatus.SKIP, "skip");
		report.endTest(test);
		report.flush();
	}
	

}
