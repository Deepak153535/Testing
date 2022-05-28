package May_6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {


	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// ele = driver.findElement(By.cssSelector("h2[class='_8eso']"));
	
	Test1 t=new Test1(driver);
	t.user("admin");
	t.password("manager");
	t.loginp();
	
	
	
	}	
}
