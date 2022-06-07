package Queue;

import java.util.ArrayList;
import java.util.Collections;

public class EmpDriver1 {

	public static void main(String[] args) {
		
		Emp e1=new Emp(101,"java",24);
		Emp e2=new Emp(102,"python",27);
		Emp e3=new Emp(103,"C#",21);
		
		ArrayList<Emp> a=new ArrayList<Emp>();
		
		a.add(e1);
		a.add(e2);
		a.add(e3);
		
		System.out.println(a);
		
		Collections.sort(a);
		System.out.println("===============");
		System.out.println(a);
		
	}
}
