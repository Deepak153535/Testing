package Section_7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertion_59 {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		WebElement data=driver.findElement(By.id("email"));
		data.sendKeys("java");
		Thread.sleep(3000);
		data.clear();
		
		
		
	}
	
	
	
}
