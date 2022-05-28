package April26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		if(ele.isDisplayed())
		{
			System.out.println("pass");
			ele.sendKeys("text");
		}
		else
		{
			System.out.println("fail");
		}
		driver.quit();
		
		
		
}
}
