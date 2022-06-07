package Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpDriver2 {

	public static void main(String[] args) {
		
		ArrayList<Emp1> b=new ArrayList<Emp1>();
		
		b.add(new Emp1(12,"a",13));
		b.add(new Emp1(8,"z",9));
		b.add(new Emp1(15,"c",15));
		
		//System.out.println(b);
		
		Collections.sort(b);
		System.out.println("=================");
		
		
		for(Emp1 i:b)
		{
			System.out.println(i.getName()+" "+i.getAge()+" "+i.getId());
		}
	}
}
