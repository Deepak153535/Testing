package Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("Amazon");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.cssSelector("div[class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")).click();
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("deepakjaava");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Deepak");
		//driver.findElement(By.id("ap_phone_number")).sendKeys("8957153535");
		driver.findElement(By.id("ap_email")).sendKeys("deepakgk210@gmai.com");
		driver.findElement(By.id("ap_password")).sendKeys("sjdj3j2j");
		driver.findElement(By.id("ap_password_check")).sendKeys("sjdj3j2j");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
		
	}
}
