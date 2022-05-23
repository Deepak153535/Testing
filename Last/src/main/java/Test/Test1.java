package Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void test()
	{
		Reporter.log("hello",true);
	}
}

