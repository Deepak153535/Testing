package Jion;

public class First {

	public static void main(String[] args) {
		
		int[]a= {3,5,6,7,4,2,1,4,8,9};
		int n=a.length;
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
		for(int i=0;i<n/2;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=n-1;i>n/2-1;i--)
		{
			System.out.println(a[i]);
		}
	}
}
