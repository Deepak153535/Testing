package Assignment;

public class Program29 {

	//29.WAP TO CHECK WHETHER THE NUMBER IS PALINDROME OR NOT.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=163;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome ");
		}
	}
}
