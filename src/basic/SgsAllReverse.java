  package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SgsAllReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///F:/SeleniumSoftwares/SGS.html");
		WebElement allOptions = driver.findElement(By.id("sgs"));
		
		Select s = new Select(allOptions);
		List<WebElement> option = s.getOptions();
		int count = option.size();
		
		System.out.println("=====SGS in order=======");
		for(int i = 0; i<count;i++) 
		{
			WebElement nums = option.get(i);
			String text = nums.getText();
			System.out.println(text);
			
		}
		
		System.out.println("=====SGS in reverse order=======");
		for(int j = count-1; j>=0; j--)
		{
			WebElement nums1 = option.get(j);
			String text1 = nums1.getText();
			System.out.println(text1);
			
		}
		

	}

}
