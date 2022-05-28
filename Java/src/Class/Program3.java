package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://amozon.com");
		
		driver.navigate().to("https://Faccebook.com");
		
		
	}
}
