package ArrayDeque;

import java.util.Collection;
import java.util.Deque;

public class Program1 {

	public static void main(String[] args) {
		
		Deque<String> a=new ArrayDeque<String>();
		a.add("java");
		a.add("php");
		a.add("python");
		a.add("c#");
		
		System.out.println(a);
	}
}
