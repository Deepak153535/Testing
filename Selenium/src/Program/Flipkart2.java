package Program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/search?q=laptop&as=on&as-show=on&otracker=AS_Query_PredictiveAutoSuggest_1_0_na_na_na&otracker1=AS_Query_PredictiveAutoSuggest_1_0_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=laptop&requestId=2b0c1a34-dec2-46f2-8e2b-d977a540c08b");
		List<WebElement>product =driver.findElements(By.xpath("//span[text()='Add to Compare']"));
		for(int i=0;i<=product.size();i++)
		{
			String name=product.get(i).getText();
			
			if(name.contains("ROG Zephyrus G15 Ryzen 9 Octa Core 5900HS"))
			{
				driver.findElements(By.xpath("//span[text()='Add to Compare']")).get(i).click();
			}
		}
	}	
}
