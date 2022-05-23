package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program13 {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.com");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("flight booking");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		driver.findElement(By.cssSelector("input[id='fromCity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='makeFlex hrtlCenter'])[2]")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='toCity']")).click();
		//driver.findElement(By.xpath("((//div[@class='makeFlex hrtlCenter'])[4]")).click();
		driver.findElement(By.cssSelector("p[data-cy='departureDay']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Wed Apr 20 2022']")).click();
		//driver.findElement(By.cssSelector("div[aria-label='Wed Apr 27 2022']")).click();
		driver.findElement(By.cssSelector("a[class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		//react-autowhatever-1-section-0-item-1
		//react-autowhatever-1-section-0-item-1
		//makeFlex hrtlCenter
		//makeFlex hrtlCenter
		
	}
}
