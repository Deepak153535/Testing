package Practice;

public class Program89 {
//89.WAP TO FIND THE SMALLEST VALUE IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int[]a= {2,4,6,7,8,9,1,21,2};
		int small=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		System.out.println("Smallest element in an array is : "+small);
	}
}
