package Test;

public class MethodOverloading {

	public static void main(String args[])
	{
		
		test(4,3);
		
	}
	public static void test(int a)
	{
		System.out.println(a);
	}
	public static void test(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void test(String name)
	{
		System.out.println(name);
	}
	public static void test(int a,double b)
	{
		System.out.println(a*b);
	}
}
