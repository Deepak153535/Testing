package Pro;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Car {

	@BeforeTest
	public void go()
	{
		System.out.println("Drive slowly");
	}
	@BeforeMethod
	public void fast()
	{
		System.out.println("Fast");
	}
	
}
