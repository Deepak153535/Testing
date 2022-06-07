package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.internal.Lists;

public class Program1 {
	
	public static void hilightColor(WebDriver driver,String xPath)
	{
	
		//String path="\""+xPath+"\"";
	//	System.out.println(path);
		WebElement ele = driver.findElement(By.xpath(xPath));
        //Create object of a JavascriptExecutor interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //use executeScript() method and pass the arguments
        //Here i pass values based on css style. Yellow background color with solid red color border.
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fa-etao-dev17-saasfademo1.ds-fa.oraclepdemos.com/webcenter/portal/main/pages_home?type=hrz&v=10");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		Program1.hilightColor(driver, "(//a[@class='btn login-buttons'])[1]");
		driver.findElement(By.xpath("(//a[@class='btn login-buttons'])[1]")).click();
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("Calvin.roth");
		Program1.hilightColor(driver, "//input[@name='userid']");
		driver.findElement(By.id("password")).sendKeys("aJT6U?3^");
		driver.findElement(By.id("btnActive")).click();
		driver.findElement(By.cssSelector("svg[id='pt1:_UISmmLink::icon']")).click();
		driver.findElement(By.id("pt1:_UISnvr:0:nvgpgl2_groupNode_procurement")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//img[@title='Tasks']")).click();
		driver.findElement(By.xpath("//a[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:RAtl5']")).click();
		driver.findElement(By.xpath("(//select[@class='x2h'])[1]")).click();
		driver.findElement(By.xpath("//option[text()='US1 Business Unit']")).click();
		driver.findElement(By.cssSelector("input[id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:Supplier::content']")).sendKeys("OPKEY-2446");					
		driver.findElement(By.xpath("//button[@id='_FOpt1:_FOr1:0:_FONSr2:0:_FOTRaT:0:dynam1:0:commandButton1']")).click();
		driver.findElement(By.xpath("(//a[@onclick='this.focus();return false'])[14]")).click();
		driver.findElement(By.xpath("(//span[@style='white-space: nowrap'])[170]")).sendKeys("Test");
		driver.findElement(By.xpath("(//span[@style='white-space: nowrap'])[172]")).sendKeys("2");
		driver.findElement(By.xpath("(//span[@class='x1o0'])[12]")).click();
		driver.findElement(By.xpath("(//tr[@_afrrk='9'])[6]")).click();
		driver.findElement(By.xpath("(//td[@style='width:70px;'])[2]")).sendKeys("4");
		//driver.findElement(By)
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("scroll(0,500)"," ");
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
