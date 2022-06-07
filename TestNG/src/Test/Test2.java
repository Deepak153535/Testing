package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	@Parameters({"URL"})
	@Test
	public void MobileTest1(String name)
	{
		
		System.out.println("Mobiletest1");
		System.out.println(name);
	}
	@Test(timeOut=4000)
	public void MobileTest2()
	{
		
		System.out.println("Mobiletest2");
	}
	@Test(enabled=false)
	public void MobileTc()
	{
		System.out.println("Mobiletc");
	}
	
}
