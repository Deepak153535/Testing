package Stack;

import java.util.Stack;

public class Program1 {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		s.push(25);
		
		System.out.println(s);
		
		s.peek();
		
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.firstElement());
		System.out.println(s.size());
	}
}
