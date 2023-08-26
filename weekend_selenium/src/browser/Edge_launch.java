package browser;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge_launch 
{
	public static void main(String[] args) 
	{
		String key="webdriver.edge.driver";
		String value="./Softwares/msedgedriver.exe";
		System.setProperty(key,value);
		EdgeDriver driver =new EdgeDriver();	
	}
}
