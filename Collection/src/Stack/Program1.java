
package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Program1 {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		
		s.push(2);
		s.push(3);
		s.push(5);
		s.push(6);
		
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		
		System.out.println(s);
		
		ArrayList a=new ArrayList(s);
		
		System.out.println(a);
		//System.out.println(a.);
		
		
		
		
	}
}
