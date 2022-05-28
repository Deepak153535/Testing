package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("Amazon");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Shop Online on Amazon - Get the best deals on Amazon']")).click();
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.id("continue")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Amazon Sign In"))
		{
			System.out.println("pass");
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
