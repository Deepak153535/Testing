package Jion;

public class BigConsecutiveSum {

	public static void main(String[] args) {
		
		int [] a= {3,5,6,8,7,4,2,1};
		
		int big=a[0];
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(big<a[i]+a[j])
				{
					big=a[i]+a[j];
				}
			}
		}
		System.out.println("Big sum is : "+big);
	}
}
