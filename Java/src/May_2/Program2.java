package May_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2 {

	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.findElement(By.cssSelector("svg[class='gb_Ve']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Calendar']")).click();
		

		
		
}
}
