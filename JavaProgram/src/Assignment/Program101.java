package Assignment;

public class Program101 {

	//101.DESIGN A METHOD TO ACCEPT ARRAY AND INDEX VALUE.
	
	public static void main(String[] args) {
		
	
	int []a= {1,3,5,2,6,8,4};
	
	for(int i=0;i<a.length;i++)
	{
		test(a[i],i);
		
	}	
	}
	public static void test(int a,int b)
	{
		System.out.println(a+" =>"+b);
	}
}
