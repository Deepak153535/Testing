package Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Program1 {

	public static void main(String[] args) {
		
		ArrayList <Integer>a=new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		a.add(3);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);
		a.add(11);
		a.add(12);
		a.add(13);
		
		Iterator<Integer> i=a.iterator();
		
		while(i.hasNext())
		{
			Integer r=i.next();
			
			if(r%2==0)
			{
				System.out.println(r);
			}
		}
		
	}
}
