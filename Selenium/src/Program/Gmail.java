
package Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("Gmail.com");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='laptop-desktop-only'])[2]")).click();
		driver.findElement(By.name("firstName")).sendKeys("Deepak");
		driver.findElement(By.name("lastName")).sendKeys("Maurya");
		driver.findElement(By.id("username")).sendKeys("deepak.1223432");
		driver.findElement(By.name("Passwd")).sendKeys("Deepak@123");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Deepak@123");
		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[1]")).click();
		
	}
}
