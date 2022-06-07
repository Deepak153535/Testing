package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student s=new Student(1,"Vikas",25);
		Student s1=new Student(2,"Deepak",24);
		Student s2=new Student(3,"Ishika",2);
		
		ArrayList<Student> a=new ArrayList<Student>();
		
		a.add(s);
		a.add(s1);
		a.add(s2);
		
		Collections.sort(a);
		System.out.println(a);
		
		for(Student i:a)
		{
			System.out.println(i.id+" "+i.name+" "+i.age);
		}
		
	}
}
