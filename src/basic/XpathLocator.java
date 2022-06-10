package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLocator 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
