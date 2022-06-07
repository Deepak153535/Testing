package Static;

public class C {

	//Calling parameterized constructor from default constructor
	
	C()
	{
		this(4);
		System.out.println("hello a");
	}
	C(int a)
	{
		System.out.println(a);
	}
}
