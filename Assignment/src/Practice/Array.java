package Practice;

public class Array {

	//i/p={3,6,7,9,5,11}
	//o/p={3,7,5,11}

	
	public static void main(String[] args) {
		
		int[] a= {3,6,7,9,5,11};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]%a[j]==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[i]);
			}
			
		}
		
	}
}
