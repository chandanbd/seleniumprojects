package basic;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SgsPrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///F:/SeleniumSoftwares/sgs1.html");
		WebElement sgslistbox = driver.findElement(By.id("sgs"));
		
		Select s = new Select(sgslistbox);
		List<WebElement> allOption = s.getOptions();
		
		HashSet<String> h = new HashSet<>();
		for (WebElement a : allOption) 
		{
			String text = a.getText();
			//if it is false print duplicate
			if(h.add(text)==false)
				System.out.println(text);
			
		}
		

	}
	
	
	
	

}
