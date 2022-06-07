package Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program14 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("Facebook.com");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Deepak");
		driver.findElement(By.name("lastname")).sendKeys("Maurya");
		driver.findElement(By.name("reg_email__")).sendKeys("deepak210@gmail.com");
		driver.findElement(By.cssSelector("input[aria-label='Re-enter email address']")).sendKeys("deepak210@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("3673271gg3");
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("(//option[@value='7'])[2]")).click();
		driver.findElement(By.xpath("(//option[@value='4'])[2]")).click();
		driver.findElement(By.xpath("//option[@value='1998']")).click();
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		//u_0_2_vR
		
		
	}
}
