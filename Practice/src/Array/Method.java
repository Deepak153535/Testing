package Array;

public class Method {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6};
		
		 min(a);
	}
	public static void min(int ar[])
	{
		int min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
			
		
			if(min>ar[i])
			{
				min=ar[i];
			}
		}
		System.out.println(min);
		
	}
}
