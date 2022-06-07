package Assignment;

public class Program92 {

	//92.WAP TO CALCULATE SUM OF EVEN INDEX VALUE.
	
	public static void main(String[] args) {
		
		int[] n= {1,3,5,8,3,2,2};
		int sum=0;
		for(int i=0;i<n.length;i=i+2)
		{
			sum=sum+n[i];
			
		}
		System.out.println("sum is : "+sum);
	}
}
