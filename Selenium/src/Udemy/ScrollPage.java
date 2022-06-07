package Udemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,500)");
		je.executeScript("document.querySelector(\"div[class='tableFixHead']\").scrollTop=300");
		
		List<WebElement>value=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<value.size();i++)
		{
			
			sum =sum+ Integer.parseInt(value.get(i).getText());
			
			
		}
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		
		
		
		
		
	}
}
