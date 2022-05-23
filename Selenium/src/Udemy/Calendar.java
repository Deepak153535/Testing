package Udemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Variants|Brand-Variants-Exact|RSA|Regular|V2|274470846615&s_kwcid=AL!1631!3!274470846615!e!!g!!make%20my%20trip-&ef_id=Cj0KCQjwpcOTBhCZARIsAEAYLuWAjqWRfUMIwjaYpsm8jMruj7c-3cFUmaPA9iUJfzh841EwpCmBuIsaAuRfEALw_wcB:G:s&gclid=Cj0KCQjwpcOTBhCZARIsAEAYLuWAjqWRfUMIwjaYpsm8jMruj7c-3cFUmaPA9iUJfzh841EwpCmBuIsaAuRfEALw_wcB");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("li[class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		//driver.findElement(By.cssSelector("div[class='DayPicker-Day DayPicker-Day--selected']")).click();
		
	
		int count= driver.findElements(By.cssSelector("DayPicker-Day")).size();
		
		for(int i=0;i<=count;i++)
		{
			 String text=driver.findElements(By.cssSelector("DayPicker-Day")).get(i).getText();
			 System.out.println("text");
			 if(text.equalsIgnoreCase("23"))
			 {
				 driver.findElements(By.cssSelector("DayPicker-Day")).get(i).click();
				 break;
			 }
		}
		//driver.quit();
		
		
	}
}
