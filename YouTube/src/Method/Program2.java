package Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver","C:\\java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://Google.com");
	}
}
