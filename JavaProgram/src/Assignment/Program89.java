package Assignment;

public class Program89 {

	//89.WAP TO FIND THE SMALLEST VALUE IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int[] a= {2,1,4,6,8,9,6,4,3};
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum is : "+min);
	}
}
