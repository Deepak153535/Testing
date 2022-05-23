package Udemy;

import java.time.Duration;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program78 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] name= {"Brocolli","Cucumber","Beetroot"};
			
		Thread.sleep(3000);
		add(driver,name);
		
	}
	public static void add(WebElement driver,String[] name)
	{
		List<WebElement> product =  driver.findElements(By.cssSelector("h4[class='product-name']"));
		
		for(int i=0;i<product.size();i++)
		{
			String[] item=product.get(i).getText().split("-");
			String formate=item[0].trim();
			
			List nameNeed=Arrays.asList(name);
			if(nameNeed.contains(formate))
			{
				driver.findElement(By)
			}
		}
		
	}
}
