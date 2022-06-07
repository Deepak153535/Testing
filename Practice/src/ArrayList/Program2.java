package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program2 {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);
		a.add(11);
		a.add(12);
		a.add(13);
		a.add(14);
		a.add(15);
		a.add(16);
		
		/*System.out.println(a);
		
		for(Object i:a)
		{
			System.out.println(i);
		}
		//a.remove(2);
		System.out.println(a);
		
		System.out.println(a.contains(5));
		System.out.println(a.get(4));
		*/
		LinkedList b=new LinkedList(a);
		
		System.out.println(b);
		b.remove();
		System.out.println(b);
		
		b.remove(2);
		System.out.println(b);
		
		
		
		

	}
}
