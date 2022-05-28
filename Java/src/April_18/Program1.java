package April_18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://FaceBook.com");
		
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	}
}
