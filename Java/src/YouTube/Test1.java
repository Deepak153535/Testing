package YouTube;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
			
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.instagram.com/");
				driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
				
				Program1 p=new Program1(driver);
				p.user("admin");
				p.pass("manager");
				
	}
}
