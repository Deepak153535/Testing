package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightClick {

	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		
	}
	@Test
	public void rightClick()
	{
		WebElement web=driver.findElement(By.name("q"));
		Actions action=new Actions(driver);
		action.contextClick(web).perform();
		Reporter.log(driver.getCurrentUrl(),true);
		
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
