import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apri_19l {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		WebElement data=driver.findElement(By.id("email"));
		data.sendKeys("java");
		driver.findElement(By.name("pass")).sendKeys("manager");
	
		WebElement ele=driver.findElement(By.name("login"));
		
		System.out.println(ele.getLocation());
		System.out.println(ele.getText());
		System.out.println(ele.getSize());
		System.out.println(ele.getAttribute("name"));
		driver.quit();
	}
}
