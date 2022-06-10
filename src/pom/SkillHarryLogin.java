package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author chandan
 *
 */

public class SkillHarryLogin 
{
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	
	public SkillHarryLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void un(String user)
	{
		userName.sendKeys(user);
	}
	
	public void pw(String pass)
	{
		passWord.sendKeys("admin");
	}
	
	public void ln()
	{
		loginButton.click();
	}

}
