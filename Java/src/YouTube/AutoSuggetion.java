package YouTube;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://makemytrip.com");
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys("va");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys(Keys.ENTER);
	}
}
