package Pro;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P3 {

	@Test(groups= {"Smoke"})
	public void test1()
	{
		System.out.println("test1");
	}
	@BeforeMethod
	public void method()
	{
		System.out.println("method");
	}
	
}
