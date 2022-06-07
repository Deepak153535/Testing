package ArrayProgram;

public class Program16 {

	//3 largest number
	public static void main(String[] args) {
		
	
		int a[]={6,5,4,9,3,2,7,8};
		
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
