package Vector;

import java.util.ArrayList;
import java.util.Vector;

public class Program1 {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		
		System.out.println(v);
		System.out.println(v.clone());
		System.out.println(v);
		System.out.println(v.set(1, 9));
		System.out.println(v);
	//v.clear();
		System.out.println(v);
		System.out.println(v.isEmpty());
		
		ArrayList a=new ArrayList(v);
		
		System.out.println(a);
		System.out.println(a.remove(2));
		System.out.println(a);
		
		
	}
}
