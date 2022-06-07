package Assignment;

public class Program79 {

	//79.WAP TO PRINT ARRAY ELEMENTS IN REVERSE ORDER.->IN CLASS
	
	public static void main(String[] args) {
		
		int[] n= {2,3,4,5,6,7,9};
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			sum=sum*10+n[i];
			
		
		}
		while(sum>0)
		{
			int rem=sum%10;
			System.out.print(rem);
			sum=sum/10;
		}
	}
}
