package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String rf = driver.findElement(By.xpath("//h2[contains(text(),'connect and')]")).getText();
		if(rf.contains("connect and"))
		{
			System.out.println("is validated");
		}
		else
		{
			System.out.println("not validated");
		}
		driver.close();

	}

}
