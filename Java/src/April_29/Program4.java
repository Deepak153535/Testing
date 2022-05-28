package April_29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program4 {

public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("cars"));
		
		Select s=new Select(ele);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("90");
		Thread.sleep(3000);
		s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		
		System.out.println(s.isMultiple());
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		
}
}
