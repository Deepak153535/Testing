package Assignment;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_29Apr {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement ele = driver.findElement(By.id("month"));

		Select s = new Select(ele);
		Thread.sleep(3000);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("2");
		Thread.sleep(3000);
		s.selectByVisibleText("Mar");
		Thread.sleep(3000);
		System.out.println("=========countOption=========");
		List<WebElement> a = s.getOptions();
		System.out.println(a.size());
		System.out.println("==========GetText=============");
		for (WebElement i : a) {
			System.out.println(i.getText());
		}
		System.out.println("=========Single/Multiple==========");
		System.out.println(s.isMultiple());
		if (s.isMultiple()) {
			s.deselectAll();
		}
		String text = ele.getText();

		String[] sp = text.split("\n");
		Arrays.sort(sp);
		System.out.println("===========Sort==============");
		System.out.println(Arrays.toString(sp));

		driver.quit();
	}
}
