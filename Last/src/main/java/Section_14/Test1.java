package Section_14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		WebElement drop=driver.findElement(By.id("dropdown-class-example"));
		
		Select s=new Select(drop);
		//s.selectByIndex(2);
		//s.selectByValue("option1");
		s.selectByVisibleText("Option3");
		System.out.println(s.getFirstSelectedOption().getText());
	
		//driver.quit();
	}
}
