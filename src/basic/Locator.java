package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/chandan/Desktop/basic.html");
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.id("d1")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.name("n1")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.className("c1")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.linkText("jspiderhebbal")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("hebbal")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
