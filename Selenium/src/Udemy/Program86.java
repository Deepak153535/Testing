package Udemy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program86 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.get("https://www.sarkariresult.com/");
		driver.findElement(By.xpath("//a[text()='BSF Group B SI Work, JE Electrical Online Form 2022']")).click();
		
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		
		System.out.println(driver.findElement(By.xpath("//b[text()='Border Security Force (BSF)']")).getText());
		driver.findElement(By.xpath("//b[text()='Border Security Force (BSF)']")).getText();
	
		
	}
}
