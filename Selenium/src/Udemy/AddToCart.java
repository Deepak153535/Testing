package Udemy;

import java.util.Arrays;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		String[] item= {"Brocolli","Carrot","Tomato","Beans"};
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");	
	
		
		test(driver,item);
		
	}
	public static void test(WebDriver driver,String[]item)
	{
		int j=0;
		
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<product.size();i++)
		{
			String[] name=product.get(i).getText().split("-");
			
			String nameList=name[0].trim();
			
			List arr=Arrays.asList(item);
			//System.out.println(nameList);
			//System.out.println(arr+" ");
		
			if(arr.contains(nameList))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==item.length)
				{
					break;
				}
			}
			
			
		}
	}
}
