package Udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Expired {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		
	}
}
