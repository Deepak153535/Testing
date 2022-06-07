package Assignment;

public class Program17 {

	//17.WAP TO PRINT EACH DIGIT IN A NUMBER(IN REVERSE ORDER).->IN CLASS
	
	
	public static void main(String[] args) {
		
		int n=1234567;
		
		while(n>0)
		{
			int rem=n%10;
			
			System.out.println(rem);
			n=n/10;
		}
		
	}
}
