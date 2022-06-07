package Assignment;

public class SmallestNUmber {

	public static void main(String[] args) {
		int a[]= {3,24,6,7,89,44,3,0,1};
		int b[]= {23,2,3,5};
		
		System.out.println("small l "+getSmall(a,9));
		System.out.println(getSmall(b,4));
	}
	public static int getSmall(int[] a,int b)
	{
		for(int i=1;i<a.length;i++)
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
		return a[0];
	}
}

