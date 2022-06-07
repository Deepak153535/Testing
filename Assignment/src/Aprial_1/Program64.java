package Aprial_1;

public class Program64 {

	public static void main(String[] args) {
		
		
		int n=0,n1=1,n2=0;
		System.out.print(n+" "+n1);
		for(int i=1;i<=10;i++)
		{
			n2=n+n1;
			System.out.print(" "+n2);
			n=n1;
			n1=n2;
		}
	}
}
