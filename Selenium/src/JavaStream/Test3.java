package JavaStream;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void Application()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Adam");
		names.add("Ram");
		names.add("Don");
		names.add("Raj");
		
		long d=Stream.of("Abhijeet","Adam","Ram","Don","Raj").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		
		//System.out.println(); 
		//System.out.println(d);
		
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
	}
}
