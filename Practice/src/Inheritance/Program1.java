package Inheritance;

import java.util.LinkedList;

public class Program1 {

	public static void main(String[] args) {
		
		LinkedList a=new LinkedList();
		
		a.add(1);
		a.add(10);
		a.add(3);
		a.add(49);
		
		System.out.println(a);
		
		System.out.println(a.peek());
		System.out.println(a);
		System.out.println(a.poll());
		System.out.println(a);
		
		System.out.println(a.get(2));
		
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		System.out.println(a.pollFirst());
		System.out.println(a);
		System.out.println(a.clone());
		//System.out.println(a.);
		
	}
}
