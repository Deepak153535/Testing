package Program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program15 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> product = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		
		for(int i=0;i<product.size();i++)
		{
			 String name = product.get(i).getText();
			// System.out.println(name);
			if(name.contains("Carrot"))
			{
				 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
		}
	}
}
