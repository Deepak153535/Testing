package HashSet;

import java.util.HashSet;

public class Program1 {

	public static void main(String[] args) {
		
		
		HashSet h=new HashSet();
		
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(5);
		h.add(4);
		
		
		System.out.println(h);
		for(Object i:h)
		{
			System.out.println(i);
		}
		
		
	}
}
