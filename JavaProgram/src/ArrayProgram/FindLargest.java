package ArrayProgram;

public class FindLargest {

	public static void main(String[] args) {
		
		int a[]={1,10,2,4,5,6,7,8,9};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				
			}
			

		}
		System.out.println();
	}
}
