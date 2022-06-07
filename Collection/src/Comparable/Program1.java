package Comparable;

public class Program1 implements Comparable<Test1>{

	String name;
	int age;
	int rollno;
	
	Program1(String name,int age,int rollno)
	{
		this.name=name;
		this.age=age;
		this.rollno=rollno;
	}
	public int compareTo(Test1 a1,Test1 a2)
	{
		if(a1.age==a2.age)
		{
			return 0;
		}
		else if(a1.age>a2.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
		
	
}
