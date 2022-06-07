package Assignment;

public class Program31 {

	//31.WAP TO CALCULATE POWER OF A NUMBER.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=5;
		int i=1;
		int pow=1;
		
		while(i<=2)
		{
			pow=pow*n;
			i++;
		}
		System.out.println(n+" Power is : "+pow);
	}
	
}
