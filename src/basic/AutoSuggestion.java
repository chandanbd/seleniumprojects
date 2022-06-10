package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selen");
		Thread.sleep(3000);
		
		  List<WebElement> autsugg = driver.findElements(By.xpath("//li[@class='sbct']"));
		int count = autsugg.size();
		System.out.println("the total autosuggestion is ==="+count);
		
		for (WebElement all : autsugg)
		{
			String text = all.getText();
			System.out.println("the auto suggestion are =="+text);
		}
		driver.close();
		
		

	}

}
