package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Deepak");
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("Maurya");
		driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("upsssc01@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@ for='gender-radio-1']")).click();
		driver.findElement(By.cssSelector("input[id='userNumber']")).sendKeys("8009592172");
		driver.findElement(By.cssSelector("input[id='dateOfBirthInput']")).click();
		driver.findElement(By.cssSelector("div[aria-label='Choose Tuesday, December 28th, 2021']")).click();
		driver.findElement(By.cssSelector("input[id='hobbies-checkbox-1']")).click();
		
		
	}
}
