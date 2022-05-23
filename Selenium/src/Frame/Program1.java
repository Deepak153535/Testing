package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		WebElement web = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(web).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("close-pop")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("inputValEnter")).sendKeys("623731232");
		Thread.sleep(5000);
		driver.quit();
	}
}
