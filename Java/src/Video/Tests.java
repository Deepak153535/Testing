package Video;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tests {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
		
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.skillrary.com/core-java-for-selenium-training");
	
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[@class='vp-spin vp-spin-invisible']")).click();
	 
	  
	
	}
	
}
