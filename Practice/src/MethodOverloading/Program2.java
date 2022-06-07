package MethodOverloading;

public class Program2 {

	public static void main(String[] args) {
		main("java");
		main(2,5);
		main(new int[]{3,2,4});
		
	}
	public static void main(String a)
	{
		System.out.println("String");
	}
	public static void main(int[] a)
	{
		System.out.println("Array ");
	}
	public static void main(int a,int b)
	{
		int result=a*b;
		System.out.println(result);
				
	}
	
}
