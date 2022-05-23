package Program;

import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver","C\\Selenium\\chromedriver.exe");
//		
//		
//		//	WebDriverManager.chromedriver().setup();
//			System.out.println("Hello");
//			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.javatpoint.com/maven-pom-xml");
			System.out.println("Hello");
			
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//FileUtils.copyFile(screen,new File(".//sreenshot/screen.png"));
	}
}
