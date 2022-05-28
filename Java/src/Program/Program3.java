package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://Google.com");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Google map");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		driver.findElement(By.cssSelector("input[id='searchboxinput']")).sendKeys("Victoria Canada");
		
		driver.findElement(By.cssSelector("button[id='searchbox-searchbutton']")).click();
		
		
	}
}
