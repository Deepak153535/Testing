package Assignment;

public class Program24 {

	//24.WAP TO SWAP TWO NUMBERS WITHOUT USING TEMP VARIABLE.->IN CLASS
	
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	}
}
