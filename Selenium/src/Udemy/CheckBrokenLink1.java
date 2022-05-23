package Udemy;

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

import graphql.Assert;

public class CheckBrokenLink1 {

	
		
		public static void main(String[] args) throws MalformedURLException, IOException {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
			
			List<WebElement> links = driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
			for(WebElement link:links)
			{
				String url=link.getAttribute("href");
				
				HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				int restCode=conn.getResponseCode();
				System.out.println(restCode);
				
				if(restCode>400)
				{
					System.out.println("Text  :"+link.getText()+"  "+restCode);
					Assert.assertTrue(false);
				}
				
			}
			
			
			
			
			
			
	}
}
