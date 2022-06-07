package Assignment;

public class Program59 {

	//59.WAP TO CHECK SPECIAL TWO DIGIT NUMBER.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=59;
		int temp=n;
		int sum=0,c=0;
		int m=1;
		while(n>0)
		{
			int rem=n%10;
			m=m*rem;
			sum=sum+rem;
			n=n/10;
		}
		c=m+sum;
		if(temp==c)
		{
			System.out.println("Special two digit number is : "+c);
		}
		else
		{
			System.out.println("not Special two digit number is : "+c);
		}
	}
}
