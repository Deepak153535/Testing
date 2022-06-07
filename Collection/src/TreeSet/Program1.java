package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Program1 {

	public static void main(String[] args) {
		
		TreeSet<String> a=new TreeSet<String>();
		
		a.add("java");
		a.add("php");
		a.add("selenium");
		a.add("javac");
		
		System.out.println(a.pollFirst());
		System.out.println(a.pollLast());
		System.out.println(a);
		
		Iterator i=a.descendingIterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
