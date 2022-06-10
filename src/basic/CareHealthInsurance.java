package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareHealthInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("//input[@id='policynumber']")).sendKeys("86186829");
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select s = new Select(month);
		s.selectByVisibleText("Aug");
		WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select s1 = new Select(year);
		s1.selectByVisibleText("1995");
		driver.findElement(By.xpath("//a[text()='15']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("8618682789");
		driver.findElement(By.xpath("//button[text()='Lets Renew']")).click();
		
		String policynum = driver.findElement(By.id("policynumberError")).getText();
		String policyErrorMsg = "llz enter valid policy no";
		
		if(policynum==policyErrorMsg)
		{
			System.out.println("error message displayed is matching"+policynum);
		}
		else
			System.out.println("erroe mesg displayed is not matching");
		
		
		
		
		

	}

}
