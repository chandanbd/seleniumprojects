package file;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/chandan/Desktop/cv.html");
		File file = new File("./data/resume.pdf");
		String path = file.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(path);
		

	}

}
