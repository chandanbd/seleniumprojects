package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayEnableSelected {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		boolean dis = driver.findElement(By.id("email")).isDisplayed();
		if(dis)
		{
			System.out.println("its displayed");
		}
		else
		{
			System.out.println("not displayed raise the bug to developer");
		}
		boolean enabl = driver.findElement(By.name("login")).isEnabled();
		if(enabl==true)
		{
			System.out.println("login button is enabled");
		}
		else
		{
			System.out.println("login button is not enabled,raise the bug to the developer");
		}
		boolean sel = driver.findElement(By.id("keepLoggedInLabel")).isSelected();
		if(sel==true)
		{
			System.out.println("the login check box is selected");
		}
		else
		{
			System.out.println("not selected");
		}
		
		driver.close();

	}

}
