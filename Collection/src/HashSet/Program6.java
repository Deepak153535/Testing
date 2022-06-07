package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Program6 {

	//convert arraylist to hashset
	
	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList();
		
		a.add("java");
		a.add("php");
		a.add("python");
		
		HashSet<String> s=new HashSet(a);
		
		s.add("Selenium");
		
		System.out.println(s);
		
		Iterator<String> i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
