package Comparator;

import java.util.Comparator;

public class Student implements Comparable<Student>{

	int id;
	String name;
	int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return id+" "+name+" "+age;
	}
	public int compareTo(Student st)
	{
		if(age>st.age)
		{
			return 1;
		}
		else if(age==st.age)
		{
			return 0;
		}
		else
		{
			return -1;
		}
		
	}
	
	
}
