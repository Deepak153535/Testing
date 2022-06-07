package Assignment;

public class Program28 {

	//28.WAP TO REVERSE THE NUMBER.->IN CLASS
	
	
	public static void main(String[] args) {
		
		int n=9823198;
		
		while(n>0)
		{
			int rem=n%10;
			System.out.println(rem);
			n=n/10;
		}
		
	}
}
