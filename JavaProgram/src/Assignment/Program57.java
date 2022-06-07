package Assignment;

public class Program57 {

	//57.WAP TO CHECK NUMBER IS STRONG NUMBER OR NOT.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=143;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			int fact=1;
			while(rem>0)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+ " : Strong number");
		}
		else
		{
			System.out.println(temp+" : Not strong number");
		}
	}
}
