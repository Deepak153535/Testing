package Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("nukari");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		driver.findElement(By.cssSelector("input[placeholder='Enter skills / designations / companies']")).sendKeys("Core java");
		driver.findElement(By.cssSelector("input[placeholder='Enter location']")).sendKeys("Noida");
		driver.findElement(By.id("expereinceDD")).sendKeys("Fresher");
		driver.findElement(By.cssSelector("div[class='qsbSubmit']")).click();
		driver.findElement(By.xpath("(//i[@class='fleft naukicon naukicon-checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//i[@class='fleft naukicon naukicon-checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//i[@class='fleft naukicon naukicon-checkbox'])[7]")).click();
		driver.findElement(By.xpath("(//i[@class='fleft naukicon naukicon-checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//i[@class='fleft naukicon naukicon-checkbox'])[15]")).click();
		driver.findElement(By.xpath("(//i[@class='fleft naukicon naukicon-checkbox'])[18]")).click();
		driver.findElement(By.xpath("(//i[@class='fleft naukicon naukicon-checkbox'])[21]")).click();
		driver.findElement(By.xpath("(//i[@class='fleft naukicon naukicon-checkbox'])[23]")).click();
		driver.findElement(By.xpath("(//i[@class='fleft naukicon naukicon-checkbox'])[32]")).click();
		driver.findElement(By.xpath("(//i[@class='fleft naukicon naukicon-checkbox'])[33]")).click();
		
		
		
		
	}
}
