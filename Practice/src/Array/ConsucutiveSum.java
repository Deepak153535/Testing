package Array;

public class ConsucutiveSum {

	public static void main(String[] args) {
		
		int a[]={10,30,40,60,20,70};
		
		int big=a[0]+a[1];
		
		for(int i=1;i<a.length-1;i++)
		{
			if(big<=a[i]+a[i+1])
			{
				big=a[i]+a[i+1];
			}
		}
		System.out.println(" Consucutive sum is : "+big);
	}
}
