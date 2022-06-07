package Practice;

public class Program108 {
//108.WAP TO DESIGN A METHOD TO RETURN SECOND LARGEST ELEMENT IN AN ARRAY.
	
	
	public static void main(String[] args) {
		
	int b=	test();
		
	System.out.println("Second Smallest Number is : "+b);
		
	}
	public static int test()
	{
		int[]a= {4,3,2,4,6,7,8,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			c=(a[1]);
			break;
		}
		return c;
	}
}
