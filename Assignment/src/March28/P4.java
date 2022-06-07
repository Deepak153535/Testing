package March28;

public class P4 {

	public static void main(String[] args) {
		
		System.out.println(fun(333,11));
	}
	static int fun(int m,int n)
	{
		while(m>=n)
		{
			m=m-n;
			
		}
		return m;
	}
}
