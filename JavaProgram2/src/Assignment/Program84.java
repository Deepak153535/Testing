package Assignment;

public class Program84 {

	//84.WAP TO CALCULATE SUM OF ODD ELEMENTS IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int[] a= {1,3,4,5,6,7,8,9};
		int sum=0;
		for(int i:a)
		{
			if(i%2==1)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
