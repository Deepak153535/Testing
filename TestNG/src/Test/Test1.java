package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

	@Parameters({"URL"})
	@Test
	public void test1(String url)
	{
		
		System.out.println("test1");
		System.out.println(url);
	}
	
	@Test(dependsOnMethods={"test1"})
	public void tc()
	{
		System.out.println("tc");
	}
}
