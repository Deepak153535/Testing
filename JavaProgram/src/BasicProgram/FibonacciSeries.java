package BasicProgram;

public class FibonacciSeries {

	//0,1,1,2,3,5,8,13,....
	
	public static void main(String[] args) {
		
		int n=0,n1=1,n2;
		
		System.out.print(n+" "+n1+" ");
		int i=1;
		while(i<10)
		{
			n2=n+n1;
			System.out.print(n2+" ");
			n=n1;
			n1=n2;
			i++;
		}
		
	}
}
