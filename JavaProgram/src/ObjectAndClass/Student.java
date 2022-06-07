package ObjectAndClass;

public class Student {

	String name;
	int id;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	Student(String n,int i)
	{
		name=n;
		id=i;
	}

	public static void main(String[] args) {
		
		Student s=new Student();
		s.name="java";
		s.id=22;
		System.out.println(s.name);
		System.out.println(s.id);
		
	}
}
