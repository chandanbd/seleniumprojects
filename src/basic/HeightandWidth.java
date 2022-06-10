package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//write a scrpt to check height and width of username and password textbox of demoskillharry login 
//web page

public class HeightandWidth {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		WebElement untextbox =driver.findElement(By.id("email"));
		Dimension siz =untextbox.getSize();
		int height =siz.getHeight();
		System.out.println("the height of username textbox is == "+height);
		int width = siz.getWidth();
		System.out.println("the width of username textbox is == "+width);
		
		WebElement pwtextbox = driver.findElement(By.id("password"));
		Dimension siz2 =untextbox.getSize();
		int pwheight =siz2.getHeight();
		System.out.println("the password height is === "+pwheight);
		int pwwidth =siz2.getWidth();
		System.out.println("the password width is === "+pwwidth);

		
		
		if(height==pwheight)
		{
			System.out.println("username and password height are  equal");
		}
		else
		{
			System.out.println("username and password height are not equal raise the bug to developer");
		}
		if(width==pwwidth)
		{
			System.out.println("username and password width are  equal");
			
		}
		else
		{
			System.out.println("username and password width are not equal raise the bug to developer");
		}
		
		
		

	}

}
