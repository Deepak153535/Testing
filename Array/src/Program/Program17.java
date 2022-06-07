package Program;

public class Program17 {

	//17.WAP TO PRINT EACH DIGIT IN A NUMBER(IN REVERSE ORDER).->IN CLASS
	
	public static void main(String[] args) {
		
		int n=147321;
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
			
		}
		System.out.println(sum);
	}
}
