package March31;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int i=3;
		
		System.out.println("Fibonacci series : ");
		System.out.print(a+" " +b+" ");
		while(i<=10)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
	}
}
