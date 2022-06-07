package ArrayList;

import java.util.ArrayList;

public class ForEeach {

	public static void main(String[] args) {
		
		ArrayList<Integer>a=new ArrayList();
		
		a.add(2);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(1);
		a.add(10);
		a.add(11);
		a.add(9);
	
		for(int i:a)
		{
			System.out.println(i);
		}
	}
}
