package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("Flipkart");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("//h3[text()='Flipkart']")).click();
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("manager");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
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
