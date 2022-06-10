package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		driver.get("https://www.amazon.in/");
		driver.navigate().back();
		driver.close();

	}

}
