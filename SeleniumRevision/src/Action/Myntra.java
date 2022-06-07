package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myntra {

	public WebDriver driver;
	@BeforeTest
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAjwx46TBhBhEiwArA_DjF2HQTwJfFDDIxYZkoyhS5nZ3frsxzmxJh79QUh6i-r0abowNgVyExoCZwQQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
	}
	@Test
	public void mouseOver()
	{
		WebElement web = driver.findElement(By.xpath("//a[text()='Home & Living']"));
		Actions action=new Actions(driver);
		action.moveToElement(web).perform();
		Reporter.log(driver.getCurrentUrl(),true);
	}
	@AfterTest()
	public void closeApp()
	{
		driver.quit();
	}

}
