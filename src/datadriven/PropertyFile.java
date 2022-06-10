package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Properties p = new Properties();
		p.load(new FileInputStream("./data.properties"));
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(p.getProperty("url"));
		
		driver.findElement(By.id("email")).sendKeys(p.getProperty("Username"));
		driver.findElement(By.id("password")).sendKeys(p.getProperty("Password"));
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		//driver.close();
		
		

	}

}
