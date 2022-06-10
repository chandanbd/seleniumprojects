package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/chandan/Desktop/basic.html");
		driver.findElement(By.cssSelector("a[href='https://www.qspiders.com/']")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
