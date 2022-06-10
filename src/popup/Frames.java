package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///F:/SeleniumSoftwares/page1.html");
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("c");
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("d");
		Thread.sleep(1000);
		driver.close();
		

	}

}
