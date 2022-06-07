package Stack;

import java.util.Stack;

public class Program2 {

	public static void main(String[] args) {
		
		Stack v=new Stack();
		v.add(4);
		v.add(1);
		v.add(2);
		v.add(3);
		v.addElement(4);
		v.addElement(5);
		v.addElement(6);
		v.add(1);
		v.add(2);
		v.add(3);
		v.push(5);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		System.out.println(v.peek());
		System.out.println(v);
		System.out.println(v.pop());
		System.out.println(v);
		
	}
}
