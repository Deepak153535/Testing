package ArrayProgram;

public class PrintReverse {

	
	public static void main(String[] args) {
		
		
		int a[]={1,2,3,4,5,6};
		
		int big=a[0];
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
		
				if(big<a[j])
				{
					big=a[j];
					System.out.println(big);
				}
				
			}
			
		
		}
	}
}
