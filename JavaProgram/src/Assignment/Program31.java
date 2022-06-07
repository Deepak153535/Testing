package Assignment;

public class Program31 {

	//31.WAP TO CALCULATE POWER OF A NUMBER.->IN CLASS
	
	public static void main(String[] args) {
		
		int a=3;
		int b=2;
		int i=1,pow=1;
		
		while(i<=b)
		{
			pow=pow*a;
			i++;
		}
		System.out.println(a+ " Pow of "+b+" is : "+pow);
	}
}
