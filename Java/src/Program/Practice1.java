package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Deepak");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Maurya");
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.xpath("(//input[@style='width:95%;padding:4px 0px 4px 5px;margin:4px 0px'])[3]")).sendKeys("12-Feb-2022");
		driver.findElement(By.cssSelector("input[value='Automation Tester']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Selenium IDE']")).click();
		driver.findElement(By.cssSelector("select[name='continents']")).click();
		driver.findElement(By.xpath("(//select[@style='width:95%;padding:4px 0px 4px 5px;margin:4px 0px;outline:1px solid #d6d6d6!important'])[2]")).click();
		
	}
}
