package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Colour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement elem = driver.findElement(By.partialLinkText("Forgotten password"));
		 String col = elem.getCssValue("color");
		 System.out.println(col);
		 String fz = elem.getCssValue("font-size");
		 System.out.println(fz);
		 String fw = elem.getAttribute("font-weight");
		 System.out.println(fw);

	}

}
