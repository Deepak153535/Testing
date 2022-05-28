package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationApi {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://Facebook.com");
		
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}
