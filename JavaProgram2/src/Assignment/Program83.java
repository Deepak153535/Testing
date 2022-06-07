package Assignment;

public class Program83 {

	//83.WAP TO CALCULATE SUM OF EVEN ELEMENTS IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int[] a= {2,2,3,4,5,6,7,8,9,1};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}
}
