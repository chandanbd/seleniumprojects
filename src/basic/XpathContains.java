 package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/chandan/Desktop/basic.html");
		driver.findElement(By.xpath("//a[contains(@href,'https://www.qspiders.c')]"));
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'jspid')]"));
		driver.close();

	}

}
