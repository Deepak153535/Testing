package May_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test1 {

	@FindBy(id="email")
	private WebElement id;
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy(name="login")
	private WebElement login;
	
	public Test1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void user(String name)
	{
		id.sendKeys(name);
	}
	public void password(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void loginp()
	{
		login.click();
	}
}
