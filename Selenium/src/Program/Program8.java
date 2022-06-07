package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("SpiceJet");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc'] //input[@value='Google Search']")).click();
		driver.findElement(By.xpath("//div[@class='BYM4Nd'] //h3[@class='LC20lb MBeuO DKV0Md']")).click();
		
		
	}
}
