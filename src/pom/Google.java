package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google 
{
	@FindBy(name="q")
	private WebElement searchBox;
	
	
	public Google(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void searchTextbox(String ser)
	{
		searchBox.sendKeys(ser);
	}

}
