package Udemy;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_77 {

	public static void main(String[] args) {
		
		
	
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			String[] item= {"Brocolli","Carrot","Tomato","Beans"};
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			
			
	}
}
