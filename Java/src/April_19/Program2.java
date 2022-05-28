package April_19;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	
		
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://Facebook.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			
		}
	
}
