package Program;

public class Program25 {

	//25.WAP TO COUNT HOW MANY DIGITS ARE PRESENT IN A NUMBER.->IN CLAS
	
	public static void main(String[] args) {
		
		int n=3187323;
		int count=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		System.out.println(count);
	}
}
