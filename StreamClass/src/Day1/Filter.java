package Day1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Filter {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("java");
		a.add("python");
		a.add("php");
		a.add("c#");
		
		 long count = a.stream().filter(s->s.startsWith("p")).count();
		
	//	System.out.println(count);
		 
		 long data=Stream.of("java","python","php","c#").filter(s->
		 {
		 
			 s.startsWith("p");
			 return false;
		 }).count();
		 
		 System.out.println(data);
		 a.stream().filter(s->s.length()>1).limit(3).forEach(s->System.out.println(s));
	}
}
