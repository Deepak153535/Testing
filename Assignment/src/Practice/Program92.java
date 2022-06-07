package Practice;

public class Program92 {
//92.WAP TO CALCULATE SUM OF EVEN INDEX VALUE.
	
	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<a.length;i=i+2)
		{
			
				System.out.println(a[i]);
				sum=sum+a[i];
			
		}
		System.out.println("sum of even index number is : "+sum);
	}
}
