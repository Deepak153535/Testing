package Practice;

public class Program118 {

	////118.wap to sort first half in ascending order and second half in descending order.
	
	
	public static void main(String[] args) {
		
		int[] a= {2,4,2,1,7,5,3,2};
		int l=a.length;
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
	
		for(int i=0;i<l/2;i++)
		{
			System.out.println(a[i]);
		}
		
		
		System.out.println("==================");
		
		for(int i=l-1;i>=l/2;i--)
		{
			System.out.println(a[i]);
		}
	}
}
