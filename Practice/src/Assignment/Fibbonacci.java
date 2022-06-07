package Assignment;

public class Fibbonacci {

	public static void main(String[] args) {
		
		int n=0;
		int n1=1;
		int n2;
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
