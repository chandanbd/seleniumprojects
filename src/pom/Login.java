package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author chandan
 *
 */

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 * opening browser and enter the url of skillharry
		 */
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		/**
		 * creating object for POM and using
		 * 
		 */
		
		SkillHarryLogin s = new SkillHarryLogin(driver);
		s.un("admin");
		s.pw("admin");
		s.ln();

	}

}
