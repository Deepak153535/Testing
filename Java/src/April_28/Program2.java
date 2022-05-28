package April_28;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAjwx46TBhBhEiwArA_DjF2HQTwJfFDDIxYZkoyhS5nZ3frsxzmxJh79QUh6i-r0abowNgVyExoCZwQQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions a=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Home & Living'])[1]"));
		a.moveToElement(ele).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Clocks']")).click();
		
		
		
	}
}
