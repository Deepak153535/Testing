package Udemy_Revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program84 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");	
		Actions action=new Actions(driver);
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		//action.moveToElement(driver.findElement(By.xpath("//div[text()='Appliances']"))).build().perform();
		
		action.moveToElement(driver.findElement(By.name("q"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	}
	
}
