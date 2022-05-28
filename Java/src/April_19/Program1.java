package April_19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://amozon.com");
		
		driver.navigate().to("https://Faccebook.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}
}
