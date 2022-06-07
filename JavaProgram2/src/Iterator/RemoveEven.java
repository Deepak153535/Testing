package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEven {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(3);
		a.add(2);
		a.add(6);
		a.add(5);
		a.add(7);
		a.add(4);
		
		Iterator<Integer> i=a.iterator();
		while(i.hasNext())
		{
			Integer b=i.next();
			
			if(b%2==0)
			{
				i.remove();
				
			}
			
		}
		System.out.println(a);
	}
}
