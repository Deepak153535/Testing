package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Even {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(12);
		a.add(15);
		a.add(17);
		a.add(18);
		a.add(2);
		a.add(4);
		a.add(7);
		System.out.println(a);
		Iterator<Integer> i=a.iterator();
		
		while(i.hasNext())
		{
			Integer s=i.next();
			if(s%2==0)
			{
				System.out.println(s+"-");
				i.remove();
				
			}
			
		}
		for(Object c:a)
		{
			System.out.println(c);
		}
		
	}
}
