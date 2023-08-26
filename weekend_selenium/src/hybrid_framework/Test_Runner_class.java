package hybrid_framework;

import org.testng.annotations.Test;

import SRE.POM_script;

public class Test_Runner_class extends base_class
{
	@Test
	public void amaz() throws InterruptedException
	{
		POM_script p=new POM_script(driver);
		p.UN_enter().sendKeys("hi");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.UN_enter().sendKeys("world");
	}

}
