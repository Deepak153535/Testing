package April_23;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://Facebook.com");
		driver.findElement(By.id("email")).sendKeys("java");
		driver.findElement(By.id("pass")).sendKeys("java");
		driver.findElement(By.name("login")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		String current =driver.getCurrentUrl();
		System.out.println(current);
		driver.close();
		
	}
}
