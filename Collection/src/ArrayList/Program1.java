package ArrayList;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println(a);
		
		System.out.println(a.contains(4));
		
		System.out.println(a.contains(9));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		//System.out.println(a.equals(4));
	}
	
}
