package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeslect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///F:/SeleniumSoftwares/sgs1.html");
		WebElement sgslistbox = driver.findElement(By.id("sgs"));
		
		Select s = new Select(sgslistbox);
		Thread.sleep(3000);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("k");
		Thread.sleep(3000);
		s.selectByVisibleText("fruitsalad");
		
		if(s.isMultiple()==true)
		{
			Thread.sleep(3000);
			s.deselectByVisibleText("tandoori");
			Thread.sleep(3000);
			s.deselectByValue("b");
			Thread.sleep(3000);
			s.deselectByIndex(8);
			Thread.sleep(3000);
		}

		

	}

}
