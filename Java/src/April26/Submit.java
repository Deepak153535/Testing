package April26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) throws InterruptedException {
		
		//https://demo.vtiger.com/vtigercrm/index.php
	
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.vtiger.com/vtigercrm/index.php");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(3000);
			WebElement usr = driver.findElement(By.id("username"));
			usr.clear();
			Thread.sleep(3000);
			WebElement pass = driver.findElement(By.id("password"));
			pass.clear();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("button[class='button buttonBlue']")).submit();
	}
}
