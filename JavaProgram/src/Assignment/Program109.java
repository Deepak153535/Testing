package Assignment;

public class Program109 {

	//109.WAP TO DESIGN A METHOD TO RETURN SMALLEST ELEMENT IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int a=test();
		System.out.println("Find Smallest number is : "+a);
		
	}
	public static int test()
	{
		int[]a= {3,1,6,4,2,8,5,7,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		int c=a[0];
		return c;
	}
}
