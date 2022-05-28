package YouTube;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://courses.rahulshettyacademy.com/");
		driver.findElement(By.cssSelector("a[class='theme-btn']")).click();
		driver.findElement(By.id("email")).sendKeys("upsssc01@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Deepak@8009592");
		driver.findElement(By.name("commit")).click();
		
		
		WebElement name=driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		Select s=new Select(name);	
		
		
		
	}
}
