package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program8 {

	public static void main(String[] args) {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Google.com");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Facebook");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Deepak");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Maurya");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).click();
		driver.findElement(By.cssSelector("input[id='password_step_input']")).sendKeys("Deepak@124");
		//driver.get
	}
}
