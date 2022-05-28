package May_10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Program1 {

	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void demo(String b)
	{
		if(b.equals("chrome"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");	
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		Reporter.log(title,true);
		Reporter.log(url,true);
	}
	
}
