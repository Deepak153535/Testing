package Static;

public class D {

	// this: to pass as an argument in the method
	
	void m(D a)
	{
		System.out.println("method is invoke");
	}
	void c()
	{
		m(this);
	}
	public static void main(String args[])
	{
		D d=new D();
		d.c();
	}
}
