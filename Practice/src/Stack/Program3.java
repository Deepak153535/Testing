package Stack;

import java.util.Iterator;
import java.util.Stack;

public class Program3 {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<Integer>();
		
		s.add(3);
		s.add(1);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		
		Iterator<Integer> i=s.iterator();
		
		while(i.hasNext())
		{
			Integer a=i.next();
			
			if(a%2==1)
			{
				System.out.println(a);
			}
		}
		
	}
}
