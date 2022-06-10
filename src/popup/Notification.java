package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");

	}

}
