package Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NukariLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("Nukari");
		driver.findElement(By.xpath("(//input[@value='Google Search'])")).click();
		driver.findElement(By.cssSelector("div[class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")).click();
		driver.findElement(By.id("name")).sendKeys("Deepak Maurya");
		driver.findElement(By.id("email")).sendKeys("deepak210@gmail.com");
		driver.findElement(By.id("password")).sendKeys("javatpoint");
		driver.findElement(By.id("mobile")).sendKeys("8009592172");
		driver.findElement(By.cssSelector("div[data-val='fresher']")).click();
		driver.findElement(By.id("currentCity")).sendKeys("Noida, Uttar Pradesh");
		driver.findElement(By.cssSelector("div[class='chipsInputBox']")).sendKeys("Uttar Pradesh");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
	}
}
