package basic;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SgsDuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///F:/SeleniumSoftwares/sgs1.html");
		
		WebElement allOptions = driver.findElement(By.id("sgs"));
		Select s = new Select(allOptions);
		List<WebElement> allOption = s.getOptions();
		
		HashSet<String> h = new HashSet<>();
		for (WebElement option : allOption)
		{
			String text = option.getText();
			//true to print without duplicate
			if(h.add(text)==true)
				System.out.println(text);
			
			
		}
		driver.close();

	}

}
