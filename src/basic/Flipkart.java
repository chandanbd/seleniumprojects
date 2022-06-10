package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=flipkart&rlz=1C1CHBF_enIN763IN763&oq=flipkart&aqs=chrome..69i57.5652j0j7&sourceid=chrome&ie=UTF-8");
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("chandandevaraj15@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("cbdyd2515");
        driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

}
