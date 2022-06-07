package Assignment;

public class Program43 {

	//43.WAP TO CALCULATE FACTORIAL OF  A NUMBER.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=5;
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(n+" Factorial is : "+fact);
	}
}
