package Array;

public class Program7 {

	//print even  ||   print odd
	
	public static void main(String[] args) {
		
		
		int[]a={1,2,3,4,5,6};
		
		for(int i=1;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
		System.out.println("===============");
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
	}
}
