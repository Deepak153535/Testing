package Udemy_1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import graphql.Assert;

public class CheckLink1 {

	//a[href*=a]
	
public static void main(String[] args) throws MalformedURLException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
		SoftAssert a=new SoftAssert();
		 List<WebElement> links = driver.findElements(By.cssSelector("a[href*=a]"));
		
		 for(WebElement link:links)
		 {
			String url=link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respond = conn.getResponseCode();
			System.out.println(respond);
			
			a.assertTrue(respond<400,"Text  :"+link.getText()+"  "+respond);
//			if(respond>400)
//			{
//				System.out.println("Text  : "+link.getText()+"  "+respond);
//				Assert.assertTrue(true);
//			}
		 }
		a.assertAll();
		
	}
	
	
}
