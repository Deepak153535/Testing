package Assignment;

public class Program108 {

	//108.WAP TO DESIGN A METHOD TO RETURN SECOND LARGEST ELEMENT IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int a=test();
		System.out.println(a+" ");
		
	}
	public static int test()
	{
		int[]a= {3,4,6,7,2,3,1};
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
			int c=a[1];
			return c;
	}
}
