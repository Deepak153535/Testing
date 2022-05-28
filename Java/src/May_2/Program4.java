package May_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		// WebElement ele1 = driver.findElement(By.name("username"));
		
		WebElement emailTxt = driver.findElement(By.name("username"));  
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", emailTxt);
		
		
		driver.findElement(By.name("pwd")).sendKeys("manager");

	
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.id("ext-gen23")).click();
		
		driver.quit();
	}
}
