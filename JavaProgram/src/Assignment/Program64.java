package Assignment;

public class Program64 {

	//64.WAP TO PRINT FIBONACCI NUMBER SERIES UPTO 10 DIGITS.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=0,n1=1,n2;
		
		System.out.print(n+" "+n1+" ");
		int i=1;
		while(i<=10)
		{
			n2=n+n1;
			System.out.print(n2+" ");
			n=n1;
			n1=n2;
			i++;
		}
	}
}
