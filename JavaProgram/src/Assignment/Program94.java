package Assignment;

public class Program94 {

	//94.WAP TO FIND MAXIMUM ELEMENT IN EVEN INDEX VALUES.
	
	public static void main(String[] args) {
		
		int[] a= {2,5,7,9,3,2,1,5,8,0};
		int max=a[0];
		
		for(int i=0;i<a.length;i=i+2)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Even index maximum number is : "+max);
		
	}
}
