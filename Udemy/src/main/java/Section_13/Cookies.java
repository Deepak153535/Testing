package Section_13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies {

	
	@Test
	public void test()
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteCookie(null);
		driver.manage().deleteAllCookies();
		driver.get("https//Google.com/");
		
	}
}
