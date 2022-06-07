package String;

public class Test {

	public static void main(String[] args) {
		
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		int i=1;
		int f=1;
		while(n>=i)
		{
			f=f*i;
			i++;
		}
		System.out.println(f);
		
	}
}
