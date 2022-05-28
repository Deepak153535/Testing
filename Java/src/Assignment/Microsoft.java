package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Microsoft {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("Microsoft Company");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("//h3[text()='Microsoft – Cloud, Computers, Apps & Gaming']")).click();
		driver.findElement(By.xpath("//div[text()='Sign in']")).click();
		driver.findElement(By.id("i0116")).sendKeys("java");
		driver.findElement(By.id("idSIButton9")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Sign in to your Microsoft account"))
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
