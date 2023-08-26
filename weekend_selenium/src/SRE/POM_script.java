package SRE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_script 
{
	//declaration
	@FindBy(id="twotabsearchtextbox")
	private WebElement Un_txt;
	//initialization
	public POM_script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement UN_enter()
	{
		return Un_txt;
	}
}
