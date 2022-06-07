package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Program3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(12);
		a.add(1);
		a.add(34);
		a.add(23);
		a.add(45);
		
		
		Iterator<Integer> i=a.iterator();
		
		while(i.hasNext())
		{
			Integer j=i.next();
			
			if(j%2==0)
			{
				i.remove();
			
			}
		}
		for(int b:a)
		{
			System.out.println(b);
		}
		
	}
}
