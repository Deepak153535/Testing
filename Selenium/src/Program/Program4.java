package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://Google.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("SpiceJet");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'])[57]")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-ov7bg r-z2wwpe r-utggzx r-atwnbb r-cfp7ip'])[13]")).click();
		driver.findElement(By.xpath("(//div[@tabindex='0'])[33]")).click();
		//driver.findElement(By.xpath(xpathExpression))
		
	}
}
