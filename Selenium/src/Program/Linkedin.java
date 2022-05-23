package Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {

	private static final String TimeOut = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("Linkedin");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		driver.findElement(By.id("username")).sendKeys("javatpoint");
		driver.findElement(By.id("password")).sendKeys("jagagdd");
		driver.findElement(By.cssSelector("button[aria-label='Sign in']")).click();
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.id("username")).sendKeys("javatpoint");
		driver.findElement(By.id("reset-password-submit-button")).click();
		
		
	}

}
