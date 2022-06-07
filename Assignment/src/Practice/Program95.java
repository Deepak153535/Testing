package Practice;

public class Program95 {
//95.WAP TO FIND MAXIMUM ELEMENT IN ODD INDEX VALUE.
	
	
	public static void main(String[] args) {
		
		int[]a= {2,1,3,5,6,8,9};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i=i+2)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("odd index maximum number is : "+max);
	}
}
