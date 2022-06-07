package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program1 {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		
		l.add(20);
		l.add("java");
		l.add(23);
		
		
		ListIterator i=l.listIterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("==============");
	
		
	
		
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		
		
	}
}
