package Assignment;

public class Program65 {

	//-GENERATE FIBONACCI SERIES UPTO 50. 
	
	public static void main(String[] args) {
		
		int n=0,n1=1,n2;
		
		int i=1;
		System.out.print(n+" "+n1+" ");
		while(i<=50)
		{
			n2=n1+n;
			System.out.print(n2+" ");
			n=n1;
			n1=n2;
			i++;
		}
	}
}
