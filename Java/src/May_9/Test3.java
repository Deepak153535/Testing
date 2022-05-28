package May_9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {

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
	public void createApp()
	{
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.xpath("//div[text()='Get Started']")).click();
		
		Reporter.log(driver.getCurrentUrl(),true);
		Reporter.log(driver.getTitle(),true);
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
}
