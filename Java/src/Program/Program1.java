package Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://Google.com");
	}
}
