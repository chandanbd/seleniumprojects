package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		String link = driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).getAttribute("href");
		System.out.println(link);
		
	}

}
