package Assignment;

public class Program84 {

	//84.WAP TO CALCULATE SUM OF ODD ELEMENTS IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int[] n= {1,3,4,5,6,6,7,8};
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2==1)
			{
				sum=sum+n[i];
			}
		}
		System.out.println("sum is "+sum);
	}
}
