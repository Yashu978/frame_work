package basic_hybrid_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_class 
{
	//declaration
		@FindBy(id="twotabsearchtextbox")
		private WebElement Un_txt;
		//initialization
		public POM_class(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//utilization
		public WebElement UN_enter()
		{
			return Un_txt;
		}

}
