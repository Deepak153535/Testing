package Section_14;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sorting_116 {

	 public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement>base=driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String>original=base.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String>sort=original.stream().sorted().collect(Collectors.toList());
		
		System.out.println(original);
		System.out.println(sort);
		//System.out.println(base);
		Assert.assertTrue(original.equals(sort));
		driver.quit();
		
		
		
	}
	
}
