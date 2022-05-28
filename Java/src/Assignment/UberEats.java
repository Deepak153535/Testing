package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UberEats {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("uber eats");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("//h3[text()='Uber Eats US | Food Delivery and Takeout | Order Online from ...']")).click();
		driver.findElement(By.cssSelector("a[data-test='header-sign-in']")).click();
		driver.findElement(By.cssSelector("input[inputmode='email']")).sendKeys("deepak");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Uber"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}
}
