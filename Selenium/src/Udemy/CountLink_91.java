package Udemy;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLink_91 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2
		WebElement footer = driver.findElement(By.xpath("(//div[@class='container-fluid'])[2]"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//3
		WebElement foot = driver.findElement(By.xpath("(//div/div/ul[1])[60]"));
		System.out.println(foot.findElements(By.tagName("a")).size());
		
		//4
		
		for(int i=1;i<foot.findElements(By.tagName("a")).size();i++)
		{
			
			String link=Keys.chord(Keys.CONTROL,Keys.ENTER);
			foot.findElements(By.tagName("a")).get(i).sendKeys(link);
		}
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			//Thread.sleep(5000);
			
		
		
		driver.quit();
	}
}
