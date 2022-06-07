package Assignment;

public class Program17 {

	//17.WAP TO PRINT EACH DIGIT IN A NUMBER(IN REVERSE ORDER).->IN CLASS
	
	public static void main(String[] args) {
		
		int number=435612679;
		int reverse=0;
		while(number>0)
		{
			int rem=number%10;
			//System.out.println(rem);
			System.out.println(rem);
			number=number/10;
		}
		
	}
}
