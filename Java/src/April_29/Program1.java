package April_29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement b1 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		WebElement b2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.dragAndDrop(b1, b2).perform();
		
	}
}
