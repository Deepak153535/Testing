package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Program5 {

	public static void main(String[] args) {
		
		HashSet<Integer> s=new HashSet<Integer>(10,3.5f);
		s.add(3);
		s.add(5);
		s.add(6);
		s.add(3);
		
		System.out.println(s);
		
		ArrayList a=new ArrayList(s);
		
		System.out.println(a);
		
		
	}
}
