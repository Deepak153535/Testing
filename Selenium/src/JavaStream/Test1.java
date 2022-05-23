package JavaStream;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Test1 {

	//count Name satart with A
	
	@Test
	public void regular()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Adam");
		names.add("Ram");
		names.add("Don");
		names.add("Raj");
		
		int count=0;
		//System.out.println(names.size());
		for(int i=0;i<names.size();i++)
		{
			String actual =names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
}
