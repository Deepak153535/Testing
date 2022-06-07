package Udemy;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2
		
		WebElement ele = driver.findElement(By.cssSelector("div[class='footer__container']"));
		System.out.println(ele.findElements(By.tagName("a")).size());
		
		//3
		WebElement s=driver.findElement(By.xpath("(//div[@class='footer__wrapper-menu'])[1]"));
		System.out.println(s.findElements(By.tagName("a")).size());
		
		//4
		
		
		for(int i=1;i<s.findElements(By.tagName("a")).size();i++)
		{
			String tab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			s.findElements(By.tagName("a")).get(i).sendKeys(tab);
		}
		
		
		
	}
}
