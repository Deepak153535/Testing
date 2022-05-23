package Program;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=flipkart&rlz=1C1CHBF_enIN998IN998&oq=flip&aqs=chrome.1.69i60j69i59j69i57j35i39j0i67j0i67i131i433j69i60l2.6317j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,500)"," ");
		
		
	}
}
