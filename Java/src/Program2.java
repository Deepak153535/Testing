import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program2 {

	@Test(priority=1)
	public void go()
	{
		Reporter.log("hello",true);
	}

	@Test(priority=-2)
	public void hi()
	{
		Reporter.log("hello",true);
	}

	@Test(invocationCount = 2,priority = -2)
	public void jo()
	{
		Reporter.log("hello",true);
	}
}
