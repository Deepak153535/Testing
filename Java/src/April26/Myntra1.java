package April26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra1 {

	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAjwx46TBhBhEiwArA_DjF2HQTwJfFDDIxYZkoyhS5nZ3frsxzmxJh79QUh6i-r0abowNgVyExoCZwQQAvD_BwE");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("(//div[@class='desktop-navContent'])[4]"));
		
		System.out.println(ele.getAttribute("class"));
		driver.quit();
		
}
}
