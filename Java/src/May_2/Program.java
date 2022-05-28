package May_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		Actions a=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Thread.sleep(3000);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("732648333");
		driver.findElement(By.cssSelector("i[class='sd-icon sd-icon-delete-sign fnt-22']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("inputValEnter")).sendKeys("32467324");
		
		//driver.quit();
		
}
}
