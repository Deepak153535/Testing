package HashSet;

import java.util.HashSet;

public class Program3 {

	public static void main(String[] args) {
		
		HashSet<String> a=new HashSet<String>();
		
		System.out.println(a.add("java"));
		a.add("html");
		a.add("javascript");
		a.add("Php");
		System.out.println(a);
		System.out.println(a.add("java"));
		System.out.println(a);
		
		
	}
}
