package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(1);
		a.add(5);
		a.add(10);
		a.add(2);
		
		Collections.sort(a);
		
		for(Integer b:a)
		{
			System.out.println(b);
		}
	}
}
