package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program2 {

	public static void main(String[] args) {
		
		LinkedList a=new LinkedList();
		
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		
		System.out.println(a);
		for(Object i:a)
		{
			System.out.println(i);
		}
		System.out.println(a.peek());
		System.out.println(a);
		System.out.println(a.poll());
		System.out.println(a);
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		
		System.out.println(a.peekLast());
		System.out.println();
		
		ArrayList b=new ArrayList(a);
		
		System.out.println(b);
		//System.out.println(b.);
		
		
		
		
	}
}
