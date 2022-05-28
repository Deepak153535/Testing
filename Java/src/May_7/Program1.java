package May_7;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program1 {

	@Test
	public void tc()
	{
		Reporter.log("java",true);
		Reporter.log("hello",false);
	}
}
