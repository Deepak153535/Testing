package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student s=new Student("java",12);
		Student s1=new Student("tython",35);
		Student s3=new Student("c#",22);
		
		ArrayList<Student> a=new ArrayList<Student>();
		
		a.add(s);
		a.add(s1);
		a.add(s3);
		
		
		Comparator<Student> getName=new Comparator<Student>()
		{
			public int compare(Student s1,Student s2)
			{
				return s1.name.compareTo(s2.name);
			}
		};
		
		Collections.sort(a,getName);
		System.out.println(a);
		
	}
}
