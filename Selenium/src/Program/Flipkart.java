package Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("Flipkart");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		//driver.findElement(By.cssSelector("a[class='_1_3w1N']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("deepakjava");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("anjsdd");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		driver.findElement(By.linkText("New to Flipkart? Create an account")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("deepakjava");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		
	}
}
