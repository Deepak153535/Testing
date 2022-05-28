package April26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAjwx46TBhBhEiwArA_DjF2HQTwJfFDDIxYZkoyhS5nZ3frsxzmxJh79QUh6i-r0abowNgVyExoCZwQQAvD_BwE");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.cssSelector("input[class='desktop-searchBar']"));
	
		Point p = ele.getLocation();
		
		System.out.println(p.getX()+" x cordinate");
		System.out.println(p.getY()+" y cordinate");
		driver.close();
	}
}
