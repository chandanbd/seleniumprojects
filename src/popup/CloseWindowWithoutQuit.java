package popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindowWithoutQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		int count = allwin.size();
		System.out.println("the total windows are=="+count);
		
		for (String win : allwin) 
		{
			driver.switchTo().window(win);
			
			if(win.equals(parent))
			{
				
			}
			else
			{
				driver.close();
			}
		}

	}

}
