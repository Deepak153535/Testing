package April_30;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://drive.google.com/drive/shared-with-me");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File type = ts.getScreenshotAs(OutputType.FILE);
		File file=new File("./Photo/twitter.png");
		FileUtils.copyFile(type, file);
		
		
		
	}
}
