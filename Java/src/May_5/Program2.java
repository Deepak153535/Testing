package May_5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./Book2.xlsx");	
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String pass=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String us=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys(us);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		
		
		
	}
}
