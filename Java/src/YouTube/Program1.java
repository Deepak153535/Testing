package YouTube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Program1 {

	@FindBy(name="username")
	private WebElement user;
	@FindBy(name="password")
	private WebElement pass;
	
	Program1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void user(String name)
	{
		user.sendKeys(name);
	}
	public void pass(String pwd)
	{
		pass.sendKeys(pwd);
	}
}
