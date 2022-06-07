package Assignment;

public class Program29 {

	//29.WAP TO CHECK WHETHER THE NUMBER IS PALINDROME OR NOT.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=122;
		int temp=n;
		int rem=0,sum=0;
		while(n>0)
		{
			 rem=n%10;
			 sum=sum*10+rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" : Number is palindrome ");
		}
		else
		{
			System.out.println(temp+" : Number is not palindrome ");
		}
	}
}
