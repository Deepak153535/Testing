package April_28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program3 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		Actions a=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[text()='COURSE']"));
		Thread.sleep(3000);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		
		WebElement ele1 = driver.findElement(By.id("add"));
		Thread.sleep(3000);
		a.doubleClick(ele1).perform();
}
}
