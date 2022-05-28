package April20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://Facebook.com");
		driver.findElement(By.id("email")).sendKeys("Deepakjava");
		driver.findElement(By.name("pass")).sendKeys("Hello");
		driver.findElement(By.name("login")).click();
	}
}
