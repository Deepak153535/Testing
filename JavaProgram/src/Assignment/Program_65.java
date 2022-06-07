package Assignment;

public class Program_65 {

	//65.WAP TO CHECK NO IS ARMSTRONG NUMBER.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=371;
		int temp=n;
		
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			int cube=1;
			int i=1;	
			while(i<=3)
			{
				cube=cube*rem;
				i++;
				
			}
			sum=sum+cube;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" Armstrong number");
		}
		else
		{
			System.out.println(temp+" Not armstrong number");
		}
	}
}
