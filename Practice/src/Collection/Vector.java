package Collection;
import java.util.*;
public class Vector {

	public static void main(String[] args) {
		
		//Vector a=new Vector();
		Stack<String >a=new Stack();
		
		a.add("Java");
		a.add("JavaTpoint");
		a.add("Er");
		
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}
