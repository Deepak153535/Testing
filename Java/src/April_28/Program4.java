package April_28;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program4 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4qsiujpf5j_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486393568006&hvpos=&hvnetw=g&hvrand=13186593432265116496&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9075215&hvtargid=kwd-360364908477&hydadcr=14451_2154369&gclid=Cj0KCQjw06OTBhC_ARIsAAU1yOVAeATUU0gbiyccPjGHIWBuP1jYUXqzpaQ7eX9z9I7oRuSZh6crkysaApq3EALw_wcB");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		
		
}
	
}
