package Assignment;

public class Program43 {

	//43.WAP TO CALCULATE FACTORIAL OF  A NUMBER.->IN CLASS
	
	public static void main(String[] args) {
		
		int i=1;
		int number=5;
		int fact=1;
		while(i<=number)
		{
			fact=fact*i;
			i++;
		}
		System.err.println("Factoril is : "+fact);
	}
}
