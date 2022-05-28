package April_29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462777326&hvpos=&hvnetw=g&hvrand=3187410099599906821&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9075215&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=CjwKCAjw9qiTBhBbEiwAp-GE0bfp8sccHrqbALUQ2xEI-otOhaFa06p_tO5hlZPk2oDR61KlxjP5HBoCVmkQAvD_BwE");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement ele = driver.findElement(By.name("url"));
			Select s=new Select(ele);
			Thread.sleep(3000);
			s.selectByIndex(8);
			Thread.sleep(3000);
			s.selectByValue("search-alias=automotive");
			Thread.sleep(3000);
			s.selectByVisibleText("Gift Cards");
			
			List<WebElement> all = s.getOptions();
			System.out.println(all.size());
			
			
			for(WebElement i:all)
			{
				System.out.println(i.getText());
			}
			
			
			
			
			
	}
}
