package Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=294102729729&hvpos=&hvnetw=g&hvrand=17485753403985603124&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9075215&hvtargid=kwd-311187680635&hydadcr=5841_1914865&gclid=Cj0KCQjwma6TBhDIARIsAOKuANzukhH1qF_-A3v3XqPzbMZyqLlfQkuQixfbuNa8TXNIeQ5fjyfsHoQaAiXJEALw_wcB");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement down = driver.findElement(By.cssSelector("select[id='searchDropdownBox']"));
		
		Select s=new Select(down);
		Thread.sleep(2000);
		s.selectByIndex(9);
		Thread.sleep(2000);
		s.selectByValue("search-alias=nowstore");
		Thread.sleep(2000);
		s.selectByVisibleText("Alexa Skills");
		Thread.sleep(5000);
		driver.quit();
	}

}
