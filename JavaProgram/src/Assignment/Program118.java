package Assignment;

public class Program118 {

	//118.wap to sort first half in ascending order and second half in descending order.
	
	public static void main(String[] args) {
		
		int[] a= {1,4,3,5,6,9,8,7};
		
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
		//System.out.println(n);
		
		for(int i=0;i<n/2;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("===============");
		for(int i=n-1;i>=n/2;i--)
		{
			System.out.println(a[i]);
		}
		
	}
}
