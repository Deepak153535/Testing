package march24;

public class Program28 {

	public static void main(String[] args) {
		
		int n=2344;
		int i=1,rem=1,r=0;
		while(i<n)
		{
			rem=n%10;
			r=r*10+rem;
			n=n/10;
			
		}
		System.out.println(r);
	}
}
