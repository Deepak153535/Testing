package Assignment;

public class Program41 {

	//41.CHECK WHETHER THE NO IS PERFECT NO OR NOT.->IN CLASS
	
	public static void main(String[] args) {
		

		int n=6;
		int temp=n;
		int i=1;
		int sum=0;
		while(i<6)
		{
			if(n%i==0)
			{
				
				sum=sum+i;
			}
			i++;
		}
		if(temp==sum)
		{
			System.out.println(temp+" Perfact Number");
		}
		else
		{
			System.out.println(temp+" Not perfact number");
		}
		
		
	}
}
