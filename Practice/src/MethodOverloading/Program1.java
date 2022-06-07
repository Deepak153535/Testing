package MethodOverloading;

public class Program1 {

	public static void main(String[]args) {
		test(1);
		test(1,2);
		test(3,2);
		test("kc",3);
		
		
	}
	public static void test(int n)
	{
		System.out.println(n);
	}
	public static void test(int n,int m)
	{
		System.out.println(n+m);
	}
	public static void test(int c,double d)
	{
		System.out.println(c+d);
	}
	public static void test(String n,int a)
	{
		System.out.println(n+a);
	}
}
