package Assignment;

public class Program41 {

	//41.CHECK WHETHER THE NO IS PERFECT NO OR NOT.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=28;
		int i=1,sum=0;
		while(i<=n/2)
		{
			if(n%i==0)
			{
			//	System.out.println(i);
				sum=sum+i;
			}
			
			i++;
		}
		//System.out.println("sum is "+sum);
		if(n==sum)
		{
			System.out.println(n+" : Number is perfact");
		}
		else
		{
			System.out.println(n+" : Number is not perfact");
		}
	}
}
