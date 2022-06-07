package Assignment;

public class Program25 {

	//25.WAP TO COUNT HOW MANY DIGITS ARE PRESENT IN A NUMBER.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=43676128;
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
	}
}
