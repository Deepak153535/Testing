package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {

	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
	}
	@Test
	public void drangAndDrop()
	{
		WebElement web1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement web2=driver.findElement(By.xpath("//h1[text()='Block 2']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(web2,web1).perform();
		Reporter.log(driver.getTitle(),true);
		
		
	}
	@AfterMethod()
	public void close()
	{
		driver.quit();
	}
	
	
}
