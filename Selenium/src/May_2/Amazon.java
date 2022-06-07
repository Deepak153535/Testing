package May_2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/amazon-coupons/b/?ie=UTF8&node=10465704031&ref_=sv_gb_4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement sign = driver.findElement(By.id("nav-link-accountList"));
		Actions action=new Actions(driver);
		action.moveToElement(sign).perform();
		driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("4378812372");
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("java");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
