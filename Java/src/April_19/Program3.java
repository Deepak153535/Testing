package April_19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		
		driver.get("https://Facebook.com");
		
	}
}
