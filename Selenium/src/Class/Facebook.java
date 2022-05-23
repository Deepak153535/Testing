package Class;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Facebook.com");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		for(WebElement i:option)
		{
			System.out.println(i.getText());
		}
		System.out.println(s.isMultiple());
		String text = ele.getText();
		String[] sp = text.split("\n");
		Arrays.sort(sp);
		System.out.println(Arrays.toString(sp));
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
