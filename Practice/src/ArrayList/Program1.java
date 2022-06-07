package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;



public class Program1 {

	public static void main(String[] args) {
		
		ArrayList<String>a=new ArrayList<String>();
		
		a.add("java");
		a.add("Prasant");
		a.add("Arindum");
		a.add("javatpoint");
		
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}
}
