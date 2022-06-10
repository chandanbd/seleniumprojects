package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("https://demoapp.skillrary.com/");
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		//WebElement click = driver.findElement(By.xpath("//button[@class='navbar-toggle collapsed']"));
		//Actions s = new Actions(driver);
		//s.doubleClick(click);
		//driver.close();
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"course\"]"));
		Actions s = new Actions(driver);
		s.moveToElement(findElement).perform();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[2]/div/div/span/a[2]")).click();
		WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"add\"]"));
		
		Actions s1 = new Actions(driver);
		s1.doubleClick(findElement2).perform();
				
		

	}

}
