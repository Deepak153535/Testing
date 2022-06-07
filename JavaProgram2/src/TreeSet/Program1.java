package TreeSet;

import java.util.TreeSet;

public class Program1 {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		t.add(44);
		t.add(5);
		t.add(56);
		//t.add("java");
		System.out.println(t);
		
		t.first();
		System.out.println(t.first());
		System.out.println(t.last());
	}
}
