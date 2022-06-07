import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GreenCart {

	WebDriver driver;
	@Test
	public void test()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//tr/th[1]
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> text = ele.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(text);
		
		
	}
}
