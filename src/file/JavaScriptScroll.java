package file;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver; 
		
		j.executeScript("window.scrollBy(0,5000);");
		Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,5000);");
		Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,-5000);");
		Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,-5000);");
		
		
		

	}

}
