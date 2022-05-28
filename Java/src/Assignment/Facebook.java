package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("Facebook");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("//h3[text()='Facebook - log in or sign up']")).click();
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up"))
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
