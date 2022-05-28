package April_30;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ram = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Photo/flipkart.png");
		FileUtils.copyFile(ram, dest);
		
		
		driver.close();
}
}
