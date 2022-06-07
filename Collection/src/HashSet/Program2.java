package HashSet;

import java.util.HashSet;

public class Program2 {

	public static void main(String[] args) {
		
		HashSet s=new HashSet();
		s.add(2);
		s.add(4);
		s.add(3);
		s.add(3);
		
		System.out.println(s);
		System.out.println();
		System.out.println("java".hashCode());
		System.out.println("php".hashCode());
	}
}
