package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FileInputStream fileexcel = new FileInputStream("./Book1.xls.xlsx");
		Workbook wb =  WorkbookFactory.create(fileexcel);
		
		String url = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		String un = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		String pw = wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		//driver.close();
		
		
		
		
		

	}

}
