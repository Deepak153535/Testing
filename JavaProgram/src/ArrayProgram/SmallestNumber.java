package ArrayProgram;

public class SmallestNumber {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6};
		
		int small=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		System.out.println("Smallest Number : "+small);
	}
}
