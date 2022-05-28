package April_30;

import java.time.Duration;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		
				
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-5000)");
		
		
	}

}
