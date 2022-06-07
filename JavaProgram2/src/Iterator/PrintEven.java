package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintEven {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(10);
		a.add(12);
		a.add(1);
		a.add(13);
		a.add(14);
		a.add(15);
		a.add(17);
		
		Iterator<Integer> i=a.iterator();
		while(i.hasNext())
		{
			Integer b=i.next();
			
			if(b%2==0)
			{
				System.out.println(b);
			}
		}
		
	}
}
