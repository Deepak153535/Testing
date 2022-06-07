package Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("automation practice form");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("//h3[text()='Test automation practice form']")).click();
		driver.findElement(By.id("name")).sendKeys("Deepak");
		driver.findElement(By.id("phone")).sendKeys("895715353");
		driver.findElement(By.id("email")).sendKeys("deepakgj");
		driver.findElement(By.id("password")).sendKeys("javatpoint");
		driver.findElement(By.id("address")).sendKeys("Varanasi");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("tuesday")).click();
		//driver.findElement(By)
		
	}
}
