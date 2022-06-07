package Comparable;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		
		Program1 p=new Program1("java",22,5);
		Program1 p1=new Program1("php",33,2);
		Program1 p2=new Program1("c#",12,3);
		ArrayList<Program1> a=new ArrayList<Program1>();
		
		a.add(p);
		a.add(p1);
		a.add(p2);
		
		for(Program1 i:a)
		{
			System.out.println(i);
		}
		
	}
}
