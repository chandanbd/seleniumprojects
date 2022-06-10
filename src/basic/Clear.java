package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		WebElement elem = driver.findElement(By.name("q"));
		Thread.sleep(3000);
		elem.sendKeys("pendrive");
		Thread.sleep(3000);
		elem.clear();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
