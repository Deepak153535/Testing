package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Google.com");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("flipkart");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("realme laptop");
		driver.findElement(By.cssSelector("button[class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[2]")).click();
	}
}
