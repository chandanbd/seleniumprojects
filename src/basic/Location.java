package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		Point userloc = username.getLocation();
		int userx = userloc.getX();
		System.out.println("username location is =="+userx);
		
		Point passloc = password.getLocation();
		int passx = passloc.getX();
		System.out.println("username location is =="+passx);
		
		if(userx==passx)
		{
			System.out.println("both textbox are in same x location");
		}
		else
		{
			System.out.println("textbox location are not same,raise the bug to developer");
		}
		
		driver.close();
		
		
		
		
	}

}
