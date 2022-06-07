package Static;

public class A {

	//this: to invoke current class method
	
	void m()
	{
		System.out.println("hello m");
	}
	void n()
	{
		System.out.println("hello n");
		this.m();
	}
}
