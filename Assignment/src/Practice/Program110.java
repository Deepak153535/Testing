package Practice;

public class Program110 {
//110.WAP TO DESIGN A METHOD TO SORT ARRAY ELEMENTS IN DESCENDING ORDER.AND RETURN SORTED ARRAY.
	
	public static void main(String[] args) {
		
		int a[]=test();
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	public static int[] test()
	{
		int[]a= {3,4,6,4,3,2,1};
		
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
		int[] c=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		return c;
	}
}
