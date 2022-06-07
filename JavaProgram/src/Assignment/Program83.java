package Assignment;

public class Program83 {

	//83.WAP TO CALCULATE SUM OF EVEN ELEMENTS IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int[] n= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2==0)
			{
				sum=sum+n[i];
			}
			
		}
		System.out.println("sum is "+sum);
	}
}
