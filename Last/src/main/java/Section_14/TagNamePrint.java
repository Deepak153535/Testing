package Section_14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TagNamePrint {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.cssSelector("button.btn-style.class1")).getText());
		
		List<WebElement> ele=driver.findElements(By.cssSelector("#dropdown-class-example"));
		Select s=new Select((WebElement) ele);
		
		
		for(int i=0;i<ele.size();i++)
		{
			WebElement a = ele.get(i);
			System.out.println(a.getText());
			if(i==1)
			{
				a.click();
			}
		}
		
		Thread.sleep(5000);
	
	}
}
