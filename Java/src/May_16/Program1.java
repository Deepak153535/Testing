package May_16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program1 {



	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void create()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		//Assert
		//Assert.assertEquals(
		
		//Assert sa=new SoftAssert();
		
		Reporter.log(title,true);
		Reporter.log(url,true);
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	
	}
	
}
