package Assignment;

public class Program57 {

	//57.WAP TO CHECK NUMBER IS STRONG NUMBER OR NOT.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=145;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			int b=1;
			int fact=1;
			while(b<=rem)
			{
				fact=fact*b;
				b++;
			}
			sum=sum+fact;
			n/=10;
		}
			if(temp==sum)
			{
				System.out.println(temp+" Strong number");
			}
			else
			{
				System.out.println(temp+" not Strong number");
			}
		
		
	} 
}
