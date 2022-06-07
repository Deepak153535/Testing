package Vector;

import java.util.Vector;

public class Program2 {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(1);
		v.add(2);
		v.add(3);
		v.addElement(4);
		v.addElement(5);
		v.addElement(6);
		v.add(1);
		v.add(2);
		v.add(3);
		v.addElement(4);
		v.addElement(5);
		v.addElement(6);
		
		System.out.println(v);
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v);
		System.out.println(v.remove(1));
		
		System.out.println(v);
		
		
	}
}
