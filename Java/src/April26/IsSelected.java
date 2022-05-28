package April26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.cssSelector("a[rel='async']")).click();
	
	WebElement ele = driver.findElement(By.xpath("//label[text()='Female']"));

	if(ele.isSelected())
	{
	
		System.out.println("Pass");
	
	}
	else
	{
		System.out.println("Fail");
	}
	
	
driver.quit();	
}
}
