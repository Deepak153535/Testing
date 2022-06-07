package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LilkList {

	public static void main(String[] args) {
		
		LinkedList<String>a=new LinkedList();
		
		a.add("Ravi");
		a.add("Vijay");
		a.add("Indresh");
		
		Iterator i=a.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
