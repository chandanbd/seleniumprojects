package file;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptExecutorDisabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/chandan/Desktop/login.html");
		RemoteWebDriver r = (RemoteWebDriver) driver;
		r.executeScript("document.getElementById('d2').value='password';");

	}

}
