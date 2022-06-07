package Assignment;

public class Program25 {

	//25.WAP TO COUNT HOW MANY DIGITS ARE PRESENT IN A NUMBER.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=123456789;
		
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem>0)
			{
				System.out.println(rem);
				count++;
			}
			n=n/10;
		}
		System.out.println("count number : "+count);
	}
}
