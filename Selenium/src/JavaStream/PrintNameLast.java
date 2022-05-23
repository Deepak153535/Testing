package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class PrintNameLast {

	@Test
	public void demo()
	{
		//print names ends with a
		
		//Stream.of("Name","Rama","Sita","sonu").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print Array String  start with A and sort
		
		String[] names= {"java","Adam","Ama","Az"};
		
		List<String>name=Arrays.asList(names);
		
		name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}
}
