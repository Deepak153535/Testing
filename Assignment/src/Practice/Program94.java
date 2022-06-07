package Practice;

public class Program94 {

	//94.WAP TO FIND MAXIMUM ELEMENT IN EVEN INDEX VALUES.
	
	public static void main(String[] args) {
		
		int[] a= {2,1,4,5,7,8,56,4,3};
		
		int big=a[0];
		
		for(int i=0;i<a.length;i=i+2)
		{
			if(big<a[i])
			{
				big=a[i];
				
			}
		}
		System.out.println("Big Element is : "+big);
	}
}
