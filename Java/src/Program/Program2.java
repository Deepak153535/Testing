package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Google.com");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("twitter");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='text']")).sendKeys("upsssc01@gmail.com");
		driver.findElement(By.cssSelector("div[style='color: rgb(255, 255, 255);']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Deepak@8009592");
		driver.findElement(By.cssSelector("div[style='color: rgb(255, 255, 255);']")).click();

		
		
	}
}
