package Selion_7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectPassenger {

	public WebDriver driver;

	@Test
	public void test() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		driver.findElement(By.id("divpaxinfo")).click();
		int i=1;
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
