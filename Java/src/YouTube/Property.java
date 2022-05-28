package YouTube;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property {

	public static void main(String[] args) throws IOException {
		
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./Insta.properties");
		p.load(fis);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(p.getProperty("user"));
		driver.findElement(By.name("password")).sendKeys(p.getProperty("pass"));
		
		
	}
}
