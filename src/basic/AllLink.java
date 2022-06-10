package basic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> elem = driver.findElements(By.xpath("//a"));
		int count = elem.size();
		System.out.println("the total links are"+count);
		
		for (int i = 0; i <count; i++) 
		{
			Thread.sleep(1000);
			String text = elem.get(i).getText();
			System.out.println("the total links are"+text);
		}
		driver.close();

		
	}

}
