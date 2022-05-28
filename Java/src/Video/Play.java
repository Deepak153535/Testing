package Video;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Play {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/core-java-for-selenium-training");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("(//button[@class='play rounded-box state-paused'])[1]"));
		ele.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js .executeScript("document.getElementById(\"video\").play()");
		
	
		
		
	}
}
