package Selion_7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion_56 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		List<WebElement>option=driver.findElements(By.xpath("//ul[@id='ui-id-1'] //a"));
		Thread.sleep(3000);
		for(WebElement options:option)
		{
			if(options.getText().equalsIgnoreCase("india"))
			{
				options.click();
				break;
			}
		}
		Thread.sleep(4000);
		driver.quit();
		
	}
}
