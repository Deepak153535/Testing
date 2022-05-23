package JavaStream;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void App()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Adam");
		names.add("Ram");
		names.add("Don");
		names.add("Raj");
		
		Long c=names.stream().filter(a->a.startsWith("A")).count();
		System.out.println(c);
	}
			
}
