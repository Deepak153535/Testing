package Static;

public class Student {

	String name;
	int fees;
	int age;
	static String collegeName="Spic";
	public Student() {
		// TODO Auto-generated constructor stub
	}
	Student(String name, int fees,int age)
	{
		this.name=name;
		this.fees=fees;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Student name is : "+name);
		System.out.println("Student fees is : "+fees);
		System.out.println("Student age is : "+age);
		System.out.println("Student College name is : "+collegeName);
		System.out.println("============================");
	}
}
